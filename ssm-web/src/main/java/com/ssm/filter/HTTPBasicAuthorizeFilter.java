package com.ssm.filter;

import com.ssm.constant.Constants;
import com.ssm.enums.ResponseCode;
import com.ssm.pojo.ResponseEntity;
import com.ssm.utils.JWTUtil;
import com.ssm.utils.JsonUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.util.StringUtils;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * API 调用权限控制
 * @author qp
 * @date 2019/5/1
 */
public class HTTPBasicAuthorizeFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		ServletContext context = filterConfig.getServletContext();  
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(context);  
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;  
        httpResponse.setCharacterEncoding("UTF-8");    
        httpResponse.setContentType("application/json; charset=utf-8"); 
        httpResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
        httpResponse.setHeader("Access-Control-Allow-Methods", "*");
        httpResponse.setHeader("Access-Control-Allow-Headers", "Content-Type,Authorization");
        httpResponse.setHeader("Access-Control-Expose-Headers", "*");
        String auth = httpRequest.getHeader(Constants.AUTHORIZATION);

        // 校验是否在白名单中，在白名单中放过
		if (ApiWhiteData.getWhiteApis().contains(httpRequest.getRequestURI())) {
			chain.doFilter(httpRequest, response);
			return;
		}

        // 不在白名单中时，验证TOKEN
		ResponseEntity jwt;
		if (StringUtils.hasText(auth)) {
            jwt = JWTUtil.checkToken(auth);
		} else{
            jwt = new ResponseEntity<>(ResponseCode.TOKEN_NO_AUTH.getCode(), ResponseCode.TOKEN_NO_AUTH.getMessage());
		}

		if (!Constants.RESPONSE_SUCCESS.equals(jwt.getCode())) {
			PrintWriter print = httpResponse.getWriter();
			print.write(JsonUtil.toJson(jwt));
			return;
		}
		
		chain.doFilter(httpRequest, response);
	}
	
	@Override
	public void destroy() {
		
	}

}

package com.ssm.pojo;

/**
 * 需要分页的实体实现此接口
 * @author qp
 * @date 2019/5/1
 */
public interface Pageable {

    /**
     * @param page
     * @return {@link #getPage()}
     */
    Page setPage(Page page);
    Page getPage();
}
package com.ssm.pojo;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * @author qp
 * @date 2019/5/1
 */
public class Entity implements Pageable, Serializable {

    private static final long serialVersionUID = -7208074780550828689L;
    private Page page = null;

    public Page setPage(Page page) {
        this.page = page;
        return this.getPage();
    }

    public Page getPage() {
        return this.page;
    }

    /**
     * @return {@link #getPage()}
     */
    public Page ensurePage() {
        if (null == this.getPage()) {
            this.setPage(new Page());
        }

        return this.getPage();
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
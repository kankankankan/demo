package com.oyqh.model;

/**
 * Created by oyqh on 2016-12-29.
 */
public class TianlianApi {
    private String page;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "TianlianApi{" +
                "page='" + page + '\'' +
                '}';
    }
}

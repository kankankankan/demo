package com.oyqh.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oyqh on 2016-12-29.
 */
public class WebResponseApi<T extends TianlianApi> {

    private String code;

    private String message;

    private List<T> data = new ArrayList<T>();

    private long count;

    public static <T extends TianlianApi> WebResponseApi<T> error(String errorMessage){
        WebResponseApi<T> webResponseApi = new WebResponseApi<T>();
        webResponseApi.setCode("1111");
        webResponseApi.setCount(1);
        webResponseApi.setMessage(errorMessage);
        return webResponseApi;
    }

    public static <T extends TianlianApi> WebResponseApi<T> success(List<T> data,String message){
        WebResponseApi<T> webResponseApi = new WebResponseApi<T>();
        webResponseApi.setCode("0000");
        webResponseApi.setCount(1);
        webResponseApi.setMessage(message);
        webResponseApi.setData(data);
        return webResponseApi;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "WebResponseApi{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", count=" + count +
                '}';
    }
}

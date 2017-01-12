package com.oyqh.controller;

import com.oyqh.model.GoodsSingle;
import com.oyqh.model.WebResponseApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oyqh on 2016-12-29.
 */
@RestController
@RequestMapping("/web")
@Api(value = "/web", description = "請求標準")
public class WebResponseController {

    @GetMapping(value = "/data")
    @ApiOperation(value = "添加數據", notes = "添加數據", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public WebResponseApi<GoodsSingle> getDataList() {
        WebResponseApi<GoodsSingle> webResponseApi = new WebResponseApi<>();
        GoodsSingle goodsSingle1 = new GoodsSingle();
        goodsSingle1.setGoodsPrice("111.11");
        goodsSingle1.setGoodsName("iphone7");
        goodsSingle1.setGoodsId("123456");

        GoodsSingle goodsSingle2 = new GoodsSingle();
        goodsSingle2.setGoodsPrice("2222.11");
        goodsSingle2.setGoodsName("iphone7");
        goodsSingle2.setGoodsId("1qaz2wsx");


        webResponseApi.getData().add(goodsSingle1);
        webResponseApi.getData().add(goodsSingle2);
        webResponseApi.setCode("0000");
        webResponseApi.setCount(1);
        return webResponseApi;
    }

    @GetMapping(value = "/error")
    @ApiOperation(value = "錯誤請求", notes = "錯誤請求", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public WebResponseApi<?> getTest() {
        return WebResponseApi.error("访问失败");
    }

    @GetMapping(value = "/success")
    @ApiOperation(value = "成功請求", notes = "成功請求", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public WebResponseApi<?> getSuccess() {
        WebResponseApi<GoodsSingle> webResponseApi = new WebResponseApi<>();
        GoodsSingle goodsSingle1 = new GoodsSingle();
        goodsSingle1.setGoodsPrice("111.11");
        goodsSingle1.setGoodsName("iphone7");
        goodsSingle1.setGoodsId("123456");

        GoodsSingle goodsSingle2 = new GoodsSingle();
        goodsSingle2.setGoodsPrice("2222.11");
        goodsSingle2.setGoodsName("iphone7");
        goodsSingle2.setGoodsId("1qaz2wsx");


        webResponseApi.getData().add(goodsSingle1);
        webResponseApi.getData().add(goodsSingle2);

        return WebResponseApi.success(webResponseApi.getData(), "成功");
    }

}

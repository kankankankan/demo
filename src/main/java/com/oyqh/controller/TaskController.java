package com.oyqh.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oyqh on 2016-12-26.
 */
@RestController
@RequestMapping("/task")
@Api(value = "/task",description = "任務測試")
public class TaskController {

    @GetMapping(value = "/1")
    @ApiOperation(value = "任務一", notes = "任務一", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiImplicitParam
    public String  test1(){
        try {
           // Thread.sleep(1000*3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("======TaskController===========test1===");
        return "成功";
    }

    @GetMapping(value = "/2")
    @ApiOperation(value = "任務二", notes = "任務二", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String  test2(){
        System.out.println("======TaskController===========test2===");
        return "成功";
    }

}

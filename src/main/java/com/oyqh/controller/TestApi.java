package com.oyqh.controller;

import com.oyqh.model.UserInfo;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by oyqh on 2017-1-5.
 */
@RestController
@RequestMapping(value = "api")
@Api(value = "/api", description = "用户相关的api")
public class TestApi {

    @GetMapping("query_userInfo")
    @ApiOperation(value = "查找用户", notes = "查看用户", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiImplicitParams({@ApiImplicitParam(name = "userId", value = "唯一id", required = true, dataType = "Long", paramType = "query"),
            @ApiImplicitParam(name = "username", value = "用戶名", required = true, dataType = "String", paramType = "query")
    }
    )
    public UserInfo queryUserInfo(String userId, String username) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(userId);
        userInfo.setName(username);
        userInfo.setAge("18");
        userInfo.setSex(true);
        return userInfo;
    }

    @PostMapping("/save_userInfo")
    @ApiOperation(value = "添加用户", notes = "添加用户", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String saveUserInfo(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        return userInfo.toString();
    }


}

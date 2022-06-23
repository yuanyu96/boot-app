package com.yuanyu.bootapp.controller;

import com.yuanyu.bootapp.common.ResponseData;
import com.yuanyu.bootapp.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller
 *
 * @author yuanyu
 * @date 2022/6/23
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public ResponseData hello(){
        User user = new User();
        user.setId(1);
        user.setName("张三");
        return ResponseData.success(user);
    }

}

package com.yf.service;

import com.yf.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "baidu-provider",fallback = UserServiceErro.class)
public interface UserServiceFeign {
    //测试框架是否可用
    @GetMapping("test")
    void test();

    //熔断器
    @GetMapping("findUserList")
    List<User> findUserList();
    @GetMapping("getUserName")
    String getUserName();
}

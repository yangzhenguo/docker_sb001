package com.hiyzg.docker_sb001.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sam
 * @date 2022/5/29 4:36 PM
 */
@RestController
public class Home {
    @GetMapping("/")
    public String index() {
        return "hello";
    }
}

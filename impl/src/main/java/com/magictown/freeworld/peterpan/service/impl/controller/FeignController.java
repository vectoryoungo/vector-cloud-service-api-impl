/**
 * @create 2019-08-06 09:22
 * @desc impl fein controller
 **/
package com.magictown.freeworld.peterpan.service.impl.controller;

import com.asia.stupid.fucking.shit.api.pojo.UserFeignPOJO;
import com.magictown.freeworld.peterpan.service.impl.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/testCall")
    public List<String> testCall() {
        return feignService.testCall();
    }
    @GetMapping("/get")
    public UserFeignPOJO getByID(@RequestParam("id") Long id) {
        return feignService.getByID(id);
    }
    @PostMapping("/get")
    public UserFeignPOJO getByIdPost(@RequestBody Long id){
        return feignService.getByIdPost(id);
    }
    @PostMapping("/add")
    public UserFeignPOJO add(Long id, String name){
        return feignService.add(id,name);
    }
    @PostMapping("/addJson")
    public UserFeignPOJO add(@RequestBody UserFeignPOJO userFeignPOJO) {
        return feignService.add(userFeignPOJO);
    }

}


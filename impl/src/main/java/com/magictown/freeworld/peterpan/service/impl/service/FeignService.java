/**
 * @create 2019-08-06 09:23
 * @desc feign service
 **/
package com.magictown.freeworld.peterpan.service.impl.service;

import com.asia.stupid.fucking.shit.api.pojo.UserFeignPOJO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class FeignService implements com.asia.stupid.fucking.shit.api.service.UserFeignService {

    @Override
    public List<String> testCall() {

        List<String> response = new ArrayList<>(16);
        response.add("Quick");
        response.add("response");
        return response;
    }

    @Override
    public UserFeignPOJO getByID(Long aLong) {

        System.out.println("this is getByID ");
        return new UserFeignPOJO(aLong,"getByID");
    }

    @Override
    public UserFeignPOJO getByIdPost(@RequestBody Long id) {
        System.out.println(" this is getByIDPost");
        return new UserFeignPOJO(id,"getByIdPost");
    }

    @Override
    public UserFeignPOJO add(Long id, String name) {
        System.out.println("this is add ");
        return new UserFeignPOJO(id,name);
    }

    @Override
    public UserFeignPOJO add(@RequestBody UserFeignPOJO userFeignPOJO) {
        System.out.println("this is add with json");
        return userFeignPOJO;
    }
}


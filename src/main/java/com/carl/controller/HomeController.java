package com.carl.controller;

import com.carl.entity.pojo.Petgoods;
import com.carl.service.HomeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangtao
 * @Title:
 * @Package: com.carl.controller
 * @Description: 首页商品列表接口
 * @date 2/8/22 8:48 PM
 */
@Slf4j
@RequestMapping("/api/")
@RestController
@ResponseBody
public class HomeController {
    @Autowired
    private HomeService homeService;
    public String getGoodList() {
        return null;
    }

    @RequestMapping("findTest")
    public Petgoods selectByPrimaryKey(){
        return homeService.selectByPrimaryKey(1);
    }
}

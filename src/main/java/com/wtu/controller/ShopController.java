package com.wtu.controller;

import com.wtu.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    ShopService shopService;
    @RequestMapping("seleteAll")
    public List<Map<String,Object>> seleteShopAll(){

        return null;
    }
}

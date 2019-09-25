package com.wtu.service.impl;

import com.wtu.dao.ShopMapper;
import com.wtu.pojo.User;
import com.wtu.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    ShopMapper shopMapper;
    public List<Map<String, Object>> seleteShop() {
        return shopMapper.seleteShop();
    }

    public void insertShop(User user) {
        System.out.println(user.getUsername());
shopMapper.insertShop(user);
    }
}

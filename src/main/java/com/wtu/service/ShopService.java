package com.wtu.service;

import com.wtu.pojo.User;

import java.util.List;
import java.util.Map;

public interface ShopService {
    List<Map<String,Object>> seleteShop();
    void insertShop(User user);
}

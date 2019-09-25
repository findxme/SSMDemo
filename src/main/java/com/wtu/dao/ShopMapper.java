package com.wtu.dao;

import com.wtu.pojo.User;

import java.util.List;
import java.util.Map;

public interface ShopMapper {
    List<Map<String,Object>> seleteShop();
    void insertShop(User user);

}

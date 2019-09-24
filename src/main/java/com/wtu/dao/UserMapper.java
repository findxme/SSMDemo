package com.wtu.dao;

import com.wtu.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<Map<String,Object>> seleteUser();
    void insertUser(User user);
}

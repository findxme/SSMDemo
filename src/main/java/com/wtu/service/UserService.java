package com.wtu.service;

import com.wtu.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface UserService {
    List<Map<String,Object>> seleteUser();
    void insertUser(User user);
}

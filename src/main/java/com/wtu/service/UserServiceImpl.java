package com.wtu.service;

import com.wtu.dao.UserMapper;
import com.wtu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserMapper userMapper;
    public List<Map<String, Object>> seleteUser() {


        return userMapper.seleteUser();
    }

    public void insertUser(User user) {

        userMapper.insertUser(user);
    }
}

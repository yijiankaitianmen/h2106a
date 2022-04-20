package com.usian.interfaceimel;

import com.usian.mapper.UserMapper;
import com.usian.pojo.User;
import com.usian.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimel implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> fiandpage() {
        return  userMapper.fiandpage();
    }

    @Override
    public void add(String zhanghao) {
        User user = new User();
        user.setZhanghao(zhanghao);
       userMapper.add(user);

    }
}

package com.usian.service;


import com.usian.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {


    List<User> fiandpage();

    void add(String zhanghao);

}

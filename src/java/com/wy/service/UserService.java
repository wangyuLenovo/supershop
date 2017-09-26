package com.wy.service;

import com.wy.dao.UserTMapper;
import com.wy.domain.UserT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserTMapper userTMapper;

    public UserT getUser() {
        UserT userT = userTMapper.selectByPrimaryKey(1);
       // UserT userT = new UserT();

        userT.setUserName("wy");
        return userT;

    }
}

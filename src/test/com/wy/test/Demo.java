package com.wy.test;


import com.wy.domain.UserT;
import com.wy.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext_dao.xml"})
public class Demo {
    private static Logger logger = Logger.getLogger(Demo.class);
    private ApplicationContext ac=null;
    @Autowired
    private UserService userService;

    @Before
    public void before() {
       ac=new ClassPathXmlApplicationContext("applicationContext_dao.xml");
       userService=(UserService)ac.getBean("userService");
    }

    @Test
    public  void getUser(){
        UserT user = userService.getUser();
        System.out.println("name"+user.getUserName());

    }




}

<<<<<<< HEAD
package com.gms;

import com.gms.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class userMapperTest {

    @Autowired
    com.gms.mapper.UserMapper userMapper;
    private List<User> userList;


    @Test
    public void getAllUser() throws  Exception{
//        userList = userMapper.login("");
//        System.out.println(userList.get(0).getUsername());
    }
=======
package com.gms;

import com.gms.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class userMapperTest {

    @Autowired
    com.gms.mapper.UserMapper userMapper;
    private List<User> userList;


    @Test
    public void getAllUser() throws  Exception{
        userList = userMapper.getAllUser();
        System.out.println(userList.get(0).getUsername());
    }
>>>>>>> 58248319abf333514f57536260390a76af4bd1fe
}
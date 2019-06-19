package cn.itcast.service.impl;

import cn.itcast.domain.User;
import cn.itcast.mapper.UserMapper;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * describe:
 *
 * @author stone
 * @date 2019/01/16
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    public List<User> findAll() {
        System.out.println("查询所有");

        return userMapper.findAll();
    }
}

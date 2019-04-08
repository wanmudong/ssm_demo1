package io.github.wanmudong.service.impl;

import io.github.wanmudong.mapper.UserMapper;
import io.github.wanmudong.pojo.User;
import io.github.wanmudong.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wanmudong
 * @date 13:51 2019/4/8
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAll() throws Exception {
        List<User> list = userMapper.getAll();
        return list;
    }
}

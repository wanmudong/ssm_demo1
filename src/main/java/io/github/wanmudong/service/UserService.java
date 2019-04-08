package io.github.wanmudong.service;

import io.github.wanmudong.pojo.User;

import java.util.List;

/**
 * @author wanmudong
 * @date 13:50 2019/4/8
 */
public interface UserService {

    public List<User> getAll() throws Exception;
}

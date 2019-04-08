package io.github.wanmudong.mapper;

import io.github.wanmudong.pojo.User;

import java.util.List;

/**
 * @author wanmudong
 * @date 13:49 2019/4/8
 */
public interface UserMapper {

    public List<User> getAll() throws Exception;
}

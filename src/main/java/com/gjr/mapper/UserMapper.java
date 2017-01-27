package com.gjr.mapper;

import com.gjr.po.User;

/**
 * Created by Brian on 2016/2/24.
 */
public interface UserMapper {

    //根据id查询用户信息
    User findUserById(int id);

}

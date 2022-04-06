package com.find.community.dao;

import com.find.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author find
 * @date 2022/4/5 20:15
 */
@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id,int status);

    int updateHeader(int id,String headerUrl);

    int updatePassword(int id,String password);
}

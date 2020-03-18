package com.bjsxt.mapper;

import com.bjsxt.pojo.Users;
import org.apache.ibatis.annotations.Insert;

/**
 * @Auther:智恒
 * @Date:2020/2/12
 * @Description:com.bjsxt.mapper
 * @version:1.0
 */
public interface UsersMapper {
    @Insert("insert into Users values(default,#{username},#{password},#{photo})")
    int insUsers(Users users);
}

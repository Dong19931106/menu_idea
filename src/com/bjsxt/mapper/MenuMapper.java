package com.bjsxt.mapper;

import com.bjsxt.pojo.Menu;

import java.util.List;

/**
 * @Auther:智恒
 * @Date:2020/2/11
 * @Description:com.bjsxt.mapper
 * @version:1.0
 */
public interface MenuMapper {
    List<Menu> selByPid(int pid);
}

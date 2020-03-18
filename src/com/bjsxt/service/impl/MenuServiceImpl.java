package com.bjsxt.service.impl;

import com.bjsxt.mapper.MenuMapper;
import com.bjsxt.pojo.Menu;
import com.bjsxt.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:智恒
 * @Date:2020/2/11
 * @Description:com.bjsxt.service.impl
 * @version:1.0
 */
@Service
public class MenuServiceImpl implements MenuService{
    @Resource
    private MenuMapper menuMapper;
    @Override
    public List<Menu> show() {
        return menuMapper.selByPid(0);
    }
}

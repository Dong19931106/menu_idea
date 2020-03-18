package com.bjsxt.service.impl;

import com.bjsxt.mapper.FilesMapper;
import com.bjsxt.pojo.Files;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.FilesService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:智恒
 * @Date:2020/2/12
 * @Description:com.bjsxt.service.impl
 * @version:1.0
 */
@Service
public class FilesServiceImpl implements FilesService{
    @Resource
    private FilesMapper filesMapper;

    @Override
    public int updFiles(int id, Users users, String name) {
        Logger logger = Logger.getLogger(FilesServiceImpl.class);
        logger.info(users.getUsername()+"下载了"+name);
        return filesMapper.updCount(id);
    }

    @Override
    public List<Files> selFiles() {
        return filesMapper.selAll();

    }
}

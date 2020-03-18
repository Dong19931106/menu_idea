package com.bjsxt.service;

import com.bjsxt.pojo.Files;
import com.bjsxt.pojo.Users;

import java.util.List;

/**
 * @Auther:智恒
 * @Date:2020/2/12
 * @Description:com.bjsxt.service
 * @version:1.0
 */
public interface FilesService {
    List<Files> selFiles();
    int updFiles(int id, Users users,String name);
}

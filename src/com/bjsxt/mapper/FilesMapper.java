package com.bjsxt.mapper;

import com.bjsxt.pojo.Files;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Auther:智恒
 * @Date:2020/2/12
 * @Description:com.bjsxt.mapper
 * @version:1.0
 */
public interface FilesMapper {
    @Select("select * from files")
    List<Files> selAll();
    @Update("update files set count=count+1 where id=#{0}")
    int updCount(int id);
}

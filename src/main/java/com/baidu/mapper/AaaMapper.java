package com.baidu.mapper;

import com.baidu.pojo.Aaa;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AaaMapper {
    List<Aaa> find();
    int delete(@Param("id") int id);
    int insert(Aaa aaa);
    int update(Aaa aaa);
    List<Aaa> findid(@Param("id") int id);
    List<Aaa> findlike(@Param("str") String str);
}

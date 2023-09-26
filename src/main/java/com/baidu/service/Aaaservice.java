package com.baidu.service;

import com.baidu.pojo.Aaa;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Aaaservice {

    int delete(@Param("id") int id);

    List<Aaa> find();
    int insert(Aaa aaa);
    int update(Aaa aaa);
    List<Aaa> findid(@Param("id") int id);

    List<Aaa> findlike(@Param("str") String str);
}

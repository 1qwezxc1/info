package com.baidu.service;

import com.baidu.mapper.AaaMapper;
import com.baidu.pojo.Aaa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AaaserviceImpl implements Aaaservice{
    @Autowired
    private AaaMapper  aaaMapper;

    @Override
    public int delete(int id) {
        return aaaMapper.delete(id);
    }

    @Override
    public List<Aaa> find() {
        return aaaMapper.find();
    }

    @Override
    public int insert(Aaa aaa) {
        return aaaMapper.insert(aaa);
    }

    @Override
    public int update(Aaa aaa) {
        return aaaMapper.update(aaa);
    }

    @Override
    public List<Aaa> findid(int id) {
        return aaaMapper.findid(id);
    }

    @Override
    public List<Aaa> findlike(String str) {
        return aaaMapper.findlike(str);
    }
}

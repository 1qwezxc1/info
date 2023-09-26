package com.baidu.text;

import com.baidu.pojo.Aaa;
import com.baidu.service.AaaserviceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class text {
    public static void main(String[] args) throws ParseException {
        ApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        AaaserviceImpl dao = (AaaserviceImpl) ca.getBean("aaaserviceImpl");
//        System.out.println(dao);
//        System.out.println(dao.findaaa());

//        int id=1;
//        int delete = dao.delete(id);
//        System.out.println(delete);
//
//        Aaa aaa =(Aaa) ca.getBean("aaa");
//        aaa.setId(1);
//        aaa.setName("苹果");
//        aaa.setSal(2000000);
//        String dat="2020-05-07";
//        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
//        Date date = sd.parse(dat);
//        aaa.setDate(date);
//
//        int insert = dao.insert(aaa);
//        System.out.println(aaa.getDate()+"-"+aaa.getId()+"-"+aaa.getName()+"-"+aaa.getSal());
//        System.out.println(insert);

//        String dat="1999-09-11";
//        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
//        Date parse = sd.parse(dat);
//        Aaa aaa=new Aaa(1,"芒果",1000000,parse);
//        int update = dao.update(aaa);
//        System.out.println(update);

//mybatis查询        List<Aaa> aaas = dao.find();
//        System.out.println(aaas);
//
// mybatis删除       int delete = dao.delete(1);
//        System.out.println(delete);

// mybatis新增       String dat="1999-09-11";
//        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
//        Date parse = sd.parse(dat);
//        Aaa aaa=new Aaa(1,"芒果",1000000,parse);
//        int insert = dao.insert(aaa);
//        System.out.println(insert);

//  mybatis修改      String dat="1999-09-11";
//        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
//        Date parse = sd.parse(dat);
//        Aaa aaa=new Aaa(1,"芒果",582654,parse);
//        int update = dao.update(aaa);
//        System.out.println(update);

// mybatis根据id查询         int id=1;
//        List<Aaa> findid = dao.findid(id);
//        System.out.println(findid);

//mybatis模糊查询
        String str="子";
        List<Aaa> findlike = dao.findlike(str);
        System.out.println(findlike);
    }
}

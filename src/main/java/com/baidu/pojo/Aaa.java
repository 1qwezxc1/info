package com.baidu.pojo;

import java.util.Date;

public class Aaa {
    private int id;
    private String name;
    private int sal;
    private Date date;

    public Aaa(int id, String name, int sal, Date date) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.date = date;
    }

    public Aaa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                ", date=" + date +
                '}';
    }
}

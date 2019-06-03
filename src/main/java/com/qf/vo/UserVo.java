package com.qf.vo;

public class UserVo {
    int ids[];
    String parrent;
    int age;
    int id;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getParrent() {
        return parrent;
    }

    public void setParrent(String parrent) {
        this.parrent = parrent;
    }

    public int[] getIds() {
        return ids;
    }

    public void setIds(int[] ids) {
        this.ids = ids;
    }
}

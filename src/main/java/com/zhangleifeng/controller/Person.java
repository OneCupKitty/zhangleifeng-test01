package com.zhangleifeng.controller;

/**
 * @program: workspaceForGit
 * @description: persion
 * @author: Zhang_Leifeng
 * @create: 2022-07-03 10:23
 **/
public class Person {
    private String id;
    private String name;
    private String loc;
    private String age;

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }

    public Person(String id, String name, String loc) {
        this.id = id;
        this.name = name;
        this.loc = loc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

package com.yyyu.spring.pojo;

import java.util.Date;
import java.util.List;

/**
 * 功能：User Bean
 *
 * @author yu
 * @date 2017/6/22.
 */
public class User {

    private int id;
    private String username;// 用户姓名
    private String sex;// 性别
    private Date birthday;// 生日
    private String address;// 地址

    private List<String> tags;

    public User() {

    }

    public void init(){
        System.out.println("init-method===============");
    }

    public void destroy(){
        System.out.println("destroy-method===============");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "user_id："+id+"   username："+username+"  sex："+sex+"  birthday："+birthday+"  address："+address;
    }
}

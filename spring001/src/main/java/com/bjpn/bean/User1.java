package com.bjpn.bean;


import org.springframework.stereotype.Component;

import java.util.Objects;

//@Component("ux")
//不写默认是类名的驼峰式
@Component
public class User1 {
    private int uid;
    private String uname;
    private String upwd;
    private String ucode;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User1 user1 = (User1) o;
        return uid == user1.uid &&
                Objects.equals(uname, user1.uname) &&
                Objects.equals(upwd, user1.upwd);
    }

    @Override
    public String toString() {
        return "User1{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", ucode='" + ucode + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, uname, upwd);
    }

    public User1(int uid, String uname, String upwd, String ucode) {
        this.uid = uid;
        this.uname = uname;
        this.upwd = upwd;
        this.ucode = ucode;
    }

    public User1(){}

}

package com.zking.flightcommon.entity;

public class User {
    private Integer uid;

    private String username;

    private String password;

    private String salt;

    private Integer useFlag;

    public User(Integer uid, String username, String password, String salt, Integer useFlag) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.useFlag = useFlag;
    }

    public User() {
        super();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }
}
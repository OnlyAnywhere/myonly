package com.entity;

import com.core.BaseEntity;

import java.util.Date;
import java.util.List;

public class User extends BaseEntity {


    private static final long serialVersionUID = 9163182179040896263L;
    //实体类的属性和表的字段名称一一对应
    private Integer id;
    private String username;
    private String email;
    private String telephone;
    private String website;
    private String profile;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}

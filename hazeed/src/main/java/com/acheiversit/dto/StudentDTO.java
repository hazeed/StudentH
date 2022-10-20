package com.acheiversit.dto;

import org.springframework.web.util.pattern.PathPattern;

public class StudentDTO {
    private int id;
    private String name;
    private int claSS;
    private String mobile;

    public StudentDTO() {
    }

    public StudentDTO(int id, String name, int claSS, String mobile) {
        this.id = id;
        this.name = name;
        this.claSS = claSS;
        this.mobile = mobile;
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

    public int getClaSS() {
        return claSS;
    }

    public void setClaSS(int claSS) {
        this.claSS = claSS;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", claSS=" + claSS +
                ", mobile='" + mobile + '\'' +
                '}';
    }

}

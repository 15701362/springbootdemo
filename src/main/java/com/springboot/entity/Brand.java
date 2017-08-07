package com.springboot.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Brand {
    private Long id;
    private Date createdate;
    private Date modifydate;
    private String name;
}
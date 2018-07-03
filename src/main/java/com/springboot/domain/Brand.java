package com.springboot.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Brand {
    private Long id;
    private Date createDate;
    private Date modifyDate;
    private String chineseDame;
    private String englishDame;
    private String desc;
    private String logo;
    private Integer type;
    private String url;
    private String story;
    private Integer status;
}
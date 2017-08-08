package com.springboot.controller;

import com.config.mybatis.MyBatisConfig;
import com.springboot.entity.Brand;
import com.springboot.service.BrandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

@RestController
//@EnableAutoConfiguration
@RequestMapping("/brand")
public class BrandController {
    private static final Logger logger = LoggerFactory.getLogger(BrandController.class);

    @Resource(name = "brandServiceImpl")
    private BrandService brandService;

    @GetMapping("/{id}")
    public Brand view(@PathVariable("id") Long id){
       Brand brand = brandService.selectByPrimaryKey(id);
        return brand;
    }

}

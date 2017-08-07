package com.springboot.controller;

import com.config.mybatis.MyBatisConfig;
import com.springboot.entity.Brand;
import com.springboot.service.BrandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
//@EnableAutoConfiguration
@RequestMapping("/brand")
public class BrandController {
    private static final Logger logger = LoggerFactory.getLogger(BrandController.class);

    @Resource(name = "brandServiceImpl")
    private BrandService brandService;

    @RequestMapping("/{id}")
    public Brand view(@PathVariable("id") Long id){
       logger.info("============"+id.toString());
       Brand brand = brandService.selectByPrimaryKey(id);
        return brand;
    }

    //测试restfull风格api，多个参数的接收
    @RequestMapping("/test/{id}/{name}")
    public Brand test(@PathVariable("id") Long id,@PathVariable("name") String name){
//        Brand brand = brandService.selectByPrimaryKey(1L);
        Brand brand2 = new Brand();
        brand2.setId(id);
        brand2.setCreatedate(new Date());
        brand2.setModifydate(new Date());
        brand2.setName(name);
        return brand2;
    }
}

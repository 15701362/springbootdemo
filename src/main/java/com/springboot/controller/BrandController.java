package com.springboot.controller;

import com.springboot.entity.Brand;
import com.springboot.service.BrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(value="品牌controller")
@RestController
//@EnableAutoConfiguration
@RequestMapping("/brand")
public class BrandController {
    private static final Logger logger = LoggerFactory.getLogger(BrandController.class);

    @Resource(name = "brandServiceImpl")
    private BrandService brandService;

    @ApiOperation(value="根据id获得品牌实体")
    @GetMapping("/{id}")
    public Brand view(@PathVariable("id") Long id){
       Brand brand = brandService.selectByPrimaryKey(id);
        return brand;
    }

}

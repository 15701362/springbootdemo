package com.springboot.controller;

import com.springboot.domain.Brand;
import com.springboot.service.BrandService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Resource(name = "brandServiceImpl")
    private BrandService brandService;

    @ApiOperation(value="根据id获得用户", notes="备注") //swagger 文档
    @GetMapping("/{id}")
    public Brand view(@PathVariable("id") Long id){
        return brandService.selectByPrimaryKey(id);
    }

}

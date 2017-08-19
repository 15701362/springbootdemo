package com.springboot.service.impl;

import com.springboot.domain.Brand;
import com.springboot.mapper.BrandMapper;
import com.springboot.service.BrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("brandServiceImpl")
public class BrandServiceImpl implements BrandService {

    @Resource
    private BrandMapper brandMapper;

    @Override
    public Brand selectByPrimaryKey(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer add(Brand brand) {
        return brandMapper.add(brand);
    }
}

package com.springboot.service.impl;

import com.springboot.dao.BrandDao;
import com.springboot.entity.Brand;
import com.springboot.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("brandServiceImpl")
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandDao brandDao;
    @Override
    public Brand selectByPrimaryKey(Long id) {
        return brandDao.selectByPrimaryKey(id);
    }
}

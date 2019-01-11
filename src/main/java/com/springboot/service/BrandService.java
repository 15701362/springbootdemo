package com.springboot.service;

import com.springboot.domain.Brand;

public interface BrandService {
    Brand selectByPrimaryKey(Long id);

    Integer add(Brand brand);
}

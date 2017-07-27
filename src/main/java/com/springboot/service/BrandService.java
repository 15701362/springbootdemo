package com.springboot.service;

import com.springboot.entity.Brand;
import org.springframework.stereotype.Service;

public interface BrandService {
    Brand selectByPrimaryKey(Long id);
}

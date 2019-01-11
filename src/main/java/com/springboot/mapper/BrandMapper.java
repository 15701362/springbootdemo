package com.springboot.mapper;

import com.springboot.domain.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository //@Repository用于标注数据访问组件，即DAO组件
public interface BrandMapper {
    @Select({"SELECT id,createDate,modifyDate,chineseName FROM b_brand WHERE id=#{id}"})
    Brand selectByPrimaryKey(Long id);

    @Insert({"INSERT INTO b_brand(createDate,modifyDate,categoryId,chineseName,englishName,`desc`,logo,`type`,url,story,`status`) " +
            "VALUES (#{createDate},#{modifyDate},#{categoryId},#{chineseName},#{englishName},#{desc},#{logo}" +
            "#{type},#{url},#{story,#{status})"})
    Integer add(Brand brand);
}
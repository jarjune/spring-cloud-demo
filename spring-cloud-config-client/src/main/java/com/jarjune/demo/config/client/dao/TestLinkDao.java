package com.jarjune.demo.config.client.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestLinkDao {

    @Select("select 1")
    int testSelect();
}

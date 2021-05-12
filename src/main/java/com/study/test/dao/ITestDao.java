package com.study.test.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper // mapper를 잡는 건 mybatis
public interface ITestDao {
	public String test();
}

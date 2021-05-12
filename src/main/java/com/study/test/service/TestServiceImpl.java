package com.study.test.service;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.study.test.dao.ITestDao;

@Service
public class TestServiceImpl implements ITestService {
	@Inject
	ITestDao testDao;
	
	@Override
	public String test() {
		return testDao.test();
	}
}

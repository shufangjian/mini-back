package com.guoguo.service.impl;

import com.guoguo.dao.TestDao;
import com.guoguo.entity.TestEntity;
import com.guoguo.service.TestService;
import org.hswebframework.web.id.IDGenerator;
import org.hswebframework.web.service.GenericEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends GenericEntityService<TestEntity,String>
        implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    protected IDGenerator<String> getIDGenerator() {
        return IDGenerator.MD5;
    }

    @Override
    public TestDao getDao() {
        return testDao;
    }
}
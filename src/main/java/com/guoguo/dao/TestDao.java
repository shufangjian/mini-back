package com.guoguo.dao;

import com.guoguo.entity.TestEntity;
import org.hswebframework.web.dao.CrudDao;
import org.springframework.stereotype.Component;

/**
 * @author shu.fangjian
 * @since 1.0
 */

public interface TestDao extends CrudDao<TestEntity,String> {

}

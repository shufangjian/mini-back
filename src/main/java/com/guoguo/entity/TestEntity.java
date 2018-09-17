package com.guoguo.entity;

import lombok.Getter;
import lombok.Setter;
import org.hswebframework.web.commons.entity.SimpleGenericEntity;

/**
 * @author shu.fangjian
 * @since 1.0
 */
@Getter
@Setter
public class TestEntity  extends SimpleGenericEntity<String> {
    private String name;

    private Byte status;

    private String comment;
}
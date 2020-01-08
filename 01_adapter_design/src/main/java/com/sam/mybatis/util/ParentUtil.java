package com.sam.mybatis.util;

import com.sam.mybatis.service.ISchool;

/**
 * @author Mr.xuewenming
 * @title: ParentUtil
 * @projectName KB
 * @description: TODO
 * @date 2020/1/89:33
 */
public abstract class ParentUtil implements ISchool {

    @Override
    public void work() {
        System.out.println("家长实现工作。。。。");
    }
}

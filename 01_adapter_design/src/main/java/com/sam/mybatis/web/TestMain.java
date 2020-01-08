package com.sam.mybatis.web;

import com.sam.mybatis.service.ISchool;
import com.sam.mybatis.serviceImpl.Student2;

/**
 * @author Mr.xuewenming
 * @title: TestMain
 * @projectName KB
 * @description: TODO
 * @date 2020/1/89:49
 */
public class TestMain {
    public static void main(String[] args) {
        ISchool school = new Student2();
        school.work();
    }
}

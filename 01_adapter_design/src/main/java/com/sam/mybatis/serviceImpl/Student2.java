package com.sam.mybatis.serviceImpl;

import com.sam.mybatis.util.ParentUtil;
import org.springframework.stereotype.Service;

/**
 * @author Mr.xuewenming
 * @title: Study02
 * @projectName KB
 * @description: TODO
 * @date 2020/1/89:32
 */
@Service("student2")
public class Student2 extends ParentUtil {

    @Override
    public void study() {
        System.out.println("学生实现学习。。。");
    }
}

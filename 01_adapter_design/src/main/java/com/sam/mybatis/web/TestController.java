package com.sam.mybatis.web;

import com.sam.mybatis.service.ISchool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr.xuewenming
 * @title: TestController
 * @projectName KB
 * @description: TODO
 * @date 2020/1/89:37
 */
@RestController
@RequestMapping("/adapter")
public class TestController {

    @Autowired @Qualifier("student2")
    private ISchool school;
    @GetMapping("/test")
    public void test() {
        school.study();
    }

}

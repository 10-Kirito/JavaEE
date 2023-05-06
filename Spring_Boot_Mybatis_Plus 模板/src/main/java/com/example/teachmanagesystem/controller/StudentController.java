package com.example.teachmanagesystem.controller;


import com.example.teachmanagesystem.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Kirito
 * @since 2023-04-04
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    IStudentService iStudentService;


    @GetMapping
    public String test(){
        return (String) iStudentService.findAll();
    }


}

package com.gg.feigh.impl;

import com.gg.entity.Student;
import com.gg.feigh.FeignProviderClient;

import java.util.Collection;

public class FeignError implements FeignProviderClient {
    public Collection<Student> findAll() {
        return null;
    }

    public String index() {
        return "服务器维护中......";
    }
}

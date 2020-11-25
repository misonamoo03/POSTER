package com.example.poster.controller;

import com.example.poster.domain.Category;
import com.example.poster.domain.Poster;
import com.example.poster.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ApiController {

    @Autowired
    ApiService apiService;

    @GetMapping("/api/category")
    @ResponseBody
    public Map<String, Object> posterCategories() {
        Map<String,Object> cateMap = new HashMap<>();
        List<Category> list = new ArrayList<>();
        list = apiService.findCategories();
        cateMap.put("category",list);
        return cateMap;
    }

    @GetMapping("/api/main")
    public Map<String, Object> posterMain() {
        Map<String,Object> mainMap = new HashMap<>();
        List<Poster> list = new ArrayList<>();
        list = apiService.findPosterMains();
        mainMap.put("main",list);
        return mainMap;
    }
}
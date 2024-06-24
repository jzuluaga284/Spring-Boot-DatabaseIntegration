package com.example.demo.controller;

import com.example.demo.entity.MySql.TestMySql;
import com.example.demo.repository.MySql.TestMySqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/test")
public class TestMySqlController {

    @Autowired
    public TestMySqlRepository testRepository;

    @GetMapping("/All")
    public ResponseEntity<List<TestMySql>> test(){
        return ResponseEntity.ok(testRepository.findAll());
    }

    @PostMapping("/add")
    public ResponseEntity<TestMySql> add(@RequestBody TestMySql prueba){
        return ResponseEntity.ok(testRepository.save(prueba));
    }
}

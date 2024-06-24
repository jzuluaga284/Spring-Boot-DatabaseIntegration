package com.example.demo.controller;

import com.example.demo.entity.postgres.TestPostgres;
import com.example.demo.repository.postgres.TestPostgresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/testPostgres")
public class TestPostgresController {

    @Autowired
    public TestPostgresRepository pruebaPosrgesRepository;

    @GetMapping("/All")
    public ResponseEntity<List<TestPostgres>> test(){
        return ResponseEntity.ok(pruebaPosrgesRepository.findAll());
    }

    @PostMapping("/add")
    public ResponseEntity<TestPostgres> add(@RequestBody TestPostgres prueba){
        return ResponseEntity.ok(pruebaPosrgesRepository.save(prueba));
    }
}

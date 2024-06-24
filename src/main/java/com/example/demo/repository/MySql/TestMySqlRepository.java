package com.example.demo.repository.MySql;

import com.example.demo.entity.MySql.TestMySql;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestMySqlRepository extends JpaRepository<TestMySql, Integer> {
}

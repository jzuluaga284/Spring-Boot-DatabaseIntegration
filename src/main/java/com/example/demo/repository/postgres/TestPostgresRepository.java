package com.example.demo.repository.postgres;

import com.example.demo.entity.postgres.TestPostgres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestPostgresRepository extends JpaRepository<TestPostgres,Integer> {
}

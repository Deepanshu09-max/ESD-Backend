package com.example.jpas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.jpas.domain;

public interface DomainRepo extends JpaRepository<domain,Integer> {
}

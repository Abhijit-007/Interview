package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Deal;

@Repository
public interface DealRepo extends JpaRepository<Deal, Integer>{

}

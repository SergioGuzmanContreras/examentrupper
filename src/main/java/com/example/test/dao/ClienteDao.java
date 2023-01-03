package com.example.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.dao.entity.Cliente;

public interface ClienteDao extends JpaRepository<Cliente, Integer> {

}

package com.example.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.dao.entity.Producto;

public interface ProductoDao extends JpaRepository<Producto, Integer> {

}

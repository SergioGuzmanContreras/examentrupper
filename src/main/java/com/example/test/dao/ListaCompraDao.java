package com.example.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.dao.entity.ListaCompra;

public interface ListaCompraDao extends JpaRepository<ListaCompra, Integer> {

}

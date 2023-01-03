package com.example.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.dao.entity.ListaCompra;
import com.example.test.dao.entity.ListaCompraDetalle;

public interface ListaCompraDetalleDao extends JpaRepository<ListaCompraDetalle, Integer> {

	List<ListaCompraDetalle> findByCompra(ListaCompra compra);
}

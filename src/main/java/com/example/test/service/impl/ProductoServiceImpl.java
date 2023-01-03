package com.example.test.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.test.dao.ClienteDao;
import com.example.test.dao.ListaCompraDao;
import com.example.test.dao.ListaCompraDetalleDao;
import com.example.test.dao.ProductoDao;
import com.example.test.dao.entity.ListaCompra;
import com.example.test.dao.entity.ListaCompraDetalle;
import com.example.test.models.request.ListaRequest;
import com.example.test.models.response.ListaResponse;
import com.example.test.service.ProductoService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoServiceImpl implements ProductoService{

	private final ListaCompraDao listaCompra;
	private final ListaCompraDetalleDao listaCompraDetalle;
	private final ClienteDao cliente;
	private final ProductoDao producto;

	@Override
	public ListaResponse crearLista(ListaRequest request) {
		return null;	
	}

	@Override
	public ListaResponse modificarLista(ListaRequest request) {
		return null;
	}

	@Override
	public List<ListaResponse> obtenerListaCompras(Integer idCliente) {
		List<ListaResponse> response = new ArrayList<>();
		
		return response;
	}

	@Override
	public void eliminarListaDeCompras(String nombreLista) {
		ListaCompra lista = this.listaCompra.findBynombre(nombreLista);
		List<ListaCompraDetalle> listaDetalle = this.listaCompraDetalle.findByCompra(lista);
		this.listaCompraDetalle.deleteAll(listaDetalle);
		this.listaCompra.delete(lista);
	}
	

}

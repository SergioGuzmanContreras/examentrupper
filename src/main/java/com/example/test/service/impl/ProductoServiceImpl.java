package com.example.test.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.test.dao.ClienteDao;
import com.example.test.dao.ListaCompraDao;
import com.example.test.dao.ListaCompraDetalleDao;
import com.example.test.dao.ProductoDao;
import com.example.test.dao.entity.ListaCompra;
import com.example.test.models.request.ListaRequest;
import com.example.test.models.response.ListaResponse;
import com.example.test.service.ProductoService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoServiceImpl implements ProductoService{

	private final ListaCompraDao listaCompraDao;
	private final ListaCompraDetalleDao listaCompraDetalle;
	private final ClienteDao clienteDao;
	private final ProductoDao productoDao;

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
		return null;
	}

	@Override
	public void eliminarListaDeCompras(String nombreLista) {
	}

}

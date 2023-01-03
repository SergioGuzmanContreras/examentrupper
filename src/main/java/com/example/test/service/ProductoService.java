package com.example.test.service;

import java.util.List;

import com.example.test.models.request.ListaRequest;
import com.example.test.models.response.ListaResponse;

public interface ProductoService {

	ListaResponse crearLista(ListaRequest request);
	ListaResponse modificarLista(ListaRequest request);
	List<ListaResponse> obtenerListaCompras(Integer idCliente);
	void eliminarListaDeCompras(String nombreLista);

}

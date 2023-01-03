package com.example.test.models.request;

import java.util.List;

import lombok.Data;

@Data
public class ListaRequest {
	
	private Integer idCliente;
	private String lista;
	private List<ProductosListRequest> productos;

}

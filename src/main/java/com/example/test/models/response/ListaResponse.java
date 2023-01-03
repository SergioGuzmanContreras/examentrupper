package com.example.test.models.response;

import java.util.List;

import com.example.test.models.request.ProductosListRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListaResponse {

	private Integer idCliente;
	private String lista;
	private List<ProductosListRequest> productos;
	}

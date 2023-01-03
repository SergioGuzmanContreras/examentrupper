package com.example.test.models.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductosListRequest {

	private Integer idProducto;
	private Integer cantidad;
}

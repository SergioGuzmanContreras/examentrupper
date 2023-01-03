package com.example.test.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Productos")
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProducto")
	private Integer id;

	@Column(name = "clave", length = 15)
	private String clave;
	
	@Column(name = "descripcion", length = 150)
	private String descripcion;
	
	private Integer Activo;
	
}

package com.example.test.dao.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "ListaCompraDetalle")
@IdClass(ListaCompraDetalle.class)
@NoArgsConstructor
@AllArgsConstructor
public class ListaCompraDetalle implements Serializable{

	private static final long serialVersionUID = -2295445727343073904L;

	@Id
	@ManyToOne
	@JoinColumn(name = "idListaCompra", referencedColumnName = "idLista", nullable = false, foreignKey = @ForeignKey(name = "fk_cliente_lista_compra"))	
	private ListaCompra compra;

	@Id
	@ManyToOne
	@JoinColumn(name = "producto_id", referencedColumnName = "idProducto", nullable = false, foreignKey = @ForeignKey(name = "fk_cliente_producto"))
	private Producto producto;

	private Integer cantidad;
	
}

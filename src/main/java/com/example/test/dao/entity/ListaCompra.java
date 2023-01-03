package com.example.test.dao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "ListaCompra")
@NoArgsConstructor
@AllArgsConstructor
public class ListaCompra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idLista")
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id", referencedColumnName = "idCliente", nullable = false, foreignKey = @ForeignKey(name = "fk_cliente_lista"))
	private Cliente cliente;

	@Column(name = "nombre", length = 50)
	private String nombre;
	
	@Column(name = "fechaRegistro", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRegistro;

	@Column(name = "fechaUltimaActualizacion", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaUltimaActualizacion;
	
	private Boolean activo;

}

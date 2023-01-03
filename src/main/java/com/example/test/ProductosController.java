package com.example.test;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.models.request.ListaRequest;
import com.example.test.models.response.ListaResponse;
import com.example.test.service.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductosController {

	@Autowired
	private ProductoService productoService;
	
	@PostMapping
	public ResponseEntity<?> crearLista(@RequestBody ListaRequest request){
		ListaResponse response = this.productoService.crearLista(request);
		return ResponseEntity.created(URI.create("/productos"+response.getIdCliente())).body(response);
	}

	@GetMapping("/{idCliente}")
	public ResponseEntity<?> obtenerListas(@PathVariable("idCliente") Integer idCliente){
		return ResponseEntity.ok().body(this.productoService.obtenerListaCompras(idCliente));
	}
	
	@PutMapping
	public ResponseEntity<?> modificarLista(@RequestBody ListaRequest request){
		ListaResponse response = this.productoService.modificarLista(request);
		return ResponseEntity.created(URI.create("/productos"+response.getIdCliente())).body(response);
	}
	
	@DeleteMapping("/{lista}")
	public ResponseEntity<?> eliminarLista(@PathVariable("lista") String lista){
		this.productoService.eliminarListaDeCompras(lista);
		return ResponseEntity.noContent().build();
	}
	
}

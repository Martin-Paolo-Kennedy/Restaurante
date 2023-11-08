package com.martin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.martin.entity.Plato;
import com.martin.service.PlatoService;

@RestController
@RequestMapping("/url/restaurante")
public class PlatoController {
	@Autowired
	private PlatoService service;
	
	@ResponseBody
	@GetMapping("/platoLista")
	public ResponseEntity<List<Plato>> listaPlato(){
		List<Plato> lista = service.listaPlato();
		return ResponseEntity.ok(lista);
	}
}

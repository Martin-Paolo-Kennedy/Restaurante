package com.martin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martin.entity.Plato;
import com.martin.repository.PlatoRepository;

@Service
public class PlatoServiceImp implements PlatoService{
	@Autowired
	private PlatoRepository repository;

	@Override
	public List<Plato> listaPlato() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
}

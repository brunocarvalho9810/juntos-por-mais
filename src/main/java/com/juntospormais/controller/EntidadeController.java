package com.juntospormais.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juntospormais.model.dto.EntidadeResponseDTO;
import com.juntospormais.service.EntidadeService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/entidade")
public class EntidadeController {
	
	@Autowired
	private EntidadeService service;
	
	@GetMapping
	@ApiOperation("Lista de Entidades")
	List<EntidadeResponseDTO> getListEntidades() throws Exception{
		return service.getListEntidades();
	}
	
}

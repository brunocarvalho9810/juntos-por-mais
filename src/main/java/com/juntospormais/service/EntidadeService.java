package com.juntospormais.service;

import java.util.List;

import com.juntospormais.model.dto.EntidadeResponseDTO;

public interface EntidadeService {
	
	List<EntidadeResponseDTO> getListEntidades() throws Exception;

}

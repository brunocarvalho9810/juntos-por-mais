package com.juntospormais.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juntospormais.model.Entidade;
import com.juntospormais.model.dto.EntidadeResponseDTO;
import com.juntospormais.repository.EntidadeRepository;
import com.juntospormais.service.EntidadeService;

@Service
public class EntidadeServiceImpl implements EntidadeService {

	@Autowired
	private EntidadeRepository repository;

	@Override
	public List<EntidadeResponseDTO> getListEntidades() throws Exception {

		try {
			List<Entidade> retorno = this.repository.findAll();
			List<EntidadeResponseDTO> list = new ArrayList<EntidadeResponseDTO>();
			if (!retorno.isEmpty()) {
				Iterator<Entidade> var4 = retorno.iterator();
				while (var4.hasNext()) {
					Entidade entidade = (Entidade) var4.next();
					list.add(EntidadeResponseDTO.builder().agencia(entidade.getAgencia()).caixa(entidade.getCaixa())
							.comprovantes(entidade.getComprovantes()).conta(entidade.getConta())
							.cpfCNPJ(entidade.getCpfCNPJ()).email(entidade.getEmail()).id(entidade.getId())
							.pixAleat(entidade.getPixAleat()).pixCpfCNPJ(entidade.getPixCpfCNPJ())
							.pixEmail(entidade.getPixEmail()).nome(entidade.getNome()).build());
				}
			}
			return list;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}
}

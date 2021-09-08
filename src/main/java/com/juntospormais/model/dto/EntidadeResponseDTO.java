package com.juntospormais.model.dto;

import java.util.List;

import com.juntospormais.model.Comprovante;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class EntidadeResponseDTO {
	
	private Long id;
	private String cpfCNPJ;
	private String nome;
	private String email;
	private String pixEmail;
	private String pixCpfCNPJ;
	private String pixAleat;
	private String agencia;
	private String conta;
	private List<Comprovante> comprovantes;
	private Double caixa;

}

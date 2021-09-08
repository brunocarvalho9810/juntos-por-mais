package com.juntospormais.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity	
@Table(name = "tb_entidade")
public class Entidade {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(unique = true)
	private String cpfCNPJ;
	
	@NotNull
	private String nome;
	
	@NotNull
	@Column(unique = true)
	private String email;
	
	@NotNull
	private String senha;
	private String pixEmail;
	private String pixCpfCNPJ;
	private String pixAleat;
	private String agencia;
	
	@Column(unique = true)
	private String conta;
	
	@OneToMany
	private List<Comprovante> comprovantes;
	
	@NotNull
	private Double caixa;
	
}

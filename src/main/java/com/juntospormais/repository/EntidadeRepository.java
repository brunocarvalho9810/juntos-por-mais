package com.juntospormais.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juntospormais.model.Entidade;

@Repository
public interface EntidadeRepository extends JpaRepository<Entidade, Long>{

}

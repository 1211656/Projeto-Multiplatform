package com.example.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projeto.entities.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Long>{
	
	
	
}

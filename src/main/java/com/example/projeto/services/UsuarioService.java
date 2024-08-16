package com.example.projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projeto.repositories.UsuarioRepository;
import com.example.projeto.dtos.UsuarioDTO;
import com.example.projeto.entities.UsuarioEntity;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public List<UsuarioDTO> listarTodos() {
		List<UsuarioEntity> lista = usuarioRepository.findAll();
		return lista.stream().map(UsuarioDTO::new).toList();
	}
	
	
	public void inserir(UsuarioDTO usuario) {
		UsuarioEntity usuarioEntity = new UsuarioEntity(usuario);
		usuarioRepository.save(usuarioEntity);
	}
	
	public UsuarioDTO alterar(UsuarioDTO usuario) {
		UsuarioEntity usuario1 = new UsuarioEntity(usuario);
		return new UsuarioDTO(usuarioRepository.save(usuario1));
	}
	
	public void excluir(Long id) {
		UsuarioEntity usuario = usuarioRepository.findById(id).get();
		usuarioRepository.delete(usuario);
	}
	
	public UsuarioDTO buscarPorId(Long id) {
		return new UsuarioDTO(usuarioRepository.findById(id).get());
	}

}

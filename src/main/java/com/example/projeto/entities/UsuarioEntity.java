package com.example.projeto.entities;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.example.projeto.dtos.UsuarioDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="JP_USUARIO")
public class UsuarioEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long usuarioId;
	
	@Column(nullable=false)
	private String nome;
	 
	@Column(nullable=false)
	private String email;

	@Column(nullable=false)
	private String login;
	
	@Column(nullable=false)
	private String senha;
	
	
	public UsuarioEntity(UsuarioDTO usuario) {
		BeanUtils.copyProperties(usuario,this);
	}
	
	public UsuarioEntity() {}
	
	
	
	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, login, nome, senha, usuarioId);
	}

	@Override
	public String toString() {
		return "UsuarioEntity [usuarioId=" + usuarioId + ", nome=" + nome + ", email=" + email + ", login=" + login
				+ ", senha=" + senha + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioEntity other = (UsuarioEntity) obj;
		return Objects.equals(email, other.email) && Objects.equals(login, other.login)
				&& Objects.equals(nome, other.nome) && Objects.equals(senha, other.senha)
				&& Objects.equals(usuarioId, other.usuarioId);
	}
	
	
	
	
	
	
}

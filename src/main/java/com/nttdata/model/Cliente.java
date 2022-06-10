package com.nttdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Cliente extends Persona {

	@Id
	@Column(name = "cliente_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer clienteId;

	@Column(name = "contraseña", nullable = false)
	private String contraseña;

	@Column(name = "estado", nullable = false)
	private String estado;
}

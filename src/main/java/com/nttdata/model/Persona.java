/**
 * 
 */
package com.nttdata.model;

import javax.persistence.Column;

import lombok.Data;

/**
 * @author gustavoefrainparcosanchez
 *
 */

@Data
public class Persona {

	@Column(name = "nombre", nullable = false, length = 100)
	private String nombre;
	@Column(name = "genero", nullable = false, length = 1)
	private String genero;
	@Column(name = "edad", nullable = false)
	private int edad;
	@Column(name = "identificacion", nullable = false, length = 100)
	private String identificacion;
	@Column(name = "direccion", nullable = false, length = 100)
	private String direccion;
	@Column(name = "telefono", nullable = false, length = 100)
	private String telefono;

}

/**
 * 
 */
package com.nttdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ibm.icu.math.BigDecimal;

import lombok.Data;

/**
 * @author gustavoefrainparcosanchez
 *
 */
@Data
@Entity
public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numeroCuenta;

	@Column(name = "tipo_cuenta", nullable = false)
	private String tipoCuenta;
	@Column(name = "saldo_inicial", nullable = false)
	private BigDecimal saldoInicial;
	@Column(name = "estado", nullable = false)
	private Boolean estado;

}

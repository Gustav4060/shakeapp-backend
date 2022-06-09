/**
 * 
 */
package com.nttdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ibm.icu.math.BigDecimal;
import com.nttdata.enumeration.TipoCuentaEnum;

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
	@Enumerated(EnumType.STRING)
	private TipoCuentaEnum tipoCuenta;

	@Column(name = "saldo_inicial", nullable = false)
	private BigDecimal saldoInicial;

	@Column(name = "estado", nullable = false)
	private Boolean estado;

}

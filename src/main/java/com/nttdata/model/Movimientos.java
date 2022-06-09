/**
 * 
 */
package com.nttdata.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
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
public class Movimientos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMovimientos;

	@Column(name = "fecha", nullable = false)
	private LocalDateTime fecha;

	@Column(name = "tipo_movimiento", nullable = false)
	private TipoCuentaEnum tipoMovimiento;

	@Column(name = "valor", nullable = false)
	private BigDecimal valor;

	@Column(name = "saldo", nullable = false)
	private BigDecimal saldo;

}

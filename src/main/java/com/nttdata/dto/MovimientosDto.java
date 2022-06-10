/**
 * 
 */
package com.nttdata.dto;

import java.time.LocalDateTime;

import com.ibm.icu.math.BigDecimal;
import com.nttdata.enumeration.TipoCuentaEnum;

import lombok.Data;

/**
 * @author gustavoefrainparcosanchez
 *
 */
@Data
public class MovimientosDto {
		
	private Long idMovimientos;
	
	private LocalDateTime fecha;
	
	private TipoCuentaEnum tipoMovimiento;

	private BigDecimal valor;

	private BigDecimal saldo;


}

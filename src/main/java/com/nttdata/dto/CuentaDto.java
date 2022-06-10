/**
 * 
 */
package com.nttdata.dto;

import com.ibm.icu.math.BigDecimal;
import com.nttdata.enumeration.TipoCuentaEnum;

import lombok.Data;

/**
 * @author gustavoefrainparcosanchez
 *
 */
@Data
public class CuentaDto {
	
	private Long numeroCuenta;

	private TipoCuentaEnum tipoCuenta;
	
	private BigDecimal saldoInicial;
	
	private Boolean estado;

	private Integer clienteId;
	
}

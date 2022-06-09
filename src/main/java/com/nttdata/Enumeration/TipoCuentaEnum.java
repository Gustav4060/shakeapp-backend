/**
 * 
 */
package com.nttdata.Enumeration;

import lombok.Data;

/**
 * @author gustavoefrainparcosanchez
 *
 */
@Data
public enum TipoCuentaEnum {

	A("AHORRO"), C("CORRIENTE");
	
	TipoCuentaEnum(String string) {
		// TODO Auto-generated constructor stub
	}

	private String descripcion;
	
	

	
}

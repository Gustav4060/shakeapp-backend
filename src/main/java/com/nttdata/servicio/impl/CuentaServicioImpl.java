/**
 * 
 */
package com.nttdata.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.nttdata.model.Cuenta;
import com.nttdata.repository.ICuentaRepo;
import com.nttdata.repository.IGenericRepo;
import com.nttdata.servicio.ICuentaServicio;

/**
 * @author gustavoefrainparcosanchez
 *
 */
public class CuentaServicioImpl extends CRUDImpl<Cuenta, Long> implements ICuentaServicio {

	@Autowired
	private ICuentaRepo cuentaRepo;

	@Override
	protected IGenericRepo<Cuenta, Long> getRepo() {
		return cuentaRepo;
	}

}

/**
 * 
 */
package com.nttdata.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.nttdata.model.Movimientos;
import com.nttdata.repository.IGenericRepo;
import com.nttdata.repository.IMovimientoRepo;
import com.nttdata.servicio.IMovimientoServicio;

/**
 * @author gustavoefrainparcosanchez
 *
 */
public class MovimientoServicio extends CRUDImpl<Movimientos, Long> implements IMovimientoServicio {

	@Autowired
	private IMovimientoRepo movimientoRepo;

	@Override
	protected IGenericRepo<Movimientos, Long> getRepo() {
		return movimientoRepo;
	}

}

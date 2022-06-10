/**
 * 
 */
package com.nttdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.model.Movimientos;
import com.nttdata.repository.IGenericRepo;
import com.nttdata.repository.IMovimientoRepo;
import com.nttdata.service.IMovimientoServicio;

/**
 * @author gustavoefrainparcosanchez
 *
 */
@Service
public class MovimientoServicio extends CRUDImpl<Movimientos, Long> implements IMovimientoServicio {

	@Autowired
	private IMovimientoRepo movimientoRepo;

	@Override
	protected IGenericRepo<Movimientos, Long> getRepo() {
		return movimientoRepo;
	}

}

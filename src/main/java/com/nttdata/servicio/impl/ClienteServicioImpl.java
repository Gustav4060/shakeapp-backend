/**
 * 
 */
package com.nttdata.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.nttdata.model.Cliente;
import com.nttdata.repository.IClienteRepo;
import com.nttdata.repository.IGenericRepo;
import com.nttdata.servicio.IClienteServicio;

/**
 * @author gustavoefrainparcosanchez
 *
 */
public class ClienteServicioImpl extends CRUDImpl<Cliente, Integer> implements IClienteServicio {

	@Autowired
	private IClienteRepo clienteRepo;

	@Override
	protected IGenericRepo<Cliente, Integer> getRepo() {
		return clienteRepo;
	}

}

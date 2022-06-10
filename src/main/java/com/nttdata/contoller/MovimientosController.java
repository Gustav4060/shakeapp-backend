/**
 * 
 */
package com.nttdata.contoller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.dto.MovimientosDto;
import com.nttdata.exception.ModeloNotFoundException;
import com.nttdata.model.Movimientos;
import com.nttdata.service.IMovimientoServicio;

/**
 * @author gustavoefrainparcosanchez
 *
 */
@RestController
@RequestMapping("/movimientos")
public class MovimientosController {
	@Autowired
	private ModelMapper mapper;

	@Autowired
	private IMovimientoServicio movimientoServicio;

	/**
	 * Obtiene la lista de Movimientoss
	 * 
	 * @return -dto de Movimientoss
	 * @throws Exception
	 */
	@GetMapping
	public ResponseEntity<List<MovimientosDto>> listar() throws Exception {
		List<MovimientosDto> lista = movimientoServicio.listar().stream().map(p -> mapper.map(p, MovimientosDto.class))
				.collect(Collectors.toList());
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}

	/**
	 * Lista por identificador de Movimientos
	 * 
	 * @param id identificador del Movimientos
	 * @return Dto de Movimientos
	 * @throws Exception
	 */
	@GetMapping("/{id}")
	public ResponseEntity<MovimientosDto> listarPorId(@PathVariable("id") Long id) throws Exception {
		MovimientosDto dtoResponse;
		Movimientos obj = movimientoServicio.listarPorId(id);

		if (obj == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		} else {
			dtoResponse = mapper.map(obj, MovimientosDto.class); // PacienteDTO
		}

		return new ResponseEntity<>(dtoResponse, HttpStatus.OK);
	}

	/**
	 * Registra el Movimientos
	 * 
	 * @param dtoRequest dto del Movimientos
	 * @return Movimientos dto
	 * @throws Exception
	 */
	@PostMapping
	public ResponseEntity<MovimientosDto> registrar(@Valid @RequestBody MovimientosDto dtoRequest) throws Exception {
		Movimientos p = mapper.map(dtoRequest, Movimientos.class);
		Movimientos obj = movimientoServicio.registrar(p);
		MovimientosDto dtoResponse = mapper.map(obj, MovimientosDto.class);
		return new ResponseEntity<>(dtoResponse, HttpStatus.CREATED);
	}

	/**
	 * Modifica el Movimientos
	 * 
	 * @param dtoRequest deto de Movimientos
	 * @return dto de Movimientos modificado
	 * @throws Exception
	 */
	@PutMapping
	public ResponseEntity<MovimientosDto> modificar(@RequestBody MovimientosDto dtoRequest) throws Exception {
		Movimientos pac = movimientoServicio.listarPorId(dtoRequest.getIdMovimientos());

		if (pac == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + dtoRequest.getIdMovimientos());
		}

		Movimientos p = mapper.map(dtoRequest, Movimientos.class);

		Movimientos obj = movimientoServicio.modificar(p);

		MovimientosDto dtoResponse = mapper.map(obj, MovimientosDto.class);

		return new ResponseEntity<>(dtoResponse, HttpStatus.OK);
	}

	/**
	 * Elimina Movimientos por id
	 * 
	 * @param id identificador del Movimientos
	 * @return retorna vacio
	 * @throws Exception
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Long id) throws Exception {
		Movimientos pac = movimientoServicio.listarPorId(id);

		if (pac == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}

		movimientoServicio.eliminar(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}

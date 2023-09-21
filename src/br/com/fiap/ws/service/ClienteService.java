package br.com.fiap.ws.service;

import br.com.fiap.entity.ClienteEntity;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface ClienteService {
	@SuppressWarnings("exports")
	String buscar(@WebParam(name="cliente")ClienteEntity cliente);
}
	
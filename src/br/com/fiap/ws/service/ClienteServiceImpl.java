package br.com.fiap.ws.service;

import br.com.fiap.entity.ClienteEntity;

public class ClienteServiceImpl implements ClienteService{

	@SuppressWarnings("exports")
	@Override
	public String buscar(ClienteEntity cliente) {
		return (cliente.toString());
	}

}

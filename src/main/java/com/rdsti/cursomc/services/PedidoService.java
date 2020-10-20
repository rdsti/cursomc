package com.rdsti.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rdsti.cursomc.domain.Pedido;
import com.rdsti.cursomc.repositories.PedidoRepository;
import com.rdsti.cursomc.services.exception.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;

	public Pedido buscar(Integer id) {
		
		Optional<Pedido> pedido = pedidoRepository.findById(id);
		
		
		return pedido.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
	}
	
}

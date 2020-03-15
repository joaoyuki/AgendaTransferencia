package br.com.joao.AgendamentoTransferencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joao.AgendamentoTransferencia.controller.request.TransferenciaControllerRequest;
import br.com.joao.AgendamentoTransferencia.service.TransferenciaService;

@RestController
public class TransferenciaController {
	
	@Autowired TransferenciaService transferenciaService;
	
	@GetMapping
	public ResponseEntity calcularTaxaTransferencia(TransferenciaControllerRequest transferenciaRequest) {
		return ResponseEntity.ok(transferenciaService.calcularTaxa(transferenciaRequest));
	}
	
	@GetMapping(value = "/todos")
	public ResponseEntity listarTodosAgendamentos() {
		return ResponseEntity.ok(transferenciaService.recuperarTodasTransferencia());
	}

}

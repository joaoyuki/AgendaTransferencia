package br.com.joao.AgendamentoTransferencia.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferenciaController {
	
	public ResponseEntity calcularTaxaTransferencia() {
		return ResponseEntity.ok(null);
	}

}

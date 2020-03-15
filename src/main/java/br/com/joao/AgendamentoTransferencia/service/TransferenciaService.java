package br.com.joao.AgendamentoTransferencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joao.AgendamentoTransferencia.entidade.Transferencia;
import br.com.joao.AgendamentoTransferencia.repositorio.TransferenciaRepositorio;
import br.com.joao.AgendamentoTransferencia.request.TransferenciaRequest;

@Service
public class TransferenciaService {
	
	@Autowired
	private TransferenciaRepositorio transferenciaRepositorio;

	public void calcularTaxa(TransferenciaRequest transferenciaRequest) {
		
		try {
			this.transferenciaRepositorio.save(Transferencia.buildTransferencia(transferenciaRequest));	
		}catch (Exception e) {
			throw new RuntimeException("Ocorreu um erro ao salvar nova transferencia");
		}
		
	}
	
	public List<Transferencia> recuperarTodasTransferencia() {
		return transferenciaRepositorio.findAll();
	}
	
}

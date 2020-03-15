package br.com.joao.AgendamentoTransferencia.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joao.AgendamentoTransferencia.controller.request.TransferenciaControllerRequest;
import br.com.joao.AgendamentoTransferencia.entidade.Transferencia;
import br.com.joao.AgendamentoTransferencia.repositorio.TransferenciaRepositorio;
import br.com.joao.AgendamentoTransferencia.request.TransferenciaRequest;
import br.com.joao.AgendamentoTransferencia.tiposAgendamentos.Agendamento10Dias;
import br.com.joao.AgendamentoTransferencia.tiposAgendamentos.AgendamentoAcima10Dias;
import br.com.joao.AgendamentoTransferencia.tiposAgendamentos.NenhumaTaxaAplicavel;
import br.com.joao.AgendamentoTransferencia.tiposAgendamentos.AgendamentoMesmoDia;

@Service
public class TransferenciaService {

	@Autowired
	private TransferenciaRepositorio transferenciaRepositorio;

	public Transferencia calcularTaxa(TransferenciaControllerRequest transferenciaControllerRequest) {

		br.com.joao.AgendamentoTransferencia.Transferencia t1 = new AgendamentoMesmoDia();
		br.com.joao.AgendamentoTransferencia.Transferencia t2 = new Agendamento10Dias();
		br.com.joao.AgendamentoTransferencia.Transferencia t3 = new AgendamentoAcima10Dias();
		br.com.joao.AgendamentoTransferencia.Transferencia t4 = new NenhumaTaxaAplicavel();

		t1.setProximaTaxa(t2);
		t2.setProximaTaxa(t3);
		t3.setProximaTaxa(t4);

		TransferenciaRequest dadosTransferenciaRequest = new TransferenciaRequest();
		BeanUtils.copyProperties(transferenciaControllerRequest, dadosTransferenciaRequest);
		double calcularTransferencia = t1.calcularTransferencia(dadosTransferenciaRequest);
		Transferencia buildTransferencia = Transferencia.buildTransferencia(transferenciaControllerRequest);
		buildTransferencia.setTaxa(calcularTransferencia);
		
		try {
			return this.transferenciaRepositorio.save(buildTransferencia);
		} catch (Exception e) {
			throw new RuntimeException("Ocorreu um erro ao salvar nova transferencia");
		}

	}

	public List<Transferencia> recuperarTodasTransferencia() {
		return transferenciaRepositorio.findAll();
	}

}

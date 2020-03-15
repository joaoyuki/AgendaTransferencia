package br.com.joao.AgendamentoTransferencia.tiposAgendamentos;

import br.com.joao.AgendamentoTransferencia.Transferencia;
import br.com.joao.AgendamentoTransferencia.request.TransferenciaRequest;

public class AgendamentoMesmoDia implements Transferencia{

	private static final int TAXA_3_REAIS = 3;
	private Transferencia transferencia;

	@Override
	public double calcularTransferencia(TransferenciaRequest transferenciaRequest) {

		if (transferenciaRequest.getDataTransferencia().isEqual(transferenciaRequest.getDataAgendamento())) {
			
			double taxaCalculada = (transferenciaRequest.getValorTransferencia() * 0.03) + TAXA_3_REAIS;
			return taxaCalculada;
			
		} else {
			return transferencia.calcularTransferencia(transferenciaRequest);
		}
		
	}

	@Override
	public void setProximaTaxa(Transferencia transferencia) {
		this.transferencia = transferencia;
	}

	
}

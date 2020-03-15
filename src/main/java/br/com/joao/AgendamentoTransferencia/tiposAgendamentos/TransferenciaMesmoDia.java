package br.com.joao.AgendamentoTransferencia.tiposAgendamentos;

import br.com.joao.AgendamentoTransferencia.Transferencia;
import br.com.joao.AgendamentoTransferencia.request.TransferenciaRequest;

public class TransferenciaMesmoDia implements Transferencia{

	private Transferencia transferencia;

	@Override
	public double calcularTransferencia(TransferenciaRequest transferenciaRequest) {

		if (transferenciaRequest.getDataTransferencia().isEqual(transferenciaRequest.getDataAgendamento())) {
			
			double taxaCalculada = (transferenciaRequest.getValorTransferencia() * 0.03) + 3;
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

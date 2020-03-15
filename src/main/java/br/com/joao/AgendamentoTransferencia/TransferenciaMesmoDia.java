package br.com.joao.AgendamentoTransferencia;

import br.com.joao.AgendamentoTransferencia.request.TransferenciaRequest;

public class TransferenciaMesmoDia implements Transferencia{

	@Override
	public double calcularTransferencia(TransferenciaRequest transferenciaRequest) {

		if (transferenciaRequest.getDataTransferencia().isEqual(transferenciaRequest.getDataAgendamento())) {
			
			double taxaCalculada = (transferenciaRequest.getValorTransferencia() * 0.03) + 3;
			return taxaCalculada;
			
		} 
		
		return 0;
	}


}

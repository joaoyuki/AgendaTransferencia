package br.com.joao.AgendamentoTransferencia;

import java.time.temporal.ChronoUnit;

import br.com.joao.AgendamentoTransferencia.request.TransferenciaRequest;

public class Agendamento10Dias implements Transferencia {

	@Override
	public double calcularTransferencia(TransferenciaRequest transferenciaRequest) {

		long between = ChronoUnit.DAYS.between(transferenciaRequest.getDataAgendamento(), transferenciaRequest.getDataTransferencia());
		
		if (between > 0 && between < 11) {
			
			double taxaCalculada = (transferenciaRequest.getValorTransferencia() * between) + 12;
			return taxaCalculada;
			
		}
		
		return 0;
	}


}

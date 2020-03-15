package br.com.joao.AgendamentoTransferencia.tiposAgendamentos;

import java.time.temporal.ChronoUnit;

import br.com.joao.AgendamentoTransferencia.Transferencia;
import br.com.joao.AgendamentoTransferencia.request.TransferenciaRequest;

public class Agendamento10Dias implements Transferencia {

	private static final int DIAS_12 = 12;
	private static final int DIAS_0 = 0;
	private static final int DIAS_11 = 11;

	@Override
	public double calcularTransferencia(TransferenciaRequest transferenciaRequest) {

		long diasEntreDatas = ChronoUnit.DAYS.between(transferenciaRequest.getDataAgendamento(), transferenciaRequest.getDataTransferencia());
		
		if (diasEntreDatas > DIAS_0 && diasEntreDatas < DIAS_11) {
			
			double taxaCalculada = (transferenciaRequest.getValorTransferencia() * diasEntreDatas) + DIAS_12;
			return taxaCalculada;
			
		}
		
		return 0;
	}


}

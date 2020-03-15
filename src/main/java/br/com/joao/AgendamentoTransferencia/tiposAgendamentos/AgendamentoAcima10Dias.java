package br.com.joao.AgendamentoTransferencia.tiposAgendamentos;

import java.time.temporal.ChronoUnit;

import br.com.joao.AgendamentoTransferencia.Transferencia;
import br.com.joao.AgendamentoTransferencia.request.TransferenciaRequest;

public class AgendamentoAcima10Dias implements Transferencia{

	private static final int DIAS_10 = 10;
	private static final int DIAS_20 = 20;
	private static final int DIAS_30 = 30;
	private static final int DIAS_40 = 40;

	@Override
	public double calcularTransferencia(TransferenciaRequest transferenciaRequest) {
		
		long diasEntreDatas = ChronoUnit.DAYS.between(transferenciaRequest.getDataAgendamento(), transferenciaRequest.getDataTransferencia());
		
		if (diasEntreDatas > DIAS_10 && diasEntreDatas <= DIAS_20) {
			
			double taxaCalculada = transferenciaRequest.getValorTransferencia() * 0.08;
			return taxaCalculada;
			
		}
		
		if (diasEntreDatas > DIAS_20 && diasEntreDatas <= DIAS_30) {
			
			double taxaCalculada = transferenciaRequest.getValorTransferencia() * 0.06;
			return taxaCalculada;
			
		}	
		
		if (diasEntreDatas > DIAS_30 && diasEntreDatas <= DIAS_40) {
			
			double taxaCalculada = transferenciaRequest.getValorTransferencia() * 0.04;
			return taxaCalculada;
			
		}
		
		if (diasEntreDatas > DIAS_40 && transferenciaRequest.getValorTransferencia() > 100.000) {
			double taxaCalculada = transferenciaRequest.getValorTransferencia() * 0.02;
			return taxaCalculada;			
		}
		
		return 0;
		
	}

}

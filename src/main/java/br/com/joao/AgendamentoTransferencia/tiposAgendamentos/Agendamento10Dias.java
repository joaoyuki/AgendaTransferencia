package br.com.joao.AgendamentoTransferencia.tiposAgendamentos;

import java.time.temporal.ChronoUnit;

import br.com.joao.AgendamentoTransferencia.Transferencia;
import br.com.joao.AgendamentoTransferencia.request.TransferenciaRequest;

public class Agendamento10Dias implements Transferencia {

	private static final int TAXA_12_REAIS = 12;
	private static final int DIAS_0 = 0;
	private static final int DIAS_11 = 11;
	private Transferencia transferencia;

	@Override
	public double calcularTransferencia(TransferenciaRequest transferenciaRequest) {

		long diasEntreDatas = ChronoUnit.DAYS.between(transferenciaRequest.getDataAgendamento(), transferenciaRequest.getDataTransferencia());
		
		if (diasEntreDatas > DIAS_0 && diasEntreDatas < DIAS_11) {
			
			double taxaCalculada = (transferenciaRequest.getValorTransferencia() * diasEntreDatas) + TAXA_12_REAIS;
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

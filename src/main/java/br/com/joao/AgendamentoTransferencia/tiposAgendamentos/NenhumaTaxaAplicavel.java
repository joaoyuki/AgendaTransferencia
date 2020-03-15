package br.com.joao.AgendamentoTransferencia.tiposAgendamentos;

import br.com.joao.AgendamentoTransferencia.Transferencia;
import br.com.joao.AgendamentoTransferencia.request.TransferenciaRequest;

public class NenhumaTaxaAplicavel implements Transferencia{

	@Override
	public double calcularTransferencia(TransferenciaRequest transferenciaRequest) {
		throw new RuntimeException("Nenhuma taxa aplicável");
	}

	@Override
	public void setProximaTaxa(Transferencia transferencia) {
		// Nao tem proxima taxa
	}

}

package br.com.joao.AgendamentoTransferencia;

import br.com.joao.AgendamentoTransferencia.request.TransferenciaRequest;

public interface Transferencia {

	double calcularTransferencia(TransferenciaRequest transferenciaRequest);
	
}

package br.com.joao.Agendamento.de.transferencia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.joao.AgendamentoTransferencia.request.TransferenciaRequest;
import br.com.joao.AgendamentoTransferencia.tiposAgendamentos.AgendamentoMesmoDia;

@RunWith(MockitoJUnitRunner.class)
public class TransferenciaMesmoDiaTest {
	
	AgendamentoMesmoDia transferenciaMesmoDia;
	
	@Before
	public void init() {
		transferenciaMesmoDia = new AgendamentoMesmoDia();
	}
	
	@Test
	public void deveriaTrazerTaxaComTransferenciaNoMesmoDia() {
		TransferenciaRequest request = new TransferenciaRequest(123, 456, 10d, LocalDate.now());
		
		double calcularTransferencia = transferenciaMesmoDia.calcularTransferencia(request);
		
		assertEquals(new Double(3.3), calcularTransferencia);
	}
	

}

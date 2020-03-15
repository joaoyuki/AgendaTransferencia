package br.com.joao.Agendamento.de.transferencia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.joao.AgendamentoTransferencia.TransferenciaMesmoDia;
import br.com.joao.AgendamentoTransferencia.request.TransferenciaRequest;

@RunWith(MockitoJUnitRunner.class)
public class TransferenciaMesmoDiaTest {
	
	TransferenciaMesmoDia transferenciaMesmoDia;
	
	@Before
	public void init() {
		transferenciaMesmoDia = new TransferenciaMesmoDia();
	}
	
	@Test
	public void deveriaTrazerTaxaComTransferenciaNoMesmoDia() {
		TransferenciaRequest request = new TransferenciaRequest(123, 456, 10d, LocalDate.now());
		
		double calcularTransferencia = transferenciaMesmoDia.calcularTransferencia(request);
		
		assertEquals(new Double(3.3), calcularTransferencia);
	}
	
	@Test
	public void deveriaRetornar0ComDataTransferenciaDiferenteDeMesmoDia() {
		TransferenciaRequest request = new TransferenciaRequest(123, 456, 10d, LocalDate.now().plusDays(1));
		
		double calcularTransferencia = transferenciaMesmoDia.calcularTransferencia(request);
		
		assertEquals(new Double(0), calcularTransferencia);		
	}

}

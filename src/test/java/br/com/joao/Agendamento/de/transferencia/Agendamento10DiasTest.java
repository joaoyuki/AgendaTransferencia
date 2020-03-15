package br.com.joao.Agendamento.de.transferencia;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.joao.AgendamentoTransferencia.request.TransferenciaRequest;
import br.com.joao.AgendamentoTransferencia.tiposAgendamentos.Agendamento10Dias;

@RunWith(MockitoJUnitRunner.class)
public class Agendamento10DiasTest {

	Agendamento10Dias agendamento12Dias;
	
	@Before
	public void init() {
		
		agendamento12Dias = new Agendamento10Dias();
		
	}
	
	@Test
	public void deveriaCalcularTaxaCom2Dias() {
		
		TransferenciaRequest request = new TransferenciaRequest(123, 234, 10.0, LocalDate.now().plusDays(2));
		double calcularTransferencia = agendamento12Dias.calcularTransferencia(request);
		assertEquals(new Double(32), calcularTransferencia);
		
	}
	
	@Test
	public void deveriaCalcularTaxaCom10Dias() {
		
		TransferenciaRequest request = new TransferenciaRequest(123, 234, 10.0, LocalDate.now().plusDays(10));
		double calcularTransferencia = agendamento12Dias.calcularTransferencia(request);
		assertEquals(new Double(112), calcularTransferencia);
		
	}	
	
	@Test
	public void deveriaCalcularTaxaCom11Dias() {
		
		TransferenciaRequest request = new TransferenciaRequest(123, 234, 10.0, LocalDate.now().plusDays(11));
		double calcularTransferencia = agendamento12Dias.calcularTransferencia(request);
		assertEquals(new Double(0), calcularTransferencia);
		
	}	
	
	@Test
	public void deveriaCalcularTaxaCom0Dias() {
		
		TransferenciaRequest request = new TransferenciaRequest(123, 234, 10.0, LocalDate.now());
		double calcularTransferencia = agendamento12Dias.calcularTransferencia(request);
		assertEquals(new Double(0), calcularTransferencia);
		
	}		
	
}

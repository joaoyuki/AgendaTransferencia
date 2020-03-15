package br.com.joao.Agendamento.de.transferencia;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.joao.AgendamentoTransferencia.request.TransferenciaRequest;
import br.com.joao.AgendamentoTransferencia.tiposAgendamentos.AgendamentoAcima10Dias;

@RunWith(MockitoJUnitRunner.class)
public class AgendamentoAcima10DiasTest {
	
	AgendamentoAcima10Dias agendamentoAcima10Dias;
	
	@Before
	public void init() {
		agendamentoAcima10Dias = new AgendamentoAcima10Dias();
	}
	
	@Test
	public void deveriaCalcularTaxaCom11Dias() {
		
		TransferenciaRequest request = new TransferenciaRequest(123, 234, 10.0, LocalDate.now().plusDays(11));
		double taxa = agendamentoAcima10Dias.calcularTransferencia(request);
		assertEquals(0.8d, taxa);
		
	}
	
	@Test
	public void deveriaCalcularTaxaCom20Dias() {
		
		TransferenciaRequest request = new TransferenciaRequest(123, 234, 10.0, LocalDate.now().plusDays(20));
		double taxa = agendamentoAcima10Dias.calcularTransferencia(request);
		assertEquals(0.8d, taxa);
		
	}	
	
	@Test
	public void deveriaCalcularTaxaCom21Dias() {
		
		TransferenciaRequest request = new TransferenciaRequest(123, 234, 10.0, LocalDate.now().plusDays(21));
		double taxa = agendamentoAcima10Dias.calcularTransferencia(request);
		assertEquals(0.6d, taxa);
		
	}	
	
	@Test
	public void deveriaCalcularTaxaCom30Dias() {
		
		TransferenciaRequest request = new TransferenciaRequest(123, 234, 10.0, LocalDate.now().plusDays(30));
		double taxa = agendamentoAcima10Dias.calcularTransferencia(request);
		assertEquals(0.6d, taxa);
		
	}	
	
	@Test
	public void deveriaCalcularTaxaCom31Dias() {
		
		TransferenciaRequest request = new TransferenciaRequest(123, 234, 10.0, LocalDate.now().plusDays(31));
		double taxa = agendamentoAcima10Dias.calcularTransferencia(request);
		assertEquals(0.4d, taxa);
		
	}
	
	@Test
	public void deveriaCalcularTaxaCom40Dias() {
		
		TransferenciaRequest request = new TransferenciaRequest(123, 234, 10.0, LocalDate.now().plusDays(40));
		double taxa = agendamentoAcima10Dias.calcularTransferencia(request);
		assertEquals(0.4d, taxa);
		
	}	
	
	@Test
	public void deveriaCalcularTaxaCom41DiasEValorAciaDe100000() {
		
		TransferenciaRequest request = new TransferenciaRequest(123, 234, 101.000, LocalDate.now().plusDays(41));
		double taxa = agendamentoAcima10Dias.calcularTransferencia(request);
		System.out.println(taxa);
		assertEquals(2.02d, taxa);
		
	}		

}

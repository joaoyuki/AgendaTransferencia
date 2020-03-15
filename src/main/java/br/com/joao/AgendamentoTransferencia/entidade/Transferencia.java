package br.com.joao.AgendamentoTransferencia.entidade;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.joao.AgendamentoTransferencia.request.TransferenciaRequest;

@Entity
public class Transferencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int contaOrigem;
	private int contaDestino;
	private double valorTransferencia;
	private LocalDate dataTransferencia;
	private LocalDate dataAgendamento;
	
	public static Transferencia buildTransferencia(TransferenciaRequest transferenciaRequest) {
		Transferencia novaTransferencia = new Transferencia();
		novaTransferencia.setContaDestino(transferenciaRequest.getContaDestino());
		novaTransferencia.setContaOrigem(transferenciaRequest.getContaOrigem());
		novaTransferencia.setDataAgendamento(transferenciaRequest.getDataAgendamento());
		novaTransferencia.setDataTransferencia(transferenciaRequest.getDataTransferencia());
		novaTransferencia.setValorTransferencia(transferenciaRequest.getValorTransferencia());
		return novaTransferencia;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getContaOrigem() {
		return contaOrigem;
	}
	public void setContaOrigem(int contaOrigem) {
		this.contaOrigem = contaOrigem;
	}
	public int getContaDestino() {
		return contaDestino;
	}
	public void setContaDestino(int contaDestino) {
		this.contaDestino = contaDestino;
	}
	public double getValorTransferencia() {
		return valorTransferencia;
	}
	public void setValorTransferencia(double valorTransferencia) {
		this.valorTransferencia = valorTransferencia;
	}
	public LocalDate getDataTransferencia() {
		return dataTransferencia;
	}
	public void setDataTransferencia(LocalDate dataTransferencia) {
		this.dataTransferencia = dataTransferencia;
	}
	public LocalDate getDataAgendamento() {
		return dataAgendamento;
	}
	public void setDataAgendamento(LocalDate dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	
}

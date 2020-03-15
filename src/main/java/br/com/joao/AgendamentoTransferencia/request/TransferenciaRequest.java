package br.com.joao.AgendamentoTransferencia.request;

import java.time.LocalDate;

public class TransferenciaRequest {

	private int contaOrigem;
	private int contaDestino;
	private double valorTransferencia;
	private LocalDate dataTransferencia;
	private LocalDate dataAgendamento;
	
	public TransferenciaRequest(int contaOrigem, int contaDestino, double valorTransferencia,
			LocalDate dataTransferencia) {
		this.contaOrigem = contaOrigem;
		this.contaDestino = contaDestino;
		this.valorTransferencia = valorTransferencia;
		this.dataTransferencia = dataTransferencia;
		this.dataAgendamento = LocalDate.now();
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
	
}

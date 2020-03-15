package br.com.joao.AgendamentoTransferencia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joao.AgendamentoTransferencia.entidade.Transferencia;

public interface TransferenciaRepositorio extends JpaRepository<Transferencia, Long>{

}

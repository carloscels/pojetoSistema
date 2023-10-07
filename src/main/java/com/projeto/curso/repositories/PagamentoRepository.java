package com.projeto.curso.repositories;


import com.projeto.curso.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento,Integer> {
}

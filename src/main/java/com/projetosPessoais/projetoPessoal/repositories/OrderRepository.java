package com.projetosPessoais.projetoPessoal.repositories;

import com.projetosPessoais.projetoPessoal.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

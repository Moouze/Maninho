package com.maninho.Sistema.maninho.repositories;

import com.maninho.Sistema.maninho.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    boolean existsByCpf(String cpf);
    boolean existsByCnpj(String cnpj);

    List<Cliente> findByNomeContainingIgnoreCase(String nome);


}

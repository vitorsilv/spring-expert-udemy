package io.github.vitorsilv.service;

import io.github.vitorsilv.model.Cliente;
import io.github.vitorsilv.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    @Autowired //Não é necessário pq o Spring entende isso automarico
    public ClientesService (ClientesRepository repository) {
        this.repository = repository;

    }

    public void salvarCliente (Cliente cliente) {
        validarCliente(cliente);
        this.repository.save(cliente);
    }

    public void validarCliente (Cliente cliente) {
        //valida tudo
    }
}

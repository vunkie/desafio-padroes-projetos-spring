package dio.gof.service;

import dio.gof.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> findAll();

    Cliente findById(Long id);

    void insert(Cliente cliente);

    void update(Long id, Cliente cliente);

    void delete(Long id);
    
} 

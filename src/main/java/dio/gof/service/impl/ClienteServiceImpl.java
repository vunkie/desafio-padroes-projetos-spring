package dio.gof.service.impl;

import org.springframework.stereotype.Service;

import dio.gof.model.Cliente;
import dio.gof.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Override
    public Iterable<Cliente> findAll() {
        return null;
    }

    @Override
    public Cliente findById(Long id) {
        return null;
    }

    @Override
    public void insert(Cliente cliente) {
        
    }

    @Override
    public void update(Long id, Cliente cliente) {
        
    }

    @Override
    public void delete(Long id) {
        
    }
    
}

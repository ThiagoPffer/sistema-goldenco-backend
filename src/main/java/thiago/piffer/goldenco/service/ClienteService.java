package thiago.piffer.goldenco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import thiago.piffer.goldenco.domain.Cliente;
import thiago.piffer.goldenco.repository.ClienteRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class ClienteService{

    @Autowired
    private ClienteRepository repository;

    public Page<Cliente> findAll(Pageable pageable) { return repository.findAll(pageable); }

    public Cliente findById(Long id) {
        Optional<Cliente> cliente = repository.findById(id);
        return cliente.orElseThrow(() -> new RuntimeException("Cliente não encontrado [id: "+ id + "]"));
    }

    @Transactional
    public void save(Cliente cliente) {
        saveNestedObjects(cliente);
        repository.save(cliente);
    }

    public void delete(Long id) { repository.deleteById(id); }

    private void saveNestedObjects(Cliente cliente) {
//        cliente.getEndereco().setCliente(cliente);
//        cliente.getConjugue().setCliente(cliente);
    }

}

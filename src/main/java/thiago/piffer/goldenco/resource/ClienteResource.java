package thiago.piffer.goldenco.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import thiago.piffer.goldenco.model.Cliente;
import thiago.piffer.goldenco.repository.ClienteRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll() {
        List<Cliente> list = repository.findAll();
        return ResponseEntity.ok().body(list);
    }

}

package thiago.piffer.goldenco.resource;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import thiago.piffer.goldenco.domain.Cliente;
import thiago.piffer.goldenco.service.ClienteService;

import java.net.URI;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService service;

    @GetMapping
    public ResponseEntity<Page<Cliente>> findAll(
            @RequestParam(value="page", defaultValue = "0") Integer page,
            @RequestParam(value="limit", defaultValue = "24") Integer limit,
            @RequestParam(value="direction", defaultValue = "ASC") String direction,
            @RequestParam(value="orderBy", defaultValue = "nome") String orderBy) {
        PageRequest pageRequest = PageRequest.of(page, limit, Sort.Direction.valueOf(direction), orderBy);
        Page<Cliente> pageCliente = service.findAll(pageRequest);
        return ResponseEntity.ok().body(pageCliente);
    }

    @PostMapping
    public ResponseEntity<Cliente> insert(@RequestBody String json) {
        Cliente cliente = new Gson().fromJson(json, Cliente.class);
        service.save(cliente);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(cliente.getId()).toUri();
        return ResponseEntity.created(uri).body(cliente);
    }


}

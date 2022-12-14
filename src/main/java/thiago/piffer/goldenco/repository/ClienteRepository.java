package thiago.piffer.goldenco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thiago.piffer.goldenco.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

package thiago.piffer.goldenco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thiago.piffer.goldenco.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}

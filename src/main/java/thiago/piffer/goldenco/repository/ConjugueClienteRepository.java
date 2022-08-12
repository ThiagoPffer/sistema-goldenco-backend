package thiago.piffer.goldenco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thiago.piffer.goldenco.model.Conjugue;

@Repository
public interface ConjugueClienteRepository extends JpaRepository<Conjugue, Long> {
}

package thiago.piffer.goldenco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thiago.piffer.goldenco.domain.Conjugue;

@Repository
public interface ConjugueRepository extends JpaRepository<Conjugue, Long> {
}

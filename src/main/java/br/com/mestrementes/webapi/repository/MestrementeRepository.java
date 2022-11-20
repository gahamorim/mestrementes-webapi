package br.com.mestrementes.webapi.repository;

import br.com.mestrementes.webapi.model.Mestremente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MestrementeRepository extends JpaRepository<Mestremente, Long> {
}

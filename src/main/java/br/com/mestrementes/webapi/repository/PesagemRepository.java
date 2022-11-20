package br.com.mestrementes.webapi.repository;

import br.com.mestrementes.webapi.model.Mestremente;
import br.com.mestrementes.webapi.model.Pesagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PesagemRepository extends JpaRepository<Pesagem, Long> {

    List<Pesagem> findByIdMestremente(Mestremente idMestremente);
}

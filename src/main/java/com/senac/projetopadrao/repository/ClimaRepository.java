package com.senac.projetopadrao.repository;

import com.senac.projetopadrao.model.Clima;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClimaRepository extends JpaRepository<Clima, Long> {
    Clima findByDate(String date);
}

package com.senac.projetopadrao.repository;

import com.senac.projetopadrao.model.Satelite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SateliteRepository extends JpaRepository<Satelite, Long> {
}

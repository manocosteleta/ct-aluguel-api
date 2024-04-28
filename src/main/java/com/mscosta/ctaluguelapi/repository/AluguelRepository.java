package com.mscosta.ctaluguelapi.repository;

import com.mscosta.ctaluguelapi.model.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Long> {
}

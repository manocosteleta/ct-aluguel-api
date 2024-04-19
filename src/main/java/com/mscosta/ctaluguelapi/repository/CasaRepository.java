package com.mscosta.ctaluguelapi.repository;

import com.mscosta.ctaluguelapi.model.Casa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasaRepository extends JpaRepository<Casa, Long> {
}

package org.iesvdm.one_to_one_jpa.repository;

import org.iesvdm.one_to_one_jpa.domain.Socio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocioRepository extends JpaRepository<Socio, Long> {
}

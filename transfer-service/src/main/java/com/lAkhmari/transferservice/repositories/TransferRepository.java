package com.lAkhmari.transferservice.repositories;

import com.lAkhmari.transferservice.entities.Transfert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface TransferRepository extends JpaRepository<Transfert, Long> {
    @RestResource(path = "/byClientId")
    List<Transfert> findByClientId(@Param("clientId") Long clientId);
}

package com.lAkhmari.walletservice.repositories;

import com.lAkhmari.walletservice.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface WalletRepository extends JpaRepository<Wallet, String> {
    @RestResource(path = "/byClientId")
    List<Wallet> findByCustomerId(@Param("clientID") Long customerId);

}

package org.sid.walletservice.repositories;

import org.sid.walletservice.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

@RepositoryRestResource
public interface WalletRepository extends JpaRepository<Wallet, Long> {
   /*public Collection<Wallet> findByClientId(Long id);*/

}

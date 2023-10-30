package org.sid.transferservice.model;

import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Collection;

@Data
public class Client {
    private Long id;
    private String name;
    private String email;
    private Collection<Wallet> wallets;
}

package org.sid.transferservice.feign;

import org.sid.billingservice.model.Product;
import org.sid.transferservice.model.Wallet;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "WALLET-SERVICE")
public interface WalletRestClient {

    @GetMapping(path = "/wallets")
    PagedModel<Wallet> pageWallets();

    @GetMapping(path = "/wallets/{id}")
    Wallet getWalletById(@PathVariable(name = "id") String id);

}

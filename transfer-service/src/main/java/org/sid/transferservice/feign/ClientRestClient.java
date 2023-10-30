package org.sid.transferservice.feign;

import org.sid.billingservice.model.Customer;
import org.sid.transferservice.model.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CLIENT-SERVICE")
public interface ClientRestClient {

    @GetMapping(path = "/clients/{id}")
    Client getClientById(@PathVariable(name = "id") Long id);


}

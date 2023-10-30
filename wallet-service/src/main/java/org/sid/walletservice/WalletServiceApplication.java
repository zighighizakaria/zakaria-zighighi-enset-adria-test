package org.sid.walletservice;

import org.sid.walletservice.entities.Client;
import org.sid.walletservice.entities.Wallet;
import org.sid.walletservice.repositories.ClientRepository;
import org.sid.walletservice.repositories.WalletRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class WalletServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ClientRepository clientRepository, WalletRepository walletRepository){
		return args -> {

			Client client1=new Client();
			client1.setName("mounir");
			client1.setEmail("mn@enset.ma");
			clientRepository.save(client1);

			Wallet wallet1=new Wallet();
			wallet1.setSolde(13000);
			wallet1.setDateCreation(new Date());
			wallet1.setDevise("MAD");
			walletRepository.save(wallet1);

			Wallet wallet2=new Wallet();
			wallet2.setSolde(2000);
			wallet2.setDateCreation(new Date());
			wallet2.setDevise("EURO");
			walletRepository.save(wallet2);


		/*	System.out.println("------------------------");
			System.out.println("------clients---------");
			clientRepository.findAll().forEach(c -> {
				System.out.println(c.toString());
			});



			System.out.println("------------------------");
			System.out.println("------wallets---------");
			walletRepository.findAll().forEach(w -> {
				System.out.println(w.toString());
			});*/







		};
	}

}

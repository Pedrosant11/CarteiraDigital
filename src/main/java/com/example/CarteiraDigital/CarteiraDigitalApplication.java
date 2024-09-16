package com.example.CarteiraDigital;

import com.example.CarteiraDigital.model.User;
import com.example.CarteiraDigital.model.UserBalance;
import com.example.CarteiraDigital.model.UserType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarteiraDigitalApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CarteiraDigitalApplication.class, args);

		User pedro = new User("Pedro Henrique", "16041511706", "pedro@gmail.com", "1234", UserType.PF);
		User raphael = new User("Raphael", "16041511706", "pedro@gmail.com", "1234", UserType.PF);
		User teste = new User("teste", "16041511706", "pedro@gmail.com", "1234", UserType.PF);
		User mercadoLivre = new User("mercado livre", "16041511706", "pedro@gmail.com", "1234", UserType.PJ);

		UserBalance pedroBalance = new UserBalance(pedro, 180.00);
		UserBalance raphaelBalance = new UserBalance(raphael, 190.00);
		UserBalance testeBalance = new UserBalance(teste, 500.00);
		UserBalance mercadoBalance = new UserBalance(mercadoLivre, 896653.00);

		transaction(pedroBalance, mercadoBalance, 600.0);
		System.out.println(pedroBalance.getBalance());
		System.out.println(raphaelBalance.getBalance());
		System.out.println(testeBalance.getBalance());
		System.out.println(mercadoBalance.getBalance());


	}

	public static void transaction (UserBalance receiver, UserBalance sender, double value ) {
		if (UserType.PJ == sender.getUser().getType()) {
			System.out.println("não pode transferir");
		} else if (sender.getBalance() < value){
			System.out.println("Saldo insuficiente!");
		}else {
			sender.setBalance(sender.getBalance() - value);
			receiver.setBalance(receiver.getBalance() + value);
		}

	}

}

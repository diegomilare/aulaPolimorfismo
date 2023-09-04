package program;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account conta = new Account(1357, "Vanderleia Farias", 150.00);
		SavingsAccount poupanca = new SavingsAccount(1234, "Carlos Rafael", 1500.00, 5.00);
		BusinessAccount empresa = new BusinessAccount(2468, "Andre Matias", 3000.00, 1500.00, 250.00);
		
		System.out.println(conta);
		System.out.println(poupanca);
		System.out.println(empresa);

	}

}

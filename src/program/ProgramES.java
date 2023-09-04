package program;

import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramES {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero da conta: ");
		int conta = sc.nextInt();
		sc.nextLine();
		System.out.print("Titular da conta: ");
		String titular = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double saldo = sc.nextDouble();
		System.out.print("Limite para emprestimo: ");
		double limiteEmprestimo = sc.nextDouble();
		System.out.print("Taxa de juros: ");
		double taxaJuros = sc.nextDouble();
		System.out.print("Valor do emprestimo: ");
		double emprestimo = sc.nextDouble();
		
		
		Account contaComum = new Account(conta, titular, saldo);
		BusinessAccount contaComercial = new BusinessAccount(conta, titular, saldo, limiteEmprestimo, emprestimo);
		SavingsAccount contaPoupanca = new SavingsAccount(conta, titular, saldo, taxaJuros);
		
		System.out.println("--------------------------");
		System.out.println("Dados de uma conta comum");
		System.out.println("--------------------------");
		System.out.println("Numero da conta: " + contaComum.getNumber());
		System.out.println("Titular: " + contaComum.getHolder());
		System.out.println("Saldo inicial: R$" + String.format("%.2f", contaComum.getBalance()));
		System.out.println("----------------------------");
		System.out.println("Dados de uma conta comercial");
		System.out.println("----------------------------");
		System.out.println("Numero da conta: " + contaComercial.getNumber());
		System.out.println("Titular: " + contaComercial.getHolder());
		System.out.println("Saldo inicial: R$" + String.format("%.2f", contaComercial.getBalance()));
		System.out.println("Limite para emprestimo: R$" + String.format("%.2f", contaComercial.getLoan()));
		System.out.println("Emprestimo realizado: R$" + String.format("%.2f", emprestimo));
		contaComercial.loan();
		System.out.println("Saldo atualizado R$" + String.format("%.2f", contaComercial.getBalance()));
		System.out.println("----------------------------");
		System.out.println("Dados de uma conta poupanca");
		System.out.println("----------------------------");
		System.out.println("Numero da conta: " + contaPoupanca.getNumber());
		System.out.println("Titular: " + contaPoupanca.getHolder());
		System.out.println("Saldo inicial: R$" + String.format("%.2f", contaPoupanca.getBalance()));
		System.out.println("Taxa de juros: " + String.format("%.2f", contaPoupanca.getInterestRate()) + "%");
		contaPoupanca.updateBalance();
		System.out.println("Saldo atualizado: R$" + String.format("%.2f", contaPoupanca.getBalance()));
		sc.close();	
	}

}

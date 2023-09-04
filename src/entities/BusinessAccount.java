package entities;

public class BusinessAccount extends Account {
	private Double loanLimit;
	private Double ammountLoan;

	public BusinessAccount() {
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit, Double ammountLoan) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
		this.ammountLoan = ammountLoan;
	}

	public Double getLoan() {
		return loanLimit;
	}

	public Double loan() {
		
		if (ammountLoan <= loanLimit) {
			deposit(ammountLoan);
			return getBalance();
		}
		else {
			System.out.println("Emprestimo acima do limite. Limite maximo de R$" + String.format("%.2f", loanLimit));
			return getBalance();
		}
	}

	@Override
	public String toString() {
		return "-----------------------" +
				"\nConta: " +
				getNumber() +
				"\nTitular: " +
				getHolder() +
				"\nSaldo: " +
				String.format("%.2f", getBalance()) +
				"\nLimite de emprestimo: " +
				String.format("%.2f", getLoan()) +
				"\nSaldo atualizado com " +
				String.format("R$ %.2f", this.ammountLoan) +
				" de emprestimo: " +
				String.format("R$ %.2f", loan());
	}
	
}

package entities;

public class BusinessAccount extends Account {
	private Double loanLimit;

	public BusinessAccount() {
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoan() {
		return loanLimit;
	}

	public void loan(Double ammount) {
		if (ammount <= loanLimit) {
			deposit(ammount);
		}
		else {
			System.out.println("Emprestimo acima do limite. Limite maximo de R$" + String.format("%.2f", loanLimit));
		}
	}
	
}

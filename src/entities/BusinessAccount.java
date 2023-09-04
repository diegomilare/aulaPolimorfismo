package entities;

public class BusinessAccount extends Account {
	private Double loanLimit;

	public BusinessAccount() {
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
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
			System.out.println("Empréstimo acima do limite. Limite máximo de R$" + String.format("%.2f", loanLimit));
		}
	}
	
}

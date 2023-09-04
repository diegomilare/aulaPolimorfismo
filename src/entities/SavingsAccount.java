package entities;

public class SavingsAccount extends Account {
	private Double interestRate; //Taxa de juros
	
	
	public SavingsAccount() {
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void updateBalance() {
		balance += (balance * this.interestRate/100);
	}
}

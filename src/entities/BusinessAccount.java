package entities;

public class BusinessAccount extends Account {
	private Double loan;

	public BusinessAccount() {
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loan) {
		this.loan = loan;
	}

	public Double getLoan() {
		return loan;
	}

	public void loan(Double ammount) {
		deposit(ammount);
	}
	
}

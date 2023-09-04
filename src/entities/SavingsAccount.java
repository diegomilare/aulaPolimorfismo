package entities;

public class SavingsAccount extends Account {
	private Double interestRate; //Taxa de juros
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public Double updateBalance() {
		return balance += (balance * this.interestRate/100);
	}

	@Override
	public final String toString() {
		return "------------------" +
				"\nConta: " +
				getNumber() +
				"\nTitular: " +
				getHolder() +
				"\nSaldo: " +
				getBalance() +
				"\nTaxa de juros: " +
				String.format("%.2f%%", getInterestRate()) +
				String.format("\nSaldo com o rendimento de %.2f%%: ", getInterestRate()) +
				String.format("%.2f", updateBalance());
	}
	
}

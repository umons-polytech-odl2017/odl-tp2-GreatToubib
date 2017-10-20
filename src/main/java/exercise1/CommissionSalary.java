package exercise1;

public class CommissionSalary extends Employee {


	private int Bsalary;
	private int commission;


	public CommissionSalary(String name, int Bsalary, int commission) {
		super(name);
		this.Bsalary = Bsalary;
		this.commission = commission;
	}

	public int getCommission() {
		return commission;
	}

	public int getBSalary() {
		return Bsalary;
	}

	public int FinalSalary=getBSalary()+getCommission();

	@Override
	public int FinalSalary() {
		return 0;
	}
}

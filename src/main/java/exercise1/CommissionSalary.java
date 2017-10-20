package exercise1;

public class CommissionSalary extends Employee {


	private int Bsalary;
	private int commission;
	private int sales=0;



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
	public void sell() {sales++;}



	@Override
	public int FinalSalary() {
		return Bsalary+commission*sales;
	}
}

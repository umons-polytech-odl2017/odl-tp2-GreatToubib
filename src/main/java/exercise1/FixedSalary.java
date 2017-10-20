package exercise1;

public class FixedSalary extends Employee {

	private int Fsalary;

	public FixedSalary(String name, int Fsalary) {
		super(name);
		this.Fsalary = Fsalary;
	}

	public int getFSalary() {
		return Fsalary;
	}


	@Override
	public int FinalSalary() {
		return Fsalary;
	}
}



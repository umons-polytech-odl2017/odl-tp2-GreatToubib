package exercise1;

public class HourlySalary extends Employee {


	private int HourRate;
	private int WorkHours;

	public HourlySalary(String name, int hourRate, int workHours) {
		super(name);
		HourRate = hourRate;
		WorkHours = workHours;
	}

	public int getHourRate() {
		return HourRate;
	}

	public int getWorkHours() {
		return WorkHours;
	}

	public int FinalSalary=getHourRate()*getWorkHours();

	@Override
	public int FinalSalary() {
		return 0;
	}
}



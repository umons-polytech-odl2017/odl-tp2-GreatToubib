package exercise1;

public class HourlySalary extends Employee {


	private int HourRate;
	private int WorkHours = 0;

	public HourlySalary(String name, int hourRate) {
		super(name);
		HourRate = hourRate;
		WorkHours = WorkHours;
	}

	public int getHourRate() {                 // alt + insert !
		return HourRate;
	}


	@Override
	public void workOneHour() {WorkHours++;}

	@Override
	public int FinalSalary() {   //
		return WorkHours*HourRate;
	}
}



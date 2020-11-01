package employee;

public class Permanent extends Employee {

	private int employmentDay;
	private int employmentMonth;
	private int employmentYear;
	private int amountOfInsurance;
	
	public Permanent(String name, int birthDay, int birthMonth, int birthYear, String employeeId, String employeeDivision,
			String jobLevel, int employmentDay, int employmentMonth, int employmentYear, int amountOfInsurance) {
		super(name, birthDay, birthMonth, birthYear, employeeId, employeeDivision, jobLevel);
		this.employmentDay = employmentDay;
		this.employmentMonth = employmentMonth;
		this.employmentYear = employmentYear;
		this.amountOfInsurance = amountOfInsurance;
	}

	public int getEmploymentDay() {
		return employmentDay;
	}

	public void setEmploymentDay(int employmentDay) {
		this.employmentDay = employmentDay;
	}

	public int getEmploymentMonth() {
		return employmentMonth;
	}

	public void setEmploymentMonth(int employmentMonth) {
		this.employmentMonth = employmentMonth;
	}

	public int getEmploymentYear() {
		return employmentYear;
	}

	public void setEmploymentYear(int employmentYear) {
		this.employmentYear = employmentYear;
	}

	public int getAmountOfInsurance() {
		return amountOfInsurance;
	}

	public void setAmountOfInsurance(int amountOfInsurance) {
		this.amountOfInsurance = amountOfInsurance;
	}

}

package employee;

public class Contract extends Employee {

	private int contractDay;
	private int contractMonth;
	private int contractYear;
	private int yearLength;
	
	public Contract(String name, int birthDay, int birthMonth, int birthYear, String employeeId, String employeeDivision,
			String jobLevel, int contractDay, int contractMonth, int contractYear, int yearLength) {
		super(name, birthDay, birthMonth, birthYear, employeeId, employeeDivision, jobLevel);
		this.contractDay = contractDay;
		this.contractMonth = contractMonth;
		this.contractYear = contractYear;
		this.yearLength = yearLength;
	}

	public int getContractDay() {
		return contractDay;
	}

	public void setContractDay(int contractDay) {
		this.contractDay = contractDay;
	}

	public int getContractMonth() {
		return contractMonth;
	}

	public void setContractMonth(int contractMonth) {
		this.contractMonth = contractMonth;
	}

	public int getContractYear() {
		return contractYear;
	}

	public void setContractYear(int contractYear) {
		this.contractYear = contractYear;
	}

	public int getYearLength() {
		return yearLength;
	}

	public void setYearLength(int yearLength) {
		this.yearLength = yearLength;
	}

}

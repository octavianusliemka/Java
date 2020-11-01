package employee;

public abstract class Employee {

	protected String name;
	protected int birthDay;
	protected int birthMonth;
	protected int birthYear;
	protected String employeeId;
	protected String employeeDivision;
	protected String jobLevel;

	public Employee(String name, int birthDay, int birthMonth, int birthYear, String employeeId, String employeeDivision,
			String jobLevel) {
		super();
		this.name = name;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
		this.employeeId = employeeId;
		this.employeeDivision = employeeDivision;
		this.jobLevel = jobLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeDivision() {
		return employeeDivision;
	}

	public void setEmployeeDivision(String employeeDivision) {
		this.employeeDivision = employeeDivision;
	}

	public String getJobLevel() {
		return jobLevel;
	}

	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
	}

}

import java.util.Scanner;
import java.util.Vector;

import employee.*;

// TODO File Write Read

public class Main {

	Scanner sc = new Scanner(System.in);
	Vector<Employee> employees = new Vector<>();

	public Main() {
		// TODO DELETE INI...
		employees.add(new Contract("Jeremy", 17, 9, 2000, "5432167890", "Production", "Manager", 1, 1, 2018, 3));
		employees.add(new Permanent("Xavier", 21, 6, 1999, "3431678191", "Production", "Supervisor", 2, 2, 2017, 2));
		mainMenu();
	}

	private void mainMenu() {
		int choose = -1;
		do {
			cls();
			System.out.println(
					"      ______                __                         __  ___                                                  __ ");
			delay(100);
			System.out.println(
					"     / ____/___ ___  ____  / /___  __  _____  ___     /  |/  /___ _____  ____ _____ ____  ____ ___  ___  ____  / /_");
			delay(100);
			System.out.println(
					"    / __/ / __ `__ \\/ __ \\/ / __ \\/ / / / _ \\/ _ \\   / /|_/ / __ `/ __ \\/ __ `/ __ `/ _ \\/ __ `__ \\/ _ \\/ __ \\/ __/");
			delay(100);
			System.out.println(
					"   / /___/ / / / / / /_/ / / /_/ / /_/ /  __/  __/  / /  / / /_/ / / / / /_/ / /_/ /  __/ / / / / /  __/ / / / /_  ");
			delay(100);
			System.out.println(
					"  /_____/_/ /_/ /_/ .___/_/\\____/\\__, /\\___/\\___/  /_/  /_/\\__,_/_/ /_/\\__,_/\\__, /\\___/_/ /_/ /_/\\___/_/ /_/\\__/  ");
			delay(100);
			System.out.println(
					"                 /_/            /____/                                      /____/                                 ");
			delay(100);
			System.out.println("\n  by .........");
			delay(100);
			System.out.println();
			System.out.println("1. Input data of an employee");
			System.out.println("2. Search an information of an employee");
			System.out.println("3. Delete data of an employee");
			System.out.println("4. Update data of an employee");
			System.out.println("5. Exit");
			System.out.print("\nChoose : ");
			try {
				choose = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
			}
			if (choose == 1) {
				inputData();
			} else if (choose == 2) {
				searchData();
			} else if (choose == 3) {
				deleteData();
			} else if (choose == 4) {
				// TODO updateData();
			} else if (choose == 5) {
				break;
			}
		} while (choose != 0);
	}

	private void inputData() {
		cls();

		String type = "";
		do {
			System.out.print("Type of employee [Contract/Permanent] : ");
			type = sc.nextLine();
		} while (!type.equalsIgnoreCase("Contract") && !type.equalsIgnoreCase("Permanent"));

		String name = "";
		do {
			System.out.print("Name of employee [min length 3 and max length 20] : ");
			name = sc.nextLine();
		} while (name.length() < 3 || name.length() > 20);

		String dob = "";
		int birthDay = 0;
		int birthMonth = 0;
		int birthYear = 0;
		do {
			System.out.print("Employee's date of birth [DD/MM/YYYY] : ");
			dob = sc.nextLine();
			String splitted[] = dob.split("/");
			if (splitted.length == 3) {
				try {
					birthDay = Integer.parseInt(splitted[0]);
					birthMonth = Integer.parseInt(splitted[1]);
					birthYear = Integer.parseInt(splitted[2]);
					if (birthDay >= 1 && birthDay <= 31) {
						if (birthMonth >= 1 && birthMonth <= 12) {
							if (birthYear >= 1900 && birthYear <= 2019) {
								break;
							}
						}
					}
				} catch (Exception e) {
					// Do nothing
				}
			}
		} while (true);
		
		String employeeId = "";
		// TODO Tambahin validasi klo ada id sama
		do {
			System.out.print("Employee's ID [Length must be 10] : ");
			employeeId = sc.nextLine();
		} while (employeeId.length()!=10);
		
		String employeeDivision = "";
		do {			
			System.out.print("Employee's Division : ");
			employeeDivision = sc.nextLine();
		} while (employeeDivision.equals(""));
		
		String jobLevel = "";
		do {
			System.out.print("Job level of employee : ");
			jobLevel = sc.nextLine();
		} while (jobLevel.equals(""));
		
		String doc = "";
		String doe = "";
		int contractDay = 0;
		int contractMonth = 0;
		int contractYear = 0;
		int yearLength = 0;
		int employmentDay = 0;
		int employmentMonth = 0;
		int employmentYear = 0;
		int amountOfInsurance = 0;
		
		if(type.equalsIgnoreCase("Contract")) {
			do {
				System.out.print("Employee's date of contract [DD/MM/YYYY] : ");
				doc = sc.nextLine();
				String splitted[] = doc.split("/");
				if (splitted.length == 3) {
					try {
						contractDay = Integer.parseInt(splitted[0]);
						contractMonth = Integer.parseInt(splitted[1]);
						contractYear = Integer.parseInt(splitted[2]);
						if (contractDay >= 1 && contractDay <= 31) {
							if (contractMonth >= 1 && contractMonth <= 12) {
								if (contractYear >= 1900 && contractYear <= 2019) {
									break;
								}
							}
						}
					} catch (Exception e) {
						// Do nothing
					}
				}
			} while (true);
			
			do {
				System.out.print("Length of contract [NOT 0] : ");
				try {
					yearLength = sc.nextInt();
					sc.nextLine();
				} catch (Exception e) {
					sc.nextLine();
				}
			}while(yearLength == 0);
			
		}else {
			
			do {
				System.out.print("Employee's date of employment [DD/MM/YYYY] : ");
				doe = sc.nextLine();
				String splitted[] = doe.split("/");
				if (splitted.length == 3) {
					try {
						employmentDay = Integer.parseInt(splitted[0]);
						employmentMonth = Integer.parseInt(splitted[1]);
						contractYear = Integer.parseInt(splitted[2]);
						if (employmentDay >= 1 && employmentDay <= 31) {
							if (employmentMonth >= 1 && employmentMonth <= 12) {
								if (employmentYear >= 1900 && employmentYear <= 2019) {
									break;
								}
							}
						}
					} catch (Exception e) {
						// Do nothing
					}
				}
			} while (true);
			
			do {
				System.out.print("Amount of insurance [NOT 0] : ");
				try {
					amountOfInsurance = sc.nextInt();
					sc.nextLine();
				} catch (Exception e) {
					sc.nextLine();
				}
			}while(amountOfInsurance == 0);
			
		}
		
		if(type.equalsIgnoreCase("Contract")) {
			employees.add(new Contract(name, birthDay, birthMonth, birthYear, employeeId, employeeDivision, jobLevel, contractDay, contractMonth, contractYear, yearLength));
		}else {
			employees.add(new Permanent(name, birthDay, birthMonth, birthYear, employeeId, employeeDivision, jobLevel, employmentDay, employmentMonth, employmentYear, amountOfInsurance));
		}
		
		System.out.println("\nInput success!");
		System.out.println("Press enter to continue...");
		sc.nextLine();

	}
	
	private void deleteData() {
		
		cls();
		
		if(employees.isEmpty()) {
			System.out.println("No data available!");
			System.out.println("\nPress enter to continue...");
			sc.nextLine();
			return;
		}
		
		viewData();
		
		String Id = "";
		do {
			System.out.print("Employee's Id [Length must be 10] : ");
			Id = sc.nextLine();
		} while (Id.length() != 10);
		
		boolean found = false;
		
		for (int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getEmployeeId().equals(Id)) {
				found = true;
				employees.remove(i);
				System.out.println("Data deletion success");
				break;
			}
		}
		
		if(!found) {
			System.out.println("\nData not found!");
		}
		System.out.println("\nPress enter to continue...");
		sc.nextLine();
		
	}
	
	private void searchData() { // TODO KLO NOT FOUND
		
		cls();
		
		if(employees.isEmpty()) {
			System.out.println("No data available!");
			System.out.println("\nPress enter to continue...");
			sc.nextLine();
			return;
		}
		
		viewData();
		
		String Id = "";
		do {
			System.out.print("Employee's Id [Length must be 10] : ");
			Id = sc.nextLine();
		} while (Id.length() != 10);
		
		boolean found = false;
		for (int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getEmployeeId().equals(Id)) {
				found = true;
				System.out.println();
				System.out.println("Name of employee    : " + employees.get(i).getName());
				System.out.println("Employee Type       : " + employees.get(i).getClass().getSimpleName());
				System.out.println("Date of birth       : " + employees.get(i).getBirthDay() + "-" + employees.get(i).getBirthMonth() + "-" + employees.get(i).getBirthYear() );
				System.out.println("Employee's ID       : " + employees.get(i).getEmployeeId());
				System.out.println("Employee's Division : " + employees.get(i).getEmployeeDivision());
				System.out.println("Job level           : " + employees.get(i).getJobLevel());
				if(employees.get(i).getClass().getSimpleName().equals("Contract")) {
					Contract ctr = (Contract)employees.get(i);
					System.out.println("Date of contract    : " + ctr.getContractDay() + "-" + ctr.getContractMonth() + "-" + ctr.getContractYear());
					System.out.println("Length of Contract  : " + ctr.getYearLength()+" year(s)");
				}else {
					Permanent pmt = (Permanent)employees.get(i);
					System.out.println("Date of contract    : " + pmt.getEmploymentDay() + "-" + pmt.getEmploymentMonth() + "-" + pmt.getEmploymentYear());
					System.out.println("Amount of Insurance : " + pmt.getAmountOfInsurance());
				}
				break;
			}
		}
		if(!found) {
			System.out.println("\nData not found!");
		}
		System.out.println("\nPress enter to continue...");
		sc.nextLine();
		
		
	}

	private void viewData() {
		
		if(employees.isEmpty()) {
			System.out.println("There is no data!");
			return;
		}
		
		System.out.println(" ------------------------------------------------------------------------------------------------------"
				+ "--------------------------------------------------------------------------------------------------------");
		
		System.out.print("| No. ");
		System.out.print("| Name of employee     ");
		System.out.print("| Employee Type       ");
		System.out.print("| Date of birth       ");
		System.out.print("| Employee's ID       	");
		System.out.print("| Employee's Division  ");
		System.out.print("| Job level    	      ");
		System.out.print("| Date of contract    ");
		System.out.print("| Length of Contract / Amount of Insurance |");
		
		System.out.println();
		System.out.println(" ------------------------------------------------------------------------------------------------------"
				+ "--------------------------------------------------------------------------------------------------------");
		
		for (int i = 0; i < employees.size(); i++) {
			System.out.printf("| %02d.", i+1);
			System.out.printf(" | %-20s", employees.get(i).getName());
			System.out.printf(" | %-19s", employees.get(i).getClass().getSimpleName());
			System.out.printf(" | %02d - %02d - %d     ",employees.get(i).getBirthDay(), employees.get(i).getBirthMonth(), employees.get(i).getBirthYear() );
			System.out.printf(" | %-20s", employees.get(i).getEmployeeId());
			System.out.printf(" | %-20s", employees.get(i).getEmployeeDivision());
			System.out.printf(" | %-20s", employees.get(i).getJobLevel());
			if(employees.get(i).getClass().getSimpleName().equals("Contract")) {
				Contract ctr = (Contract)employees.get(i);
				System.out.printf(" | %02d - %02d - %d     ", ctr.getContractDay(), ctr.getContractMonth(), ctr.getContractYear());
				System.out.printf(" | %-32s year(s) |", ctr.getYearLength());
			}else {
				Permanent pmt = (Permanent)employees.get(i);
				System.out.printf(" | %02d - %02d - %d     ",pmt.getEmploymentDay(), pmt.getEmploymentMonth(), pmt.getEmploymentYear());
				System.out.printf(" | %-40s |", pmt.getAmountOfInsurance());
			}
			System.out.println();
		}
		
		System.out.println(" ------------------------------------------------------------------------------------------------------"
				+ "--------------------------------------------------------------------------------------------------------");
		
	}
	
	public static void main(String[] args) {
		new Main();
	}

	private void cls() {
		for (int i = 0; i < 35; i++) {
			System.out.println();
		}
	}

	private void delay(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
//			e.printStackTrace();
		}
	}

}

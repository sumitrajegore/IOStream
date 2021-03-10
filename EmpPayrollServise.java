package emppayrroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpPayrollServise {
	
	public enum IOService {
		
		CONSOLE_IO,FILE_IO,DB_IO,REST_IO;
	}
	private List<EmpPayrollData> emppayrollList;
	
	public EmpPayrollServise(List <EmpPayrollData> emppayrollList) {

		this.emppayrollList = emppayrollList;
	}
	public static void main(String[] args) {
		
		ArrayList <EmpPayrollData> emppayrollList =  new ArrayList<>();
		EmpPayrollServise empPayrollServise = new EmpPayrollServise(emppayrollList);
		Scanner consoleInputReader = new Scanner(System.in);
		empPayrollServise.readEmpPayrollData(consoleInputReader);
		empPayrollServise.writeEmpPayrollData();
	}
	private void readEmpPayrollData(Scanner consoleInputReader) {	
		
        System.out.println("Enter Employee ID: ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee name: ");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary: ");
        Double salary = consoleInputReader.nextDouble();
        emppayrollList.add(new EmpPayrollData(id, name, salary));
    }
    private void writeEmpPayrollData() {
    	
        System.out.println("\nWriting Employee Payroll Roaster to Console...\n" + emppayrollList);
    }
}

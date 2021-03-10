package emppayrroll;

public class EmpPayrollData {
	
	private int id;
	private String name;
	private Double salary;
	
	public EmpPayrollData(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "EmpPayrollData [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

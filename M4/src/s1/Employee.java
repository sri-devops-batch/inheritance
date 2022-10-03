package s1;
import java.util.*;

public class Employee {

	String name;
	int salary;
	 int medicalInsurance;


	public Employee() {
		super();
	}
	

	
	public Employee(String name, int salary,int medicalInsurance) {
		super();
		this.name = name;
		this.salary = salary;
		this.medicalInsurance=medicalInsurance;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getmedicalInsurance() {
		return medicalInsurance;
		
	}
	public void setmedicalInsurance(int medicalInsurance) {
		this.medicalInsurance=medicalInsurance;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ",medicalInsurance="+medicalInsurance+"]";
	}
	void Login()
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the name:");
		String name=sc1.next();
		System.out.println("enter the salary:");
		int salary=sc.nextInt();
		System.out.println("Enter the medicalInsurance");
		int medicalInsurance=sc.nextInt();
	}	
	
}
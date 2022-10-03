package s1;

public class Marketing extends Employee{
	String email;
 
	public Marketing() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Marketing(String name, int salary, int medicalInsurance, String email) {
		super(name,salary,medicalInsurance);
		this.email=email;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email= email;
	}
	
	
	public void worksOnTaxFile()
	{
		System.out.println(name); 
		System.out.println(email);	
		System.out.println(salary);
		System.out.println(medicalInsurance);
	
		
	}
	public String toString() {
		return"Marketing[email="+email+"]";
	}
	@Override
	public void setSalary(int incentive) {
	int previousSalary=super.getSalary();

    super.setSalary(super.getSalary()+incentive);
	
		
	}
	@Override
	public void setmedicalInsurance(int medicalInsurance) {
		super.setmedicalInsurance(super.getSalary()+(getSalary()*100));
	}
	
	
}


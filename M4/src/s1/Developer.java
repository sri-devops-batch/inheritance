package s1;

public class Developer extends Employee {
	Project project;
	String clientName;
	
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Developer(String name, int salary,int medicalInsurance) {
		super(name, salary,medicalInsurance);
		// TODO Auto-generated constructor stub
	}
	public Developer(Project project, String clientName,String name, int salary,int medicalInsurance) {
		super(name, salary,medicalInsurance);
		this.project = project;
		this.clientName = clientName;
	}
	public Project getproject() {
		return project;
	}
	public void setproject(Project project) {
		this.project = project;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	public void worksOnProject()
	{
		System.out.println(name);
		System.out.println(salary);
		System.out.println(medicalInsurance);
		System.out.println(project.getProjectName());
		System.out.println(name+" working on"+project.getProjectName());
		

	}
	@Override
	public String toString() {
		return "Developer [project=" + project + ", clientName=" + clientName + "]";
	}
	
}
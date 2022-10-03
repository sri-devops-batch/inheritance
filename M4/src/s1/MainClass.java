package s1;

public class MainClass {
 
public static void main(String args[]) {

	System.out.println("\n========================\n");
	Accountant accountant=new Accountant("sai", 80000,5000, "TaxFile");
	accountant.worksOnTaxFile();
	System.out.println("\n========================\n");
	Project instagram=new Project("Instagram Advertisents", 90);
	Developer developer=new Developer(instagram, "Meta", "sai",5000,20000);
	developer.worksOnProject();
	System.out.println("\n=========================\n");
	Marketing m=new Marketing("rani",5000,6000,"rani@gmail.com");
	m.worksOnTaxFile();
	m.setSalary(800);
	int s=m.getSalary();
	System.out.println(s);
	m.setmedicalInsurance(0);
	int i=m.getmedicalInsurance();
    System.out.println(i);	
}
}

package oopConcepts;

public class ClassA {
	
	public int Salary;
	public String Name;
	protected String OrgName;
	
	// method named after class
	
	public ClassA() {
		System.out.println("Inside Constructor");
	}
	
	public ClassA(int val1, String val2, String val3) {
		System.out.println("Inside Parameter Constructor");
		
		this.Salary = val1;
		this.Name = val2;
		this.OrgName = val3;
	}
	
	// Methods
	public void Display ()
	{
		System.out.println("Name of employee: "+ Name);
		System.out.println("Name of organization: "+ OrgName);
		System.out.println("Salary of employee: "+ Salary);
	}

}

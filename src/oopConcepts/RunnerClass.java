package oopConcepts;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ClassA Emp2 = new ClassA();
		ClassA Emp1 = new ClassA(10000,"Ann","XYZ");
		/*
		Emp1.Name = "Ann";
		Emp1.OrgName = "XYZ";
		Emp1.Salary = 10000;
				
		Emp1.Display();
		
		ClassB Obj1 = new ClassB();
		
		Obj1.Name = "Krista";
		Obj1.OrgName = "LMNOP";
		Obj1.Salary = 10000;
		
		Obj1.Display();
		Obj1.show();
		
		ClassC Obj2 = new ClassC();
		
		Obj2.run();*/
		
		MethodOverloading Obj3 = new MethodOverloading();
		
		Obj3.add(15, 7);
		Obj3.add(25.5, 7.7);
		
		MethodOverrideChild Obj4 = new MethodOverrideChild();
		
		Obj4.display();
				
		AbstractChild Obj5 = new AbstractChild();
		
		Obj5.method2();
		Obj5.method1();
		
		EncapsulationExample Obj7 = new EncapsulationExample();
		
		Obj7.setSalary(10000);
		
		System.out.println(Obj7.getSalary());
		
		Obj7.setName("Ann");
		
		System.out.println(Obj7.getName());
		
		Obj7.setEmpId("ACW1967");
		
		System.out.println(Obj7.getEmpId());
		
	}

}

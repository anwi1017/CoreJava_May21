package test;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsExample obj = new ThrowsExample();
		
		try {
			
			obj.eligibility(21);
			
		}catch(ArithmeticException e) {
			
			System.out.println("Exception Handled");
		
		}
		
		
	}
	
	
	public void eligibility(int age) throws ArithmeticException{
				
		if(age<18) {
			
			throw new ArithmeticException("not valid age");
			
		}else {
			
			System.out.println("Eligible for voting");
		}
	}

}

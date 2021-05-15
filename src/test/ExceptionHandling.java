package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 0;
		
		try {
			
			int result = a/b;
			
		}catch(ArithmeticException e) {
		
			System.out.println("Arithmetic Exception Handled");
		
		}catch(Exception e) {
			
			System.out.println("Exception Handled");
			
		}finally {
			
			System.out.println("Try Catch executed successfully");
		}
		
		System.out.println("Hello");

	}

}

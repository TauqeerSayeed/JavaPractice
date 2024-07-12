package ExceptionHandlingpractice;

public class program3 {

	public static void validateAge(int age) {
		if(age<18){
			throw new ArithmeticException("Age is not valid");
		}
		else {
			System.out.println("Welcome to vote");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validateAge(16);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("rest of code execute");

	}

}

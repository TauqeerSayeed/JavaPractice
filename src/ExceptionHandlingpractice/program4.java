package ExceptionHandlingpractice;

class myException extends RuntimeException{
	public myException(String msg) {
		super(msg);
	}
}
public class program4 {
	
	public static void validateAge(int age){
		if(age<18){
			throw new myException("Age is not valid");
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
		catch(myException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("rest of code execute");

	}

	}


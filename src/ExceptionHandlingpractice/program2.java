package ExceptionHandlingpractice;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		    int a[]=new int[5];
		    a[1]=30/0;
		    System.out.println(a[4]);
		   }
		   catch(ArithmeticException e){System.out.println(e);}
		   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}
		   catch(Exception e){System.out.println(e);}

		   System.out.println("rest of the code...");

	}

}

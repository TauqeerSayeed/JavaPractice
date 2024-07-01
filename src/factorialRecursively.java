import java.util.Scanner;

public class factorialRecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial_recursive(n));
        sc.close();

	}
	public static long factorial_recursive(int n) {
        // your code here
//        long fact=1;
        if(n==0) return 1;
        else
            return n*factorial_recursive(n-1);   
    }

}

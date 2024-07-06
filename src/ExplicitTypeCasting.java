
public class ExplicitTypeCasting {
	public static void main(String[] args) {
		// Explicit type casting means higher to lower
		
		double d = 778955.5566;
        System.out.println("value of d is " + d);
        int i = (int) d;
        System.out.println("value of i is " + i);

        long l = 77899566625L;
        System.out.println("value of l is " + l);
        int intValue = (int) l;
        System.out.println("vlaue of intValue is " + intValue);

        double doubleValue = 88888.555687996;
        System.out.println("Double value is " + doubleValue);
        float fvalue = (float) doubleValue;
        System.out.println("value of fvalue is " + fvalue);
	}

}

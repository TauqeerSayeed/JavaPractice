class millineals{
	int age ;
	String name;
	millineals(int age ,String name){
		this.age = age;
		this.name=name;
	}
	void savings() {
		System.out.println("Inserts in fd");
	}
}

class genZ extends millineals{
	int coolness;
	genZ(int age,String name,int coolness){
		super(age,name);
		this.coolness = coolness;
	}
	void savings() {
		System.out.println("Inserts in crypto"); //override parents class method
	}
	
}
public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genZ GenZ = new genZ(24,"Tauqeer",1);
		GenZ.savings();

	}

}

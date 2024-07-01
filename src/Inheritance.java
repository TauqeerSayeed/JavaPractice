class manuu{
	void Manuu() {
		System.out.println("MANNU is a central university");
	}
}
class Mstudent extends manuu{
	void details() {
		System.out.println("I am student of manuu");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mstudent obj = new Mstudent();
		obj.Manuu();
		obj.details();

	}

}

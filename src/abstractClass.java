abstract class Main{
	String name ="tauqeer";
	int age = 24;
	abstract void study();
	public int getAge() {
		return age;
	}
}
class Student extends Main {
//	  int age = 25;	
	  public int graduationYear = 2018;
	  public void study() {
	    System.out.println("Studying");
	  }
	}
public class abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Main main = new Main();
		Student student = new Student();
		System.out.println(student.name);
		System.out.println(student.age);
		student.study();
		System.out.println(student.getAge());
	}

}

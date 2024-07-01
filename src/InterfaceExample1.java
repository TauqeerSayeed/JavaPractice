interface Animal{
	public void sleep();
	void eat();
}

class dog implements Animal{
	public void sleep() {
		System.out.println("dog is sleeping");
	}
	public void eat() {
		System.out.println("Dog is eating");
	}
}
public class InterfaceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal Dog = new dog();
		Dog.sleep();
		Dog.eat();

	}

}

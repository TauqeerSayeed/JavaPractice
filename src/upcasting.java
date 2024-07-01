class Vehicle {
  String brand = "Ford";        
  public void honk() {                   
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
	  String modelName = "Mustang"; 
	  String brand = "suzuki";
	  public void honk() {                   
		    System.out.println("piii, piii!");
		  }
}
public class upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Car(); //upcasting-refrence of object class object of child class
		System.out.println(v1.brand);
		v1.honk();
	}

}

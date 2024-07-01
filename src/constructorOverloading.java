
class shape{
	int length;
	int breadth;
	//same name different parameter-overloading
	shape(){
		this.length =0;
		this.breadth=0;
	}
	shape(int length, int breadth){
		this.length= length;
		this.breadth=breadth;
	}
}
public class constructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape rectangle = new shape(5,6);
		System.out.println("Lenght is: "+rectangle.length+" Breadth is: "+ rectangle.breadth);

	}

}

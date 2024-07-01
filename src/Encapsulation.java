class Employee{
	String name;
	private int salary;
	Employee(String name,int salary){
		this.name = name;
		this.salary = salary;
	}
	
	//setter
	void setSalary(int s) {
		this.salary =s;
	}
	
	//getter
	int getSalary() {
		return this.salary;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("tauqeer",40000);
		e1.setSalary(5000);
		System.out.println(e1.getSalary());

	}

}

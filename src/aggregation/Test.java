package aggregation;

public class Test {
public static void main(String[] args) {
	Car c = new Car();
	c.setColor("Red");
	c.setModel("lalala");
	c.setPrice(900000);
	
	Employee emp = new Employee();
	emp.setId(1);
	emp.setName("Samikshya");
	emp.setSalary(909000);
	emp.setCar(c);
	
	System.out.println("ID "+emp.getId());
	System.out.println("NAME "+emp.getName());
	System.out.println("SALARY "+emp.getSalary());
	System.out.println("COLOR "+emp.getCar().getColor());
	System.out.println("MODEL "+emp.getCar().getModel());
	System.out.println("PRICE "+emp.getCar().getPrice());
}
}

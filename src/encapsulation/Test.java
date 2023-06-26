package encapsulation;

public class Test {
public static void main(String[] args) {
	Customer c = new Customer();
	c.setId(4000);
	c.setName("Sammy");
	c.setAge(10);
	c.setCity("Duwakot");
	
//	System.out.println(c.getId());
//	System.out.println(c.getName());
//	System.out.println(c.getAge());
//	System.out.println(c.getCity());
	
	System.out.println(c);
}
}

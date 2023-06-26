package abstraction;

public class Test {
public static void main(String[] args) {
	
	//CentralBank b = new CentralBank() yo kahile ni mildainaaaaa
	
	CentralBank b = new PrimeBank();
	
	b.getBankName();
	b.getInterestRate();
	
	UsersService us = new UserServiceImpl();
	us.addUser();
	us.deleteUser();
	us.print();
	us.add("");
	us.size();
	
	CommonService cs = new UserServiceImpl();
	cs.print();

	
}
}

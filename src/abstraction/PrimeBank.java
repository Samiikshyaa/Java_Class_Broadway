package abstraction;

public class PrimeBank extends CentralBank {

	@Override
	protected void getBankName() {
		System.out.println("Prime Bank");
		
	}

	@Override
	protected void getInterestRate() {
		System.out.println("15%");
		
	}
	
}

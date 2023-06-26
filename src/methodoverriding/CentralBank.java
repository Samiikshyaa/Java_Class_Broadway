package methodoverriding;

public class CentralBank {
//protected because sabai ma farak farak huna sakcha
	protected void getBankName() {
		System.out.println("Central Bank");
	}
	protected void getInterestRate() {
		System.out.println("0");
	}
	
//public cause saab ma tei huncha
	public void MoneyExcRate() {
		System.out.println("$1 = 132");
		System.out.println("Yen 10  = 10");
		System.out.println("KDD 1 = 16");
	}
}

package abstraction;

public abstract class CentralBank {
// abstract arna child ma farak farak hunu paryo
//by force child ma hunai paryo vane
	protected abstract void getBankName();
	
	protected abstract void getInterestRate();

	public void MoneyExcRate() {
		System.out.println("$1 = 132");
		System.out.println("Yen 10  = 10");
		System.out.println("KDD 1 = 16");
	}
}

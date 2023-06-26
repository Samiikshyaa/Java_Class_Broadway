package methodoverriding;

public class Test {
public static void main(String[] args) {
	//static or early binding of object
	PrabhuBank pb = new PrabhuBank();
	pb.getBankName();
	pb.getInterestRate();
	
	NabilBank b = new NabilBank();
	//milcha 
	//ALSO
	//up casting
	CentralBank cb = new NabilBank();
}

	// late or dynamic binding of object
	// run time polymorphism
	// printBankInfo le Central Bank ko pani print garna milyo ani child class ko lagi ni faida

static void printBankInfo(CentralBank b) {
		b.getBankName();
		b.getInterestRate();
	}

}
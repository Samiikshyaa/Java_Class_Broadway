package controlst.selection;

public class nestedifelse {
	/*
	 * if(cond1){
	 * 			if(cond2){
	 * 					if(cond3){
	 * 						...
	 * 						}else{ }
	 * 		
	 * */
	
	public static void main(String[] args) {
		String citizen = "Japan";
		int age=40;
		if(citizen.equals("nepali")) {
			if(age>=18){
				System.out.println("You can VOte.");
				} else {System.out.println("Under age");}
		}
		else {
			System.out.println("Invalid Citizen");
		}
}
}

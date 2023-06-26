package Constructor;// le jasto object banayo tesko object dincha

public class User {
//instance variable----obj sanga aaune variable
	//non static
String user_name;
String password;

/*
 * ===========Default Constructor====================
 */
//User(){
//	user_name= "test";
//	password = "123";
//}

//======================Parameterized================
//User(String un, String pw){
//	user_name=un;
//	password=pw;
//}
//


// this();//default
// this(78,90);//calling parameterized constructor

//======================Parameterized================
User(String user_name, String password){
	this.user_name=user_name;// callling instance var
	this.password=password;
}
//this.printUser()//calling instance method

/*
 * this keyword represents current variable
 * we can call instance variable, instance methods and constructor using this
 */

void printuser() {
	System.out.println("UName: "+ user_name);
	System.out.println("Password: "+ password);
}

public static void main(String[] args) {
	User u1= new User("Sammy","Tammy");
	u1.printuser();

	new User("aa","88").printuser();
	
	
	//============ object class=================
	//object is root class of java
	// java ko parent class
	
	// consutructor overloading
}
}

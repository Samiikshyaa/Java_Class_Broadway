package encapsulation;
//POJO(Plain word Java object) or Entity class
public class Customer {
private int id,  age;
@Override
public String toString() {
	return "Customer [id=" + id + ", age=" + age + ", city=" + city + ", name=" + name + "]";
}
private String city, name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}



}

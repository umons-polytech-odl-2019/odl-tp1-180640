package exercise1;
class Person {	
	private name;
	private age; 
	public Person (string nom, int monage) {
		this.name = nom; 
		this.age =monage
	}
	public int getAge() {
		return age; 
	}
	public string getName() {
		return name;
	}
	public void setName (string name) {
		this.name = name; 
	}
	public void setAge (int age) {
		this.age = age; 
	}
}

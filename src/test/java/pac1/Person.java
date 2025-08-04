package pac1;
 
public class Person {
 
	String fisrtName;
	String lastName;
	char gender;
	
	
	public Person() {	}
	public Person(String fisrtName, String lastName, char gender) {
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.gender = gender;
	}
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}		
	}

	
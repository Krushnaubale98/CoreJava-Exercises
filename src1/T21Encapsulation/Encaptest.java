package T21Encapsulation;

public class Encaptest {
	
	private String name;
	private String idNum;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name=newName;
	}
	
	public String getIdnum() {
		return idNum;
	}

	public void setIdNum(String newId) {
		idNum=newId;
	}

	public void setAge(int newAge) {
		age =newAge;
		
	}
	public int getage() {
		return age;
	}
	
}

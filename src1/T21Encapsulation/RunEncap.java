package T21Encapsulation;

public class RunEncap {

	public static void main(String[] args) {
		Encaptest encap = new Encaptest();
		encap.setName("krushna");
		encap.setAge(23);
		encap.setIdNum("1");
		
		System.out.println("Name: "+ encap.getName() + "\n Age :" + encap.getage() + " \nId "+ encap.getIdnum() );
	}

}

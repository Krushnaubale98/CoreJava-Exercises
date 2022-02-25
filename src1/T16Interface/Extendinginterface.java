package T16Interface;

interface a {
	void dance();

	void sing();

}

interface b extends a {
	void play();

	void jump();

}

class ab implements b {

	public void dance() {
		System.out.println("Ram can dance");
	}

	public void sing() {
		System.out.println("ram can sing");
	}

	public void play() {
		System.out.println("ram can play");
	}

	public void jump() {
		System.out.println("ram can jump");
	}

}

public class Extendinginterface {

	public static void main(String[] args) {
		ab sc = new ab();
		sc.dance();
		sc.sing();
		sc.play();
		sc.jump();

	}

}

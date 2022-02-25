package T13javaMethods;
// find the middle string

public class exercise2 {

	public static void main(String[] args) {
		String arr = "woudrahip";
		char[] word=arr.toCharArray();
		int length=word.length/2;
		if(length%2!=0) {
			System.out.println(word[length-1]+" " + word[length]);
		}else {
			System.out.println(word[length]);
		}
	}

}

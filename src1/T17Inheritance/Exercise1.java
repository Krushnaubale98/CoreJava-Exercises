package T17Inheritance;

public class Exercise1
{
	public Exercise1(int i,int j) 
	{
		System.out.println(method(i,j));
		
	}
	int method(int i,int j)
	{
		return i++ + ++j;
		
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Exercise1 main=new Exercise1(10,10);
	}

	}



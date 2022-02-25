package T14FilseIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class byteStream {

	public static void main(String[] args ) throws IOException {

		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			try {
				in = new FileInputStream("C://Users//input.text");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out = new FileOutputStream("C://Users//output.text");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

}

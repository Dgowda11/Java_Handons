import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persis {
public static void main(String[] args) {
	
	try {
		Serail s1= new Serail(27,"Darshan");
		
		FileOutputStream fout = new FileOutputStream("f.txt");
		ObjectOutputStream  out = new ObjectOutputStream(fout);
		
		out.writeObject(s1);
		out.flush();
		out.close();
		System.out.println("Success");
	}catch(Exception e) {
		System.out.println(e);
	}
}
}

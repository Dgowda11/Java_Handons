package Constructor;

public class PAraCons {

	int id;
	String name;

	PAraCons(int i, String n) {
		id = i;
		name = n;

	}

	void display() {
		System.out.println("Displaying id and name : " + id + " " + name);
	}

	public static void main(String[] args) {
		PAraCons obj = new PAraCons(27, "Dasrhan");
		obj.display();
	}
}

package Encapsulation;

public class SetGet {

	private int rollno;
	private String name;

	public int getRollno() {
		return rollno;
	}

	public void setrollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void SetName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		SetGet obj = new SetGet();
		obj.SetName("Darshan");
		obj.setrollno(27);
		System.out.println(obj.getName());
		System.out.println(obj.getRollno());
	}

}

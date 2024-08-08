package OOPS;

public class AggregationHasHa {
    
	int id;
	String name;
	Address address;
	
	public AggregationHasHa(int id ,String name,Address Address) {
		this.id=id;
		this.name=name;
		this.address=Address;
	}
	void display() {
		System.out.println(id +" "+name);
		System.out.println(address.city +address.state +address.country);
		
	}
	public static void main(String[] args) {
		Address address1 = new Address("gzb", "UP", "India");
		AggregationHasHa e = new AggregationHasHa(111, "Varun", address1);
		e.display();
	}
}

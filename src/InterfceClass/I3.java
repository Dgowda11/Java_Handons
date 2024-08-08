package InterfceClass;

public  class I3  implements I1,I2{

    public void print() {
    	System.out.println("Running");
    }
    public static void main(String[] args) {
		I3 obj = new I3();
		obj.print();
    }
	}
	

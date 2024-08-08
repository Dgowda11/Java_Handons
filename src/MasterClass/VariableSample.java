package MasterClass;

public class VariableSample {   
	
	public void OperatorsTest() {
		int count = 10;
		int extraCount = 2;     ///(=) ==> Assignment operators 
		//System.out.println(count + extraCount);    ////(+-*/) ==> Arithmatic operators
		int totalCount = count;
		/*
		 * if(extraCount >= 2) { totalCount = count + extraCount; }
		 */
		
       totalCount = extraCount == 1? count + extraCount : count;  //conditional Operators 
		System.out.println("Total Count is ::" + totalCount);
		
	}
		public static void main(String[] args) {
			VariableSample obj = new VariableSample();
			obj.OperatorsTest();
			
			
		}
	}
	



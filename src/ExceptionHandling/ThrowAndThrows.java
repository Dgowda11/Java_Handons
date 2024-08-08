package ExceptionHandling;

public class ThrowAndThrows {

	public static void main(String[] args) {

		try {
			doSomething();
		} catch (NumberFormatException e) {
			System.out.println("invalid number you have to give only number");
		} catch (ArrayIndexOutOfBoundsException e) {
		//	throw new ArrayIndexOutOfBoundsException("Give a Index number between 1 and 4");
			System.out.println("Not in the array range");
		} catch (Exception e) {
			System.out.println("Something Went wrong");
		}
	}

	public static void doSomething() throws ArrayIndexOutOfBoundsException, NumberFormatException {
		int UserInput = 0;
		UserInput = Integer.parseInt("8");
		String Fruits[] = { "Bananna", "Watermelons", "Apple", "Mango" };
		System.out.println("User picked" + Fruits[UserInput - 1]);
	}
}

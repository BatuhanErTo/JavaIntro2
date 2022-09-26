package methodOverloading;

public class Main {

	public static void main(String[] args) {
		FourOperation op = new FourOperation();
		int result = op.summation(2, 42, 23);
		System.out.println(result);
	}

}

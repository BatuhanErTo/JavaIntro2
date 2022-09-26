package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "Bugün hava çok";
		String newMessage = sehirVer();
		System.out.println(message);
		System.out.println(newMessage);
		int number = topla(15, 7);
		System.out.println(number);
		int sum = topla2(2, 3, 4);
		System.out.println(sum);

	}

	public static void ekle() {
		System.out.println("Added");
	}

	public static void sil() {
		System.out.println("Deleted");
	}

	public static void guncelle() {
		System.out.println("Updated");
	}

	public static int topla(int number1, int number2) {
		return number1 + number2;
	}

	public static int topla2(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}

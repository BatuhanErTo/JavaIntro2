package methods;

public class Main {

	public static void main(String[] args) {
		findNumber();
	}
	 public static void findNumber() {
	        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
	        int wanted = 6;
	        boolean varMi = false;

	        for (int number : numbers) {
	            if (number == wanted) {
	                varMi = true;
	                break;
	            }
	        }

	        String message = "";
	        if (varMi) {
	        	message = "Sayı mevcuttur : " + wanted;
	            sendMessage(message);
	        } else {
	        	message = "Sayı mevcut değildir : " + wanted;
	        	sendMessage(message);
	        }
	    }
	    public static void sendMessage(String message){
	        System.out.println(message);
	    }

}

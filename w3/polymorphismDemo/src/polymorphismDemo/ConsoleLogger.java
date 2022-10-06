package polymorphismDemo;

public class ConsoleLogger extends BaseLogger{
	public void og(String message) {
		System.out.println("Logged to console : " + message);
	}
}

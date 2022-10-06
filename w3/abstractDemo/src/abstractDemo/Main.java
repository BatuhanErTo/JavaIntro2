package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.dbManager = new OracleDatabaseManager();
		customerManager.add();
	}

}

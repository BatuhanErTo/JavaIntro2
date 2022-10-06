package constructor;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(2,"Banana","best",15,47);
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
	}

}

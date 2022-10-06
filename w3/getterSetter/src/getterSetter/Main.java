package getterSetter;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setName("Banana");
		product.setDescription("One of the best quality");
		product.setStockAmount(12);
		product.setUnitPrice(12.45);
		System.out.println(product.getCode());
	}

}

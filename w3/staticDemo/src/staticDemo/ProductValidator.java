package staticDemo;

public class ProductValidator {
	 static {
	        System.out.println("Static Yapıcı blok çalıştı");
	    }

	    public ProductValidator(){
	        System.out.println("Yapıcı blok çalıştı");
	    }

	    public static boolean isValid(Product product) {
	        return product.price > 0 && !product.name.isEmpty();
	    }
}

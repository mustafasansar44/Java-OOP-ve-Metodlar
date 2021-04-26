
public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1, "Lenovo", "8 Ram", 7000);
		Product product2 = new Product(2, "MSI", "16 Ram", 10000);
		
		Product[] products = {product1, product2};
		
		for(Product product : products) {
			System.out.println("Ürün adý: " + product.name + " Fiyatý: " + product.price);
		}
		System.out.println("----------------- METOD ÝLE ÇALIÞMA ---------------");
		ProductService productService = new ProductService();
		productService.addProduct(product1);
	}

}


public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1, "Lenovo", "8 Ram", 7000);
		Product product2 = new Product(2, "MSI", "16 Ram", 10000);
		
		Product[] products = {product1, product2};
		
		for(Product product : products) {
			System.out.println("�r�n ad�: " + product.name + " Fiyat�: " + product.price);
		}
		System.out.println("----------------- METOD �LE �ALI�MA ---------------");
		ProductService productService = new ProductService();
		productService.addProduct(product1);
	}

}

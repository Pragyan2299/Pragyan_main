package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ProductStoreApp {
	Map<Integer, Product> productsMap = new HashMap<Integer, Product>();

	public static void main(String args[]) {
		ProductStoreApp psm = new ProductStoreApp();
		psm.menu();
	}

	private void menu() {
		Scanner sc = new Scanner(System.in);
		String option = "y";

		while (option.equals("y")) {
			System.err.println("Product App");
			System.err.println("0. List");
			System.err.println("1. Add");
			System.err.println("2. Update");
			System.err.println("4. Delete");
			System.err.println("5. Search");
			System.err.print("Enter choice : ");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 0:
				listProduct();
				break;
			case 1:
				addProduct();
				break;
			default:
				System.out.println("enter valid choice");
				break;
			}
			System.out.println("WANT TO MOVE BACK TO OPTIONS y/n : ?");
			option = sc.nextLine();
		}
		}

	private void listProduct() {
// iterate through map
		for (Entry<Integer, Product> productEntry : productsMap.entrySet())
		{
		Integer productId = productEntry.getKey();
		Product product = productEntry.getValue();
//	System.err.println(productId);
		System.err.println(product);
		}
	}

// IP accept from user
	private void addProduct() {
		System.err.println("Enter Product : ");
		Scanner scanner = new Scanner(System.in);
		int productId = Integer.parseInt(scanner.nextLine());
		String productName = scanner.nextLine();
		float price = Float.parseFloat(scanner.nextLine());
		Product product = new Product(productId, productName, price);
		productsMap.put(product.getProductId(), product);
	}
}

class Product {
	int productId;
	String productName;
	float price;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Product(int productId, String productName, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}

}

package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.usedProduct;
import entities.importedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list=new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Product #"+i+" data:");
			System.out.println("Common, used or imported? (c/u/i)");
			char ch = sc.next().charAt(0);
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Price: ");
			double price = sc.nextDouble();
			if(ch =='u') {
				System.out.println("manufactured date: ");
				sc.nextLine();
				String date = sc.nextLine();
				Product pro = new usedProduct(name,price,date);
				list.add(pro);
			}else if(ch =='i') {
				System.out.println("Custom fee: ");
				double customfee=sc.nextDouble();
				Product pro = new importedProduct(name,price,customfee);
				list.add(pro);
			}else if(ch=='c'){
				Product pro = new Product(name, price);
				list.add(pro);
			}
	
		}
		System.out.println("Prices list");
		for(Product pro:list) {
			System.out.println(pro);
		}
		sc.close();
	}
}

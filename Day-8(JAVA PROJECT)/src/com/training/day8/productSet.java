package com.training.day8;
import java.util.*;
public class productSet {
	private Set<product> productset;
	private Scanner sc;
	int noofproduct;
	
	public productSet() {
		productset= new HashSet<>();
		sc= new Scanner(System.in);
	}
	public void insert() {
		System.out.println("Enter the no of products u want to have ");
		 noofproduct=sc.nextInt();
		for(int x=1;x<=noofproduct;x++) {
			product p= new product();
			System.out.println("Enter the Category ");
			p.setCategory(sc.next());
			System.out.println("Enter the product id ");
			p.setProductid(sc.nextInt());
			System.out.println("Enter the product name ");
			p.setProductname(sc.next());
			System.out.println("Enter the product price ");
			p.setProductprice(sc.nextDouble());
			boolean result= productset.add(p);
			if(!result) {
				System.out.println("Product already added");
			}
			else {
				System.out.println("product added successfully");
			}
				
			}
		}
		
	
		public void search() {
			System.out.println("Enter the name of Category u want to search");
			String category=sc.next();
			for(product p:productset) {
				if(p.getCategory().equals(category)) {
					System.out.println("The product name  is "+p.getProductname());
			}
			}
				
			
		}
		public void totalCost() {
			double total=0;
			for(product p:productset) {
				total=total+p.getProductprice();
			}
			System.out.println("The total price of all products are "+total);

		}
		public void salePrice() {
			for(product p:productset) {
				double saleprice=0;

				saleprice= p.getProductprice()+(20*p.getProductprice()/100);
				System.out.println("The Saleprice of each product is "+saleprice);

			}

		}
	
	
	public static void main(String[] args) {
		productSet pd= new productSet();
		pd.insert();
		pd.search();
		pd.totalCost();
		pd.salePrice();
	}
}

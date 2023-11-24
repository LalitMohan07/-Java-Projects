package onlinestore.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import onlinestore.entity.Product;
import onlinestore.entity.User;
import onlinestore.session.SessionFact;

public class UserInformation {
	private Scanner sc;
	Session session;
	SessionFactory ses;
	ProductInformation product;
	Transaction tx;
	Userinfo uinfo;
	public UserInformation() {
		sc= new Scanner(System.in);
		ses=SessionFact.getSession();
		product = new ProductInformation();
		uinfo= new Userinfo();

	}
	public void register(User u) {
		session=ses.openSession();
		tx=session.beginTransaction();
		for(int x=1;x<=1;x++) {
			System.out.println("Enter the user name ");
			u.setUsername(sc.next());
			System.out.println("Enter the password");
			u.setPassword(sc.next());
			System.out.println("Enter the email id ");
			u.setEmailid(sc.next());
			System.out.println("Enter the usertype ");
			u.setUsertype(sc.next());
			u.setSupercoins(100);
			session.save(u);
			tx.commit();
		}
	}
	public void Validation() {
		session=ses.openSession();
		tx=session.beginTransaction();
		System.out.println("ENter the username ");
		String username=sc.next();
		System.out.println("ENter the password ");
		String password =sc.next();
		Query query =session.createQuery("select d from User d where d.username =: uname and d.password =: pass " );
		query.setParameter("uname", username);
		query.setParameter("pass", password);
		List<User> ulist =query.list();
		if(!ulist.isEmpty()) {
			for(User u:ulist) {
				String utype=u.getUsertype();
				if(utype.equals("admin")){
					System.out.println("Admin logged in Successfully");
					String choice="y";
					int ch=0;
					while(choice.equals("y")) {
						System.out.println("Enter your choice ");
						System.out.println("1.Insert the products ");
						System.out.println("2.Search product by productid ");
						System.out.println("3.Products by category ");
						System.out.println("4. search Products by name ");
						System.out.println("5.check the total amount");
						System.out.println("6.Display the profit ");
						System.out.println("7.Exit ");

						ch=sc.nextInt();
						switch(ch) {
						case 1:
							
							product.insertProduct(u);
							
							break;
						
						  case 2:
							  product.searchbyproductid(); 
							  break;
						  case 3:
							  product.listbycategory();
							  break;
						  case 4: 
							  product.searchbyname();
							  break;
						  
						  case 5: 
							 product.totalamount(); break; 
						  case 6: 
							 product.profitamt(); break;
						  case 7:
						  
						  Validation(); break;
						 
						
						}
							
						System.out.println("Do you want to continue(Y/N");
						choice=sc.next();

						}
				}
				else if(utype.equals("user")) {
					System.out.println("User logged in Successfully");
					String choice="y";
					int ch=0;
					while(choice.equals("y")) {
						System.out.println("Enter your choice ");
						System.out.println("1.Display the details of product");
						System.out.println("2.Allow user to register ");
						System.out.println("3.Avail 100 supercoins ");
						System.out.println("4. filter on price and category ");
						System.out.println("5. Add the products to the cart and display the bill ");

						System.out.println("6.Exit ");
						
						
						ch=sc.nextInt();
						switch(ch) {
						case 1:
							uinfo.listbycategory();
							
							break;
						case 2:
							System.out.println("--------------------U need to register--------------");
							register(u);
							System.out.println("-------------These are the list of products-------------- ");
							uinfo.listbycategory();
							break;
						case 3:
							System.out.println("100 Supercoins for the new user as a welcome bonus has been credited");
							break;
						case 4:
							uinfo.categoryAndPrice();
							break;
						case 5:
							uinfo.UserCart();
							break;
						case 6:
							System.out.println("Thank you fo shopping with us.....visit Again!");
							System.exit(0);
							break;
							
						}
				
						
					System.out.println("Do you want to continue(Y/N");
					choice=sc.next();

				}
				}
			}
			
		}else {
			System.out.println("Wrong username password....pls try again!");
		}
	}
	
}

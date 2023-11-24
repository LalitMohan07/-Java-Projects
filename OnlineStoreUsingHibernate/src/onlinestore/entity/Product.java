package onlinestore.entity;



public class Product extends Item  {
	private int productid;
	private String productname;
	public double sellingprice;
	private int availableQuantity;
	
	
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getSellingprice() {
		return sellingprice;
	}
	public void setSellingprice(double sellingprice) {
		
		this.sellingprice=sellingprice;
	}
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	private User userobj;
	public User getUserobj() {
		return userobj;
	}
	public void setUserobj(User userobj) {
		this.userobj = userobj;
	}
}
package poduct.onetoone;

public class Product {
	private Integer productid;
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}

	private String productname;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public ProductDetail getPobj() {
		return pobj;
	}
	public void setPobj(ProductDetail pobj) {
		this.pobj = pobj;
	}
	
	private String category;
	private ProductDetail pobj;
	
}

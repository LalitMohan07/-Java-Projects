package poduct.onetoone;

public class ProductDetail {
	private Integer productid;
	public Product getProductobj() {
		return productobj;
	}
	public void setProductobj(Product productobj) {
		this.productobj = productobj;
	}
	private Product productobj; 
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getManufacturername() {
		return manufacturername;
	}
	public void setManufacturername(String manufacturername) {
		this.manufacturername = manufacturername;
	}
	public String getDateofexpire() {
		return dateofexpire;
	}
	public void setDateofexpire(String dateofexpire) {
		this.dateofexpire = dateofexpire;
	}
	public String getDateofmanufacture() {
		return dateofmanufacture;
	}
	public void setDateofmanufacture(String dateofmanufacture) {
		this.dateofmanufacture = dateofmanufacture;
	}
	private String manufacturername;
	private String dateofexpire;
	private String dateofmanufacture;
}

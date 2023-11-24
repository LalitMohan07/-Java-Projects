package myshopee;

public class Item {
	private int itemcode;
	public int getItemcode() {
		return itemcode;
	}
	public void setItemcode(int itemcode) {
		this.itemcode = itemcode;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public double getItemprice() {
		return itemprice;
	}
	public void setItemprice(double itemprice) {
		this.itemprice = itemprice;
	}
	public int getQoh() {
		return qoh;
	}
	public void setQoh(int qoh) {
		this.qoh = qoh;
	}
	private Customer custobj;
	public Customer getCustobj() {
		return custobj;
	}
	public void setCustobj(Customer custobj) {
		this.custobj = custobj;
	}
	private String itemname;
	private double itemprice;
	private int qoh;
}

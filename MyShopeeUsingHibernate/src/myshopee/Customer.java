package myshopee;

import java.util.Set;

public class Customer {
	private int customercode;
	public int getCustomercode() {
		return customercode;
	}
	public void setCustomercode(int customercode) {
		this.customercode = customercode;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	private String customername;
	private String phonenumber;
	private String address;
	public Set<Item> getItemset() {
		return itemset;
	}
	public void setItemset(Set<Item> itemset) {
		this.itemset = itemset;
	}

	private Set<Item> itemset;
}

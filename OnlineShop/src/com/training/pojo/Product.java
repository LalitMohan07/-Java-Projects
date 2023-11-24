package com.training.pojo;

import java.util.Map;

public class Product extends Item  {
	private int productid;
	private String productname;
	public double sellingprice;
	private int availableQuantity;
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getBuyingprice() {
		return buyingprice;
	}
	public void setBuyingprice(double buyingprice) {
		this.buyingprice = buyingprice;
	}
	private String itemname;
	private String category;
	private double buyingprice;
	

	/*
	 * public Map<Integer, Product> getProductmap() { return productmap; } public
	 * void setProductmap(Map<Integer, Product> productmap) { this.productmap =
	 * productmap; } private Map<Integer,Product> productmap;
	 */
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
		//System.out.println("Selling price ");
		//this.sellingprice = this.buyingprice+(this.buyingprice*0.05);
		this.sellingprice=sellingprice;
	}
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
}

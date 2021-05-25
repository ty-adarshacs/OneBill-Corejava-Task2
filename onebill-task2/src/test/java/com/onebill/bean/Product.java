package com.onebill.bean;

public class Product {
	// System.out.println("-----------------------------------------------------------");

	private String product_Name;
	private String product_Code;
	private String product_Description;
	private String price_Plan_Name;
	private String price_Plan_Code;
	private String price_Plan_Description;
	private String onetime_Fee;
	private String recurring_Fee;

	public Product(String product_Name, String product_Code, String product_Description, String price_Plan_Name,
			String price_Plan_Code, String price_Plan_Description, String onetime_Fee, String recurring_Fee) {
		super();
		this.product_Name = product_Name;
		this.product_Code = product_Code;
		this.product_Description = product_Description;
		this.price_Plan_Name = price_Plan_Name;
		this.price_Plan_Code = price_Plan_Code;
		this.price_Plan_Description = price_Plan_Description;
		this.onetime_Fee = onetime_Fee;
		this.recurring_Fee = recurring_Fee;
	}

	public Product() {

	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public String getProduct_Code() {
		return product_Code;
	}

	public void setProduct_Code(String product_Code) {
		this.product_Code = product_Code;
	}

	public String getProduct_Description() {
		return product_Description;
	}

	public void setProduct_Description(String product_Description) {
		this.product_Description = product_Description;
	}

	public String getPrice_Plan_Name() {
		return price_Plan_Name;
	}

	public void setPrice_Plan_Name(String price_Plan_Name) {
		this.price_Plan_Name = price_Plan_Name;
	}

	public String getPrice_Plan_Code() {
		return price_Plan_Code;
	}

	public void setPrice_Plan_Code(String price_Plan_Code) {
		this.price_Plan_Code = price_Plan_Code;
	}

	public String getPrice_Plan_Description() {
		return price_Plan_Description;
	}

	public void setPrice_Plan_Description(String price_Plan_Description) {
		this.price_Plan_Description = price_Plan_Description;
	}

	public String getOnetime_Fee() {
		return onetime_Fee;
	}

	public void setOnetime_Fee(String onetime_Fee) {
		this.onetime_Fee = onetime_Fee;
	}

	public String getRecurring_Fee() {
		return recurring_Fee;
	}

	public void setRecurring_Fee(String recurring_Fee) {
		this.recurring_Fee = recurring_Fee;
	}

	@Override
	public String toString() {
		return "Product [product_Name=" + product_Name + ", product_Code=" + product_Code + ", product_Description="
				+ product_Description + ", price_Plan_Name=" + price_Plan_Name + ", price_Plan_Code=" + price_Plan_Code
				+ ", price_Plan_Description=" + price_Plan_Description + ", onetime_Fee=" + onetime_Fee
				+ ", recurring_Fee=" + recurring_Fee + "]";
	}

}

package com.infrrd.ims.inventorymanagementsystem.entity;

import java.util.Date;

public class Product {

	private Integer productId;

	private String productName;

	private double buyingPrice;

	private double sellingPrice;

	private double version;

	private String type;

	private Date createDate;

	public Product(Integer productId, String productName, double buyingPrice, double sellingPrice, double version,
			String type, Date createDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.buyingPrice = buyingPrice;
		this.sellingPrice = sellingPrice;
		this.version = version;
		this.type = type;
		this.createDate = createDate;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getBuyingPrice() {
		return buyingPrice;
	}

	public void setBuyingPrice(double buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", buyingPrice=" + buyingPrice
				+ ", sellingPrice=" + sellingPrice + ", version=" + version + ", type=" + type + "]";
	}
}

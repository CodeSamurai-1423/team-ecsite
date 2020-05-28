package jp.co.internous.phoenix.model.domain;

import java.sql.Timestamp;

import jp.co.internous.phoenix.model.form.CartForm;

public class TblCart {
	
	private int id;
	private int userId;
	private int productId;
	private int productCount;
	private Timestamp createdAt;
	private Timestamp uploadedAt;
	
	public TblCart() {}
	
	public TblCart(CartForm f) {
		setUserId(f.getUserId());
		setProductId(f.getProductId());
		setProductCount(f.getProductCount());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUploadedAt() {
		return uploadedAt;
	}

	public void setUploadedAt(Timestamp uploadedAt) {
		this.uploadedAt = uploadedAt;
	}
}

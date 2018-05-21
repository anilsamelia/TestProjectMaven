package edu.paypal;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product  implements Serializable{
	private int productId;
	private String productName;
	private float cost;
	
	
	
	public Product() {
		super();
	}


	public Product(int productId, String productName, float cost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.cost = cost;
	}
	
	
	public int getProductId() {
		return productId;
	}
	public Product setProductId(int productId) {
		this.productId = productId;
		return this;
	}
	public String getProductName() {
		return productName;
	}
	public Product setProductName(String productName) {
		this.productName = productName;
		return this;
	}
	public float getCost() {
		return cost;
	}
	public Product setCost(float cost) {
		this.cost = cost;
		return this;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", cost=" + cost + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(cost);
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Float.floatToIntBits(cost) != Float.floatToIntBits(other.cost))
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		return true;
	}
	
	
	

}

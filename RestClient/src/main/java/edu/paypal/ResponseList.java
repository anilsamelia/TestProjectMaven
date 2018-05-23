package edu.paypal;
/**
 * @author Samelia
 */

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class ResponseList implements Serializable{
	
	private List<Product> productlist;
	private String status;

	public List<Product> getProductlist() {
		return productlist;
	}

	public void setProductlist(List<Product> productlist) {
		this.productlist = productlist;
	}

	public String getStatus() {
		return status;
	}

	public ResponseList setStatus(String status) {
		this.status = status;
		return this;
	}

	@Override
	public String toString() {
		return "ResponseList [productlist=" + productlist + ", status=" + status + "]";
	}
	
	
	

}

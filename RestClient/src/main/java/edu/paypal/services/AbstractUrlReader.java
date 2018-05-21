package edu.paypal.services;

import java.io.IOException;
import java.util.Properties;

import edu.paypal.Product;
import edu.paypal.util.Constants;

public abstract class AbstractUrlReader {
	
	static Properties propertes;
	
	static {
		propertes =new Properties();
		try {
			propertes.load(Product.class.getClassLoader().getResourceAsStream("RestUrl.properties"));
			String profile=propertes.getProperty("profile");
			propertes.getProperty(profile+Constants.url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}

package com.collection.framework.ecom;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) 
	{
	 Set<Ecommerce> products = new HashSet<Ecommerce>();
	 
	 products.add(new Ecommerce("pr101","Trimmer", 1150.00, "OutForDelivery"));
	 products.add(new Ecommerce("pr102","Cricket Bat", 2359.00, "Shipped"));
	 products.add(new Ecommerce("pr103","Badminton", 569.00, "Ordered"));
	 products.add(new Ecommerce("pr104","Snacks",360.00, "OutForDelivery"));
	 products.add(new Ecommerce("pr105","Buiscuits", 458.00, "Shipped"));
	 products.add(new Ecommerce("pr106","Shirts", 5730.00, "OutForDelivery"));
	  
	  TreeSet<Ecommerce> prodList = new TreeSet<Ecommerce>();
	  
	  prodList.addAll(products);
	  
	  Iterator<Ecommerce> itr = prodList.iterator();
	  while(itr.hasNext()) {
		  
		  Ecommerce ecom = itr.next();
		  
		  System.out.println(ecom.toString());
	  }
	  
	  
	 
	}
}

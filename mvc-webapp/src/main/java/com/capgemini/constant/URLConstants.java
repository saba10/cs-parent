package com.capgemini.constant;

/**
 * @author dimehta
 *
 */
public class URLConstants {

	public static final String GET_CART="http://10.246.16.166:1003/cart/detail?userId={userId}";
	public static final String ADD_TO_CART= "http://10.246.16.166:1003/cart/add?userId={userId}&productId={productId}&quantity=1";
	public static final String DELETE_FROM_CART= "http://10.246.16.166:1003/cart/deleteProduct?userId={userId}&productId={productId}";
	public static final String CLEAR_CART= "http://10.246.16.166:1003/cart/empty?userId={userId}";
}

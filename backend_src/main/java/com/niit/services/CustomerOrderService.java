package com.niit.services;

import com.niit.model.Cart;
import com.niit.model.CustomerOrder;

public interface CustomerOrderService {
	CustomerOrder createOrder(Cart cart);
}

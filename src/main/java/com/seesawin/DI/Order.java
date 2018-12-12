package com.seesawin.DI;

import java.util.List;

public class Order {
	private List<OrderDtl> orderDtl;

	public Order() {
	}

	public Order(List<OrderDtl> orderDtl) {
		super();
		this.orderDtl = orderDtl;
	}

	public List<OrderDtl> getOrderDtl() {
		return orderDtl;
	}

	public void setOrderDtl(List<OrderDtl> orderDtl) {
		this.orderDtl = orderDtl;
	}

}

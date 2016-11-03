package dataservice;

import po.orderPO;

public interface orderData {
	public boolean insert(orderPO user);
	public boolean delete(orderPO user);
	public boolean update(orderPO user);
	public orderPO getOrder(String orderID);
	public orderPO[] getOrderList(String userID);
}

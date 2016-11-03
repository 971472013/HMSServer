package stub;
import dataservice.orderData;
import po.orderPO;

public class orderData_stub implements orderData{
	@Override
	public boolean insert(orderPO Order) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean delete(orderPO Order) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean update(orderPO Order) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public orderPO getOrder(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public orderPO[] getOrderList(String OrderID) {
		// TODO Auto-generated method stub
		return null;
	}
}

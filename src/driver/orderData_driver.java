package driver;

import po.orderPO;
import stub.orderData_stub;

public class orderData_driver {
	orderData_stub service = new orderData_stub();
	public void getOrder() {
		// TODO Auto-generated method stub
		service.getOrder("541322049");
		System.out.println("�ɹ��õ�����");
	}

	
	public void updateOrder(orderPO user) {
		// TODO Auto-generated method stub
		System.out.println("�ɹ�����");
		System.out.println(service.update(user));
	}

	public void addOrder(orderPO user) {
		// TODO Auto-generated method stub
		System.out.println("�ɹ����");
		System.out.println(service.insert(user));
	}

	
	public void deleteOrder(orderPO user) {
		// TODO Auto-generated method stub
		System.out.println("�ɹ�ɾ��");
		System.out.println(service.delete(user));
	}


	public void getList() {
		// TODO Auto-generated method stub
		System.out.println(service.getOrderList("limit"));
	}
	
	public static void main(String[] args) {
		orderData_driver driver = new orderData_driver();
		orderPO Order = new orderPO("1997-2-2", "1997-2-5", "�󴲷�", 2, "��", 0, 450);
		driver.addOrder(Order);
		driver.getOrder();
		driver.getList();
		driver.updateOrder(Order);
		driver.deleteOrder(Order);
	}



}

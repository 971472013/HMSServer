package stub;

import java.util.ArrayList;

import dataservice.hotelData;
import po.hotelPO;
import po.memberPO;
import po.orderPO;
import po.roomPO;

public class hotelData_stub implements hotelData{

	String memberID;
	String name;
	String level;
	String address;
	String district;
	int credit;
	int phone;
	String checkInTime;
	String checkOutTime;
	String roomType;
	int roomNumber;
	String promotion;
	double discount;
	double price;
	
	public hotelData_stub(String memberID,String name,String level,String address,
			String district,int credit,int phone,String checkInTime,String checkOutTime,
			String roomType,int roomNumber,String promotion,double discount,double price){
		this.memberID=memberID;
		this.name=name;
		this.level=level;
		this.address=address;
		this.district=district;
		this.credit=credit;
		this.phone=phone;
		this.checkInTime=checkInTime;
		this.checkOutTime=checkOutTime;
		this.roomType=roomType;
		this.roomNumber=roomNumber;
		this.promotion=promotion;
		this.district=district;
		this.price=price;
	}
	
	@Override
	public memberPO getMInformation(String memberID) {
		// TODO Auto-generated method stub
		return new memberPO(memberID,name,level,credit,phone);
	}

	@Override
	public ArrayList<orderPO> getOrderList(String hotelID, String time) {
		// TODO Auto-generated method stub
		ArrayList<orderPO> orderList=new ArrayList<orderPO>();
		orderList.add(new orderPO(checkInTime, checkOutTime, roomType, roomNumber,
				promotion, discount, price));
		return orderList;
	}

	@Override
	public orderPO getOrder(String orderID) {
		// TODO Auto-generated method stub
		return new orderPO(checkInTime, checkOutTime, roomType, roomNumber,
				promotion, discount, price);
	}

	@Override
	public hotelPO getHotelInformat(String hotelID) {
		// TODO Auto-generated method stub
		return new hotelPO(hotelID, name, address, level, district);
	}

	@Override
	public boolean updataOrder(String orderID, orderPO OR) {
		// TODO Auto-generated method stub
		System.out.println("�������³ɹ�");
		return true;
	}

	@Override
	public boolean updataHotelInformat(hotelPO po) {
		// TODO Auto-generated method stub
		System.out.println("�Ƶ���Ϣ���³ɹ�");
		return true;
	}

	@Override
	public boolean check(String orderID, String memberID, roomPO RO,int mark) {
		// TODO Auto-generated method stub
		if(mark==1){
			System.out.println("��ס�ɹ�");
			return true;
		}
		else if(mark==0){
			System.out.println("�˷��ɹ�");
			return true;
		}
		else{
			System.out.println("����ʧ��");
			return false;
		}
	}
	
}
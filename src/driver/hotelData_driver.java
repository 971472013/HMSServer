package driver;

import blservice.hotelblservice;
import dataservice.hotelData;
import po.hotelPO;
import po.orderPO;
import po.roomPO;
import stub.hotelData_stub;


public class hotelData_driver {

	static String hotelID="0111";
	static String memberID="0011";
	static String orderID="0001";
	static String time="2016-1-1";
	
	static String name="zgq";
	static String level="max";
	static String address="some place";
	static String district="wangda";
	static int credit=5000;
	static int phone=110;
	static String checkInTime="2016-10-01";
	static String checkOutTime="2016-10-01";
	static String roomType="A";
	static int roomNumber=110;
	static String promotion="best";
	static double discount=100;
	static double price=10;
	
	static String roomID="0000";
	static roomPO RO=new roomPO(true, 111, null,(int) price);
	
	public void drive(hotelData H	){
		System.out.println(H.getHotelInformat(hotelID));
		System.out.println(H.check(orderID, memberID, roomID, RO, 0));
		System.out.println(H.getOrder(orderID));
		System.out.println(H.getOrderList(hotelID, time));
		System.out.println(H.getMInformation(memberID));
		System.out.println(H.updataHotelInformat(hotelID, new hotelPO(hotelID, name, address, level, district)));
		System.out.println(H.updataOrder(orderID, new orderPO(checkInTime, checkOutTime, roomType, roomNumber,
				promotion, discount, price)));
	}
	
	public static void main(String[] args) {
		
		hotelData H=new hotelData_stub(memberID, name, level, address, district, credit, phone, checkInTime, checkOutTime, roomType, roomNumber, promotion, discount, price);
		hotelDataDrive drive=new hotelDataDrive();
		drive.drive(H);
		
	}

}

package dataservice;

import java.util.ArrayList;

import po.hotelPO;
import po.memberPO;
import po.orderPO;
import po.roomPO;

public interface hotelData {

	public memberPO getMInformation(String memberID);
	public ArrayList<orderPO> getOrderList (String hotelID,String time);
	public orderPO getOrder(String orderID);
	public hotelPO getHotelInformat (String hotelID);
	public boolean updataOrder  (String orderID,orderPO OR);
	public boolean updataHotelInformat (String hotelID,hotelPO po);
	public boolean check (String orderID,String memberID,String roomID,roomPO RO,int mark);
}
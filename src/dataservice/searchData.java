package dataservice;

import java.util.ArrayList;

import po.*;

public interface searchData {

	public ArrayList<hotelPO> getHotelList(String str, searchHotelInfo info);
	public ArrayList<roomPO> getRoomList(String hotelID);
	
	enum searchHotelInfo {
		DISTRICT, ADDRESS
	}
}


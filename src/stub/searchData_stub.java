package stub;

import java.util.ArrayList;

import dataservice.searchData;
import po.*;

public class searchData_stub implements searchData {

	private ArrayList<hotelPO> hotelList;
	
	@Override
	public ArrayList<hotelPO> getHotelList(String str, searchHotelInfo info) {
		// TODO Auto-generated method stub
		ArrayList<hotelPO> resultList = new ArrayList<hotelPO>();
		
		if(info.equals(searchHotelInfo.ADDRESS)) {
			for(int i=0; i<hotelList.size(); i++) {
				if(str.equals(hotelList.get(i).getAddress())) {
					resultList.add(hotelList.get(i));
				}
			}
		} else {
			for(int i=0; i<hotelList.size(); i++) {
				if(str.equals(hotelList.get(i).getDistrict())) {
					resultList.add(hotelList.get(i));
				}
			}
		}
		return resultList;
	}

	@Override
	public ArrayList<roomPO> getRoomList(String hotelID) {
		// TODO Auto-generated method stub
		for(int i=0; i<hotelList.size(); i++) {
			if(hotelList.get(i).getHotelID().equals(hotelID)) {
				return hotelList.get(i).getRoomList();
			}
		}
		return null;
	}

	public ArrayList<hotelPO> getHotelList() {
		return hotelList;
	}

	public void setHotelList(ArrayList<hotelPO> hotelList) {
		this.hotelList = hotelList;
	}

}

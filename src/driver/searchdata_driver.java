package driver;

import dataservice.searchData.searchHotelInfo;
import stub.searchData_stub;

public class searchdata_driver {

	searchData_stub search;
	
	public searchdata_driver(searchData_stub search) {
		this.search = search;
	}
	
	public void drive() {
		search.getHotelList("XianLinBigRoad", searchHotelInfo.ADDRESS);
		search.getRoomList("88888888");
	}
	
	public static void main(String[] args) {
		new searchdata_driver(new searchData_stub());
	}

}

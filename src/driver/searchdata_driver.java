package driver;

import dataservice.searchData.searchHotelInfo;
import stub.searchData_stub;

public class searchData_driver {

	searchData_stub search;
	
	public searchData_driver(searchData_stub search) {
		this.search = search;
	}
	
	public void drive() {
		search.getHotelList("XianLinBigRoad", searchHotelInfo.ADDRESS);
		search.getRoomList("88888888");
	}
	
	public static void main(String[] args) {
		new searchData_driver(new searchData_stub());
	}

}

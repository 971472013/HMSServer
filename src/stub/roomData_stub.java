package stub;

import dataservice.roomData;
import po.Room_Type;
import po.roomPO;

public class roomData_stub implements roomData {

	private boolean valid;
	private int number;
	private Room_Type type;
	private int price;
	
	public roomData_stub(){
		// TODO Auto-generated constructor stub
		
	}
	
	@Override
	public roomPO getRoom(String ID) {
		// TODO Auto-generated method stub
		return new roomPO(valid, number, type, price);
	}

	@Override
	public boolean updateRoom(roomPO room) {
		// TODO Auto-generated method stub
		return true;
	}

}

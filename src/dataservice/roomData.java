package dataservice;

import po.roomPO;

public interface roomData {

	public roomPO getRoom(String ID) ;
	public boolean updateRoom(roomPO room) ;
}

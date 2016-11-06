package dataservice;

import po.RoomPO;

public interface RoomDataService {

	public RoomPO getRoom(String ID) ;
	public boolean updateRoom(RoomPO room) ;
}

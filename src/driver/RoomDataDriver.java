package driver;

import dataservice.RoomDataService;
import po.RoomType;
import po.RoomPO;
import stub.RoomDataStub;

public class RoomDataDriver {

	RoomDataService service = new RoomDataStub();
	public RoomDataDriver(RoomPO room){
		System.out.println("----update Room----");
		System.out.println(service.updateRoom(room));
		System.out.println("----find Room----");
		System.out.println(service.getRoom("521"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RoomPO room=new RoomPO(true , 521, RoomType.Normal, 250);
		new RoomDataDriver(room);
			
	}

}

package driver;

import dataservice.roomData;
import po.Room_Type;
import po.roomPO;
import stub.roomData_stub;

public class roomData_driver {

	roomData service = new roomData_stub();
	public roomData_driver(roomPO room){
		System.out.println("----update Room----");
		System.out.println(service.updateRoom(room));
		System.out.println("----find Room----");
		System.out.println(service.getRoom("521"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		roomPO room=new roomPO(true , 521, Room_Type.Normal, 250);
		new roomData_driver(room);
			
	}

}

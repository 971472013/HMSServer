package driver;


import po.memberPO;
import stub.memberData_stub;


public class memberData_driver {

	static String memberID="0001";
	static String name="sadasd";
	static String level="max";
	static int credit=5000;
	static int phone=110;
	
	public void drive(memberPO M){
		memberData_stub memberDate = new memberData_stub(memberID, name,  level, credit, phone);
		System.out.println(memberDate.saveMInformation(memberID, M));
		System.out.println(memberDate.getMInformation(memberID));
		System.out.println(memberDate.getCreditList(memberID));
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		memberDate_drive drive =new memberDate_drive();
		drive.drive(new memberPO(memberID, name, level, credit, phone));
	}

}

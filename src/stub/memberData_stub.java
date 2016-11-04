package stub;

import java.util.ArrayList;

import dataservice.memberData;
import po.memberPO;

public class memberData_stub implements memberData {

	String memberID;
	String name;
	String level;
	int credit;
	int phone;

	public memberData_stub(String memberID, String name, String level, int credit, int phone) {
		this.memberID=memberID;
		this.name=name;
		this.level=level;
		this.credit=credit;
		this.phone=phone;
	}
	
	@Override
	public memberPO getMInformation(String memberID) {
		// TODO Auto-generated method stub
		return new memberPO(memberID, name, level, credit, phone);
	}

	@Override
	public boolean saveMInformation(String memberID, memberPO M) {
		// TODO Auto-generated method stub
		System.out.println("用户信息保存成功");
		return true;
	}

	@Override
	public ArrayList<String> getCreditList(String memberID) {
		// TODO Auto-generated method stub
		ArrayList<String> creditList=new ArrayList<String>();
		creditList.add("2016-10-01			+100");
		return creditList;
	}

}
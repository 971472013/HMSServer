package dataservice;

import java.util.ArrayList;

import po.memberPO;

public interface memberData {

	public memberPO getMInformation (String memberID);
	public boolean saveMInformation (String memberID,memberPO M);
	public ArrayList<String> getCreditList (String memberID);
}

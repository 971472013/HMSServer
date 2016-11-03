package stub;

import java.util.ArrayList;

import dataservice.userData;
import po.UserRole;
import po.userPO;


public class userData_stub implements userData {

	private String ID="541322049";
	private String password="DREAMING";
	private String name="zhangxinyue";
	private UserRole role;
	private ArrayList<userPO> list = new ArrayList<userPO>();
	
	public userData_stub () {
		list.add(new userPO(ID, password, name, role));
	}
	@Override
	public boolean insert(userPO user) {
		// TODO Auto-generated method stub
		ID=user.getID();
		password=user.getPassword();
		name=user.getName();
		role=user.getUserRole();
		list.add(new userPO(ID, password, name, role));
		return true;
	}

	@Override
	public boolean delete(userPO user) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++){
			if(list.get(i).getID().equals(user.getID())){
				list.remove(i);
			}
		}
		return true;
	}

	@Override
	public boolean update(userPO user) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++){
			if(list.get(i).getID().equals(user.getID())){
				list.remove(i);
				list.add(user);
			}
		}
		return true;
	}

	@Override
	public userPO getUser(String ID) {
		// TODO Auto-generated method stub
		return new userPO(ID,password,name,role);
	}

	@Override
	public ArrayList<userPO> getList(String limit) {
		// TODO Auto-generated method stub
		return list;
	}
	

}

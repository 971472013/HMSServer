package dataservice;

import java.util.ArrayList;

import po.userPO;

public interface userData {

	public boolean insert(userPO user);
	public boolean delete(userPO user);
	public boolean update(userPO user);
	public userPO getUser(String ID);
	public ArrayList<userPO> getList(String limit);
}

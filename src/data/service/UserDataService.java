package data.service;

import java.util.ArrayList;

import po.UserPO;

public interface UserDataService {

	public boolean insert(UserPO user);
	public boolean delete(UserPO user);
	public boolean update(UserPO user);
	public UserPO getUser(String ID);
	public ArrayList<UserPO> getList(String limit);
}

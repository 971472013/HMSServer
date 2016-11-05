package driver;

import dataservice.userData;
import po.UserRole;
import po.userPO;
import stub.userData_stub;

public class userData_driver {


	userData service = new userData_stub();
	public void getUser() {
		// TODO Auto-generated method stub
		service.getUser("541322049");
		System.out.println("---查找用户———");
	}

	
	public void updateUser(userPO user) {
		// TODO Auto-generated method stub
		System.out.println("---更新用户———");
		System.out.println(service.update(user));
	}

	public void addUser(userPO user) {
		// TODO Auto-generated method stub
		System.out.println("---新增用户———");
		System.out.println(service.insert(user));
	}

	
	public void deleteUser(userPO user) {
		// TODO Auto-generated method stub
		System.out.println("---删除用户———");
		System.out.println(service.delete(user));
	}


	public void getList() {
		// TODO Auto-generated method stub
		System.out.println(service.getList("limit"));
	}
	
	public static void main(String[] args) {
		userData_driver driver = new userData_driver();
		userPO user = new userPO("1234", "1234", "xyj", UserRole.SALER);
		driver.addUser(user);
		driver.getUser();
		driver.getList();
		driver.updateUser(user);
		driver.deleteUser(user);
	}
	
}

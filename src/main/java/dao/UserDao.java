package dao;

import java.util.List;

import pojo.User;

public interface UserDao {
	
	//增
	boolean insertUser(User user);
	
	//删
	int deleteUser(int id);
	
	//改
	int updateUser(User user);
	
	//查
	List<User> queryUsers();
}

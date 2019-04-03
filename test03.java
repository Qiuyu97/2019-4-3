package com.qiuyu.bean;

public class User {
   //list中有N个User对象，每个对象包括userId, userName, userSCO
	private int userId;
	private String userName;
	private int userSCO;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserSCO() {
		return userSCO;
	}
	public void setUserSCO(int userSCO) {
		this.userSCO = userSCO;
	}
	
}

///////////////////////////////////////////////////////

package com.qiuyu.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test03 {

	//给定一下信息：
	//List<User> list = new ArrayList<User>();
	//list中有N个User对象，每个对象包括userId, userName, userSCO
	//请编写代码实现列表中User对象的顺序按照userSCO从小到大。
	public static void main(String[] args) {
	 User user1=getUser(1, "aaa", 97);
	 User user2=getUser(2, "bbb", 100);
	 User user3=getUser(3, "bbb", 66);
	 User user4=getUser(4, "ddd", 77);
	 List<User> list = new ArrayList<User>();
	 list.add(user1);
	 list.add(user2);
	 list.add(user3);
	 list.add(user4);
	 System.out.print("排序前：");
	 for(User u:list) {
		 System.out.print(u.getUserSCO()+" ");
	 }
	  
	 Collections.sort(list,new Comparator<User>() {
       //按照用户分数升序排序
		@Override
		public int compare(User a, User b) {
			if (a.getUserSCO()>b.getUserSCO()) {
				return 1;
			}
			if (a.getUserSCO()==b.getUserSCO()) {
				return 0;
			}
			return -1;
		}
 
	});
	 System.out.println();
	 System.out.print("排序后：");
	 for(User u:list) {
		 System.out.print(u.getUserSCO()+" ");
	 }
	}
	
	public static User getUser(int userId,String userName,int userSCO) {
		User user=new User();
		user.setUserId(userId);
		user.setUserName(userName);
		user.setUserSCO(userSCO);
		return user;
	}

}

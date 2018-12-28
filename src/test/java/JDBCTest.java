import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import dao.UserDao;
import pojo.User;

public class JDBCTest {
	
	
	public static void main(String[] args) {

		
	}


	private SqlSessionFactory factory;
	@Before
	public void init()throws IOException{
		factory=new SqlSessionFactoryBuilder()
		.build(Resources.getResourceAsStream(
				"mybatis-configs.xml"));
	}
	
	@Test
	public void insertTest(){
		//1.创建session
		SqlSession session=factory.openSession();
		//2.执行sql
		//2.1获取dao对象
		UserDao dao=session.getMapper(UserDao.class);
		//2.2执行dao中方法
		User user=new User();
		user.setUsername("nick");
		user.setPassword("123456");
		 boolean insertUser = dao.insertUser(user);
		System.out.println(insertUser);
		session.commit();
		//3.关闭session
		session.close();
	}

	@Test
	public void test01(){
		final StringBuffer a = new StringBuffer("abc");
		a.append("xyz");
		System.out.println(a);
		
		
	}
	
}

package xpu.dao;
import java.sql.*;
import xpu.vo.Userinfo;

public class UserinfoDAO {
	
			String name=rs.getString("username");
			if(name.equals(username))
			{private static  Connection conn=null;
	private Statement stmt=null;
	//���캯������ɶ����ݿ���г�ʼ��
	public UserDAO() {
		//��������
		conn=DBUtil.getConnection();
		try {
			//����Statement
			stmt=conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//������user��ӵ�����
	public void Add(UserinfoVO  user) throws SQLException
	{
		String sql="INSERT INTO user(username,password) VALUES('"
			+user.getUsername()+"','"+user.getPassword()+"')";
		stmt.executeUpdate(sql);
//�˴�����ʹ��Ԥ�������PreparedStatement
	}

    //�����û������ؼ��֣������ݿ�ɾ����Ӧ�ļ�¼
	public void Delete(String username) throws SQLException
	{
		String sql="Delete From user Where username='"+username+"'";
		stmt.executeUpdate(sql);		
	}

	//�޸����ݿ��е�user
	public void Update(UserinfoVO  user) throws SQLException
	{
		String sql="UPDATE user set password='"
			+user.getPassword()+"' where username='"+user.getUsername()+"'";
		stmt.executeUpdate(sql);		
	}

//�����û����ƣ��ؼ��֣������ݿ��в��Ҽ�¼�������ҵ��ļ�¼д�����user�з���
	public User searchByUsername(String username) throws SQLException
	{
		UserinfoVO user=new UserinfoVO();
		String sql="select * from user where username='"+username+"'";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
		{

				//�������ݿ���ҵõ��ļ�¼�������user��
				user.setUsername(name);
				user.setPassword(rs.getString("password"));
				if(rs!=null)
					rs.close();
				return user;
			}
		}
		return null;//���Ҳ�������null		
	}
	//�����û��жϸü�¼�Ƿ����
	public boolean exists(String username)
	{
		boolean rtn=false;
		try {
			if(searchByUsername(username)!=null)
				rtn=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	return rtn;
	}
	//�ر���������ݿ��й�����
	public void finalize()   
    {
		try {
			if(stmt!=null)
				stmt.close();
			if(conn!=null)
				conn.close();
		}
			catch (SQLException e) {
		e.printStackTrace();
		}
    }   
}
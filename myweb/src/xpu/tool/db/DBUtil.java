package xpu.tool.db;
import java.sql.*;

public class DBUtil{
	private static  Connection conn=null;
public static  Connection getConnection()
	{
		//String driverClass="org.apache.derby.jdbc.ClientDriver";
		//String url=
//"jdbc:derby://localhost:1527/myeclipse?useUnicode=true&characterEncoding=UTF///-8";
//����Ĵ�������MySQL���ݿ�
String driverClass="com.mysql.jdbc.Driver ";
String url=
"jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=UTF-8";

//�봴�����ݿ�Ĵ����ϣ���֤�������ݿ�ʱ����������
		//String username = "classiccars";
		//String password = "myeclipse";
String username = "root";
		String password = "********";

		try {
			Class.forName(driverClass);// �������ݿ�����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
if (conn==null)
		try{
			conn = DriverManager.getConnection(url, username, password);//��������
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.print("���ݿ�����ʧ�ܣ�");
		}	
		return conn;		
	}
}
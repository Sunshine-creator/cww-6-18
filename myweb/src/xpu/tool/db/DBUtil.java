package xpu.tool.db;
import java.sql.*;

public class DBUtil{
	private static  Connection conn=null;
public static  Connection getConnection()
	{
		//String driverClass="org.apache.derby.jdbc.ClientDriver";
		//String url=
//"jdbc:derby://localhost:1527/myeclipse?useUnicode=true&characterEncoding=UTF///-8";
//下面的代码连接MySQL数据库
String driverClass="com.mysql.jdbc.Driver ";
String url=
"jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=UTF-8";

//与创建数据库的代码结合，保证访问数据库时不出现乱码
		//String username = "classiccars";
		//String password = "myeclipse";
String username = "root";
		String password = "********";

		try {
			Class.forName(driverClass);// 加载数据库驱动
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
if (conn==null)
		try{
			conn = DriverManager.getConnection(url, username, password);//建立连接
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.print("数据库连接失败！");
		}	
		return conn;		
	}
}
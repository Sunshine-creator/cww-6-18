package servlet.user;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import xpu.dao.*;
public class ModifyUserServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//������ҳ
	String goBack="<br><a href='javascript:window.history.go(-1);'>������ҳ</a>";
		
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();	
		
		String name=request.getParameter("modify");
		if(name!=null) //�����ˡ��޸��û���
		{
			String username=request.getParameter("modfyName");
			String password=request.getParameter("password");
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			dao.Userinfo userDAO=new dao.UserinfoDAO();
			try {
				userDAO.update(user);
			} catch (SQLException e) {
				e.printStackTrace();
				out.print("�޸�ʧ�ܣ�"+e.getLocalizedMessage());
				out.print(goBack);
				return;
			}
		}
		out.print("�޸ĳɹ���");
		out.print(goBack);
		out.close();		
	}
}
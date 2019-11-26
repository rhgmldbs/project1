package finaltest;

import javax.servlet.http.*;
import javax.servlet.http.HttpServletResponse;

import DAO.listDAO;

public class Loginproc implements MainController {

	
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/project/main/main.jsp";

		String id = req.getParameter("id");
		System.out.println("####아이디" +id);
		String pw = req.getParameter("pw");
		System.out.println("####비밀번호"+ pw);
		listDAO ldao = new listDAO();
		int cnt = ldao.getcnt(id, pw);
		if (cnt == 1) {
			HttpSession session = req.getSession();
			session.setAttribute("SID", id);
		}
		return view;

	}

}

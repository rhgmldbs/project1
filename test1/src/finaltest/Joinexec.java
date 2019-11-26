package finaltest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import VO.*;
import DAO.*;

public class Joinexec implements MainController {
	public String execute(HttpServletRequest req, HttpServletResponse resp) {

		req.setAttribute("isRD", true);

		String sid = req.getParameter("id");
		String spw = req.getParameter("pw");
		String sname = req.getParameter("name");
		String smail = req.getParameter("mail");
		String sgender = req.getParameter("gender");
		String stell = req.getParameter("tell");

		listVO vo = new listVO();
		vo.setLid(sid);
		vo.setLpw(spw);
		vo.setLname(sname);
		vo.setLmail(smail);
		vo.setLgender(sgender);
		vo.setLtell(stell);

		int cnt = new listDAO().addlist(vo);

		String view = "/";
		if (cnt == 1) {

			req.getSession().setAttribute("SID", sid);

		} else {
			view = "/project/main/Join.jsp";

		}

		return view;
	}
}

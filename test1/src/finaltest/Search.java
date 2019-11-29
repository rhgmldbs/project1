package finaltest;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.*;
import VO.*;

public class Search implements MainController {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/project/main/boardlist.jsp";
		
		boardDAO dao = new boardDAO();
		
		
		int cnt = Integer.parseInt(req.getParameter("code"));
		String str1 = req.getParameter("search");
		
		ArrayList<board2VO> list  = dao.getsearch(cnt, str1);
		
		req.setAttribute("LIST", list);
		return view;
	}
	
	
	
	

}

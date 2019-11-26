package finaltest;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.*;
import VO.*;


public class boardlistForm implements MainController {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		String view="/project/main/boardlist.jsp";
		
		boardDAO bdao = new boardDAO();

		ArrayList<board2VO> list = bdao.getboardlist();
		
		
		
		list = bdao.getboardlist();
		req.setAttribute("LIST", list);
		

		return view;
	}

}

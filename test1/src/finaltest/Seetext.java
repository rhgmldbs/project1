package finaltest;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.*;
import VO.*;



public class Seetext implements MainController {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		String view="/project/main/Seetext.jsp";
		board2VO vo= new board2VO();
		boardDAO bdao = new boardDAO();
		
		
		String bno = req.getParameter("bno");
		
		
		int no =Integer.parseInt(bno);
		
		vo= bdao.getseetext(no);
		
		req.setAttribute("bno",vo);
			
		
		
		return view;
	}

}

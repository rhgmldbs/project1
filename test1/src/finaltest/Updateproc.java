package finaltest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.*;


public class Updateproc implements MainController {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {

		String view = "/main/boardlist.kkk";
		boardDAO dao= new boardDAO();
		
		String btle=req.getParameter("btle");
		String bbdy=req.getParameter("bbdy");
		String bno=req.getParameter("bno");
		
		int bbno=Integer.parseInt(bno);
		
		
		int cnt = dao.getupdate(btle, bbdy, bbno);
		
		if(cnt == 1) {
			
			req.setAttribute("isRD", true);
			
		}else {
		
			view="/main/seetext.kkk";
		}
		
				
		return view;
	}

}

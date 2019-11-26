package finaltest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.*;
import VO.*;
	
public class board2proc implements MainController {

	
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp)  {
		String view ="/main/boardlist.kkk";
		int cnt=0;
	
		boardDAO bdao= new boardDAO();		
		
		String b_tle=req.getParameter("title");
		String b_bdy =req.getParameter("body");
		
		
		HttpSession session = req.getSession();
		String b_id =(String)session.getAttribute("SID");

		
		cnt= bdao.writeboard(b_tle, b_bdy, b_id);
		if(cnt >0 ) {
			req.setAttribute("cnt", 1);
			req.setAttribute("isRD", true);
		}else {
			req.setAttribute("cnt", 0);
			
			
		}
		return view;
	}

}

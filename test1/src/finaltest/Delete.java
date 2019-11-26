package finaltest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.*;



public class Delete implements MainController {
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		int cnt =0;
		
		String view="/main/boardlist.kkk";
		int no = Integer.parseInt(req.getParameter("bno"));
		
		
		boardDAO dao = new boardDAO();
		cnt = dao.getdelete(no);
		
		
//		String sno=(String)req.getParameter("no");
//		
//		System.out.println(sno);
//		int no= Integer.parseInt(sno);
//		boardDAO dao = new boardDAO();
//		cnt = dao.getdelete(no);
//		System.out.println(cnt);
//		req.setAttribute("Dcnt", cnt);  
		return view;
	}

}

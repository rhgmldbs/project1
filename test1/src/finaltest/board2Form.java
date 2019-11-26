package finaltest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class board2Form implements MainController {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		String view ="/project/main/board.jsp";
		
		HttpSession session = req.getSession();
		String b_id =(String)session.getAttribute("SID");
		return view;
	}

}

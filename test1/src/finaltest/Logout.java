package finaltest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements MainController {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		String view="/main";
		req.setAttribute("isRD",true);
		
		HttpSession session= req.getSession();
		session.setAttribute("SID",""); //공백을 넣어주는 이유 SID를 초기화 시켜주기 때문에 
		
		
		
		return view;
	}

}

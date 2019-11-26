package finaltest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JoinForm implements MainController {

	@Override
	
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		String view ="/project/main/Join.jsp";
		return view;
	}

}

package finaltest;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MainController {
	public String execute(HttpServletRequest req, HttpServletResponse resp);
//kkk로 요청이 왔을경우 실행 해줘야 할 함수 
}

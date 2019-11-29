package dispatch;

import java.io.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import finaltest.*;
import javax.servlet.*;

@WebServlet("*.kkk")
public class Kkkdispatch extends HttpServlet {
	public HashMap<String, MainController> map;

	public void init(ServletConfig config) throws ServletException {
		Properties prop = new Properties();
		FileInputStream fin = null;
		try {

			String path = this.getClass().getResource("").getPath();

			fin = new FileInputStream(path + "../resource.properties");

			prop.load(fin);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {

				fin.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		map = new HashMap<String, MainController>();

		Enumeration en = prop.keys();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String strClass = prop.getProperty(key);

			try {

				Class tmp = Class.forName(strClass);
				MainController o = (MainController) tmp.newInstance();
				map.put(key, o);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		/*
		 * if(req.getMethod().equals("POST")) { req.setCharacterEncoding("utf-8"); }
		 */
		
		
		String full = req.getRequestURI();
		String domain = req.getContextPath();
		String real = full.substring(domain.length());
		
		System.out.println("Dispatcher - 받아온 주소값 : "+real);
		
		MainController controller = map.get(real);

		req.setAttribute("isRD", false); //포워드 방식
		String view = controller.execute(req, resp);

		boolean isRD = (boolean) req.getAttribute("isRD");
		if (isRD) {
			resp.sendRedirect(view);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher(view);
			rd.forward(req, resp);
		}

	}

}
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

		ArrayList<board2VO> list;
		
		/*
		 페이징 처리
		 페이징 처리 - 일반리스트, 검색리스트
		 하나에서 처리하기 위해서 -> 변수하나를 추가 검색인지, 아닌지
		 
		 */
		
		boolean isSearch = false;
		//검색하는 값이 false = 일반 리스트를 뽑겠다.
		
		//int cnt = Integer.parseInt(req.getParameter("code"));
		//String str1 = req.getParameter("search");
		String strCnt = req.getParameter("code");
		String str1 = req.getParameter("search");
		int cnt = 0;
		
		if(strCnt != null && str1 != null) {
			isSearch = true;//검색리스트로 바꾸겠다
			cnt = Integer.parseInt(req.getParameter("code"));
		}
		
		
		if(isSearch) {
			// 검색에 대한 리스트
			list  = bdao.getsearch(cnt, str1);
			req.setAttribute("keyword", str1);
		} else {
			// 일반 리스트
			 list = bdao.getboardlist();
		}
		
		
		req.setAttribute("LIST", list);
		req.setAttribute("isSearch", isSearch);

		return view;
	}

}

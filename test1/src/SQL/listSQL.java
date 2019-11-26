package SQL;

public class listSQL {

	public final int SC_LOGIN = 1001; //로그인 SQL
	public final int SC_INSERT =1002;//회원가입SQL
	
	public final int SC_BOARD =2001; //게시판 SQL
	public final int SC_BOARDLIST = 2002; //게시판 목록  SQL
	public final int SC_SEETEXT = 2003; //글 상세보기 SQL
	
	public final int SC_UPDATE =2004;// 게시판 수정 SQL
	public final int SC_DELETE =2005;//게시판 글 삭제 SQL
	
	public final int SC_SEARCHNO =3001;//게시판 글번호로 검색 기능 SQL
	public final int SC_SEARCHID =3002;//게시판 글아이디로 검색 기능 SQL
	public final int SC_SEARCHTLE =3003;//게시판 글 제목으로 검색 기능 SQL
	
	
	
	
	
			
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();

		switch (code) {

		case SC_LOGIN:
			buff.append(" SELECT count(*) cnt FROM list WHERE l_id=? AND l_pw=? ");
			break;
			
		case SC_INSERT:
			buff.append(" INSERT INTO ");
			buff.append(" list ");
			buff.append(" VALUES( ");
			buff.append(" (SELECT NVL(MAX(l_no)+1, 101)FROM list),  ");
			buff.append(" ?,?,?,?,?,? ");
			buff.append(" )");
			break;
		
		case SC_BOARD:
			buff.append(" INSERT INTO ");
			buff.append(" board2 ");
			buff.append(" VALUES( " );
			buff.append(" (SELECT NVL(MAX(b_no)+1, 101)FROM board2), ");
			buff.append(" ?,?,?,0 ");
			buff.append(" )" );
			break;
		
		case SC_BOARDLIST:
			buff.append(" SELECT b_no, b_tle, b_id FROM board2 ");
			break;
		
		case SC_SEETEXT :
			buff.append(" SELECT b_no, b_tle, b_bdy, b_id, sysdate FROM board2 ");
			buff.append(" WHERE ");
			buff.append(" b_no=? ");
			break;
			
		case SC_UPDATE:
			buff.append(" UPDATE board2 ");
			buff.append(" SET b_tle=? ,b_bdy=? ");
			buff.append(" WHERE ");
			buff.append(" b_no=? ");
			break;
			
			
		case SC_DELETE:
			buff.append(" DELETE ");
			buff.append(" FROM ");
			buff.append(" board2 ");
			buff.append(" WHERE ");
			buff.append(" b_no=? AND b_isshow= 0 ");
			break;
	
			
		case SC_SEARCHNO:
		 buff.append(" SELECT ");
		 buff.append(" b_no, b_tle, b_id ");
		 buff.append(" FROM ");
		 buff.append(" board2 ");
		 buff.append(" WHERE ");
		 buff.append("b_no LIKE '%?%' ");
		 break;
		
		case SC_SEARCHID:
			 buff.append(" SELECT ");
			 buff.append(" b_no, b_tle, b_id ");
			 buff.append(" FROM ");
			 buff.append(" board2 ");
			 buff.append(" WHERE ");
			 buff.append("b_id LIKE '%?%' ");
			 break;
	
		case SC_SEARCHTLE:
			 buff.append(" SELECT ");
			 buff.append(" b_no, b_tle, b_id ");
			 buff.append(" FROM ");
			 buff.append(" board2 ");
			 buff.append(" WHERE ");
			 buff.append("b_tle LIKE '%?%' ");
			 break;
					
		 
			 
			
			
		}

		return buff.toString();

	}

}

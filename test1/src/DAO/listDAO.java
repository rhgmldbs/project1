package DAO;



import java.sql.*;

import javax.servlet.jsp.tagext.TryCatchFinally;

import VO.*;
import SQL.listSQL;
import DB.listDB;



public class listDAO {

Connection con = null;
PreparedStatement pstmt = null;
Statement stmt = null;
ResultSet rs = null;

listDB DB= new listDB();
listVO VO =new listVO();
listSQL lsql = new listSQL();


	public listDAO() {
	}
		public int getcnt(String id, String pw) { //로그인 함수 
			int cnt =0;
			con =DB.getCon();
			String sql = lsql.getSQL(lsql.SC_LOGIN);
			pstmt =DB.getPSTMT(con, sql);
			try {
				pstmt.setString(1, id);
				pstmt.setString(2, pw);
				rs=pstmt.executeQuery();
				rs.next();
				cnt =rs.getInt("cnt");
				System.out.println(cnt);
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				DB.close(rs);
				DB.close(pstmt);
				DB.close(con);
			}
			return cnt;
		}
	
	public int addlist(listVO vo) { //회원가입 함수
		int cnt =0;
	
	con= DB.getCon();
	
	String sql = lsql.getSQL(lsql.SC_INSERT);
	
	pstmt = DB.getPSTMT(con, sql);
	try {
		pstmt.setString(1,vo.getLid());
		pstmt.setString(2,vo.getLpw());
		pstmt.setString(3,vo.getLname());
		pstmt.setString(4,vo.getLgender());
		pstmt.setString(5,vo.getLmail());
		pstmt.setString(6,vo.getLtell());
		
		cnt =pstmt.executeUpdate();
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}finally {
		DB.close(pstmt);
		DB.close(con);
		
	}
	
	
	return cnt;
}
	
}

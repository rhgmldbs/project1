package DAO;

import java.sql.*;
import java.util.ArrayList;

import VO.*;
import SQL.*;
import DB.*;

public class boardDAO {

	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	board2VO vo = new board2VO();
	listSQL bsql = new listSQL();
	listDB db = new listDB();

	public int writeboard(String b_tle, String b_bdy, String b_id) {
		// 게시판 함수
		int cnt = 0;
		con = db.getCon();
		String sql = bsql.getSQL(bsql.SC_BOARD);
		pstmt = db.getPSTMT(con, sql);
		try {
			pstmt.setString(1, b_tle);
			pstmt.setString(2, b_bdy);
			pstmt.setString(3, b_id);
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		return cnt;
	}

	public ArrayList<board2VO> getboardlist() { // 게시판 글목록
		ArrayList<board2VO> list = new ArrayList<board2VO>();

		con = db.getCon();

		String sql = bsql.getSQL(bsql.SC_BOARDLIST);

		stmt = db.getSTMT(con);

		try {

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				board2VO vo = new board2VO();

				vo.setB_no(rs.getInt(1));
				vo.setB_id(rs.getString(2));
				vo.setB_tle(rs.getString(3));

				list.add(vo);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);

		}

		return list;

	}

	public board2VO getseetext(int b_no) { // 게시판 상세보기

		board2VO vo = new board2VO();

		System.out.println(b_no);

		con = db.getCon();
		String sql = bsql.getSQL(bsql.SC_SEETEXT);

		pstmt = db.getPSTMT(con, sql);

		try {

			pstmt.setInt(1, b_no);

			rs = pstmt.executeQuery();
			rs.next();

			vo.setB_no(rs.getInt("b_no"));
			vo.setB_tle(rs.getString("b_tle"));
			vo.setB_bdy(rs.getString("b_bdy"));
			vo.setB_id(rs.getString("b_id"));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}

		return vo;
	}

	public int getupdate(String btle, String bbdy, int bno) { // 게시판 수정하기
		int cnt = 0;

		con = db.getCon();

		String sql = bsql.getSQL(bsql.SC_UPDATE);

		pstmt = db.getPSTMT(con, sql);

		try {

			pstmt.setString(1, btle);
			pstmt.setString(2, bbdy);
			pstmt.setInt(3, bno);

			cnt = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}

		return cnt;

	}

	public int getdelete(int bno) { // 게시판 삭제
		int cnt = 0;

		con = db.getCon();
		String sql = bsql.getSQL(bsql.SC_DELETE);
		pstmt = db.getPSTMT(con, sql);
		try {

			pstmt.setInt(1, bno);
			cnt = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			db.close(pstmt);
			db.close(con);
		}
		return cnt;

	}

	public int getsearch(int code) { // 게시판 검색 기능
		int cnt = 0;

		con = db.getCon();
		String sql = bsql.getSQL(code);
		pstmt =db.getPSTMT(con, sql);
		
		try {
			
			
			if(code == 3001) {
				pstmt.setInt(1, code);
				
				
			}else if(code ==3002) {
				pstmt.
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			
		}
		
		
		
		
		return cnt;

	}
}

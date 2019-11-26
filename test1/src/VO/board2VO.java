package VO;

public class board2VO {

	private int b_no;
	private String b_tle;
	private String b_bdy;
	private String b_id;
	private String b_isshow;
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	public String getB_tle() {
		return b_tle;
	}
	public void setB_tle(String b_tle) {
		this.b_tle = b_tle;
	}
	public String getB_bdy() {
		return b_bdy;
	}
	public void setB_bdy(String b_bdy) {
		this.b_bdy = b_bdy;
	}
	public String getB_id() {
		return b_id;
	}
	public void setB_id(String b_id) {
		this.b_id = b_id;
	}
	public String getB_isshow() {
		return b_isshow;
	}
	public void setB_isshow(String b_isshow) {
		this.b_isshow = b_isshow;
	}
	
	@Override
	public String toString() {
		return  ""+b_no +""+b_tle+"" + b_bdy+""+b_id;
	}
	
}


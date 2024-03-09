package entities;

import java.sql.Timestamp;

public class Posts {
	private int pid;
	private String ptitle;
	private String pContent;
	private String pcode;
	private String ppic;
	private Timestamp pdate;
	private int catid;
	private String userId;
	private String category;
	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPtitle() {
		return ptitle;
	}

	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}

	public String getpContent() {
		return pContent;
	}

	public void setpContent(String pContent) {
		this.pContent = pContent;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPpic() {
		return ppic;
	}

	public void setPpic(String ppic) {
		this.ppic = ppic;
	}

	public Timestamp getPdate() {
		return pdate;
	}

	public void setPdate(Timestamp pdate) {
		this.pdate = pdate;
	}

	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}
	
	public Posts(String ptitle, String pContent, String pcode, String ppic) {
		super();
		this.ptitle = ptitle;
		this.pContent = pContent;
		this.pcode = pcode;
		this.ppic = ppic;
	}

	public Posts(String ptitle, String pContent, String pcode, String ppic, Timestamp pdate, int catid) {
		
		this.ptitle = ptitle;
		this.pContent = pContent;
		this.pcode = pcode;
		this.ppic = ppic;
		this.pdate = pdate;
		this.catid = catid;
	}

	public Posts(int pid, String ptitle, String pContent, String pcode, String ppic, Timestamp pdate, int catid) {
		
		this.pid = pid;
		this.ptitle = ptitle;
		this.pContent = pContent;
		this.pcode = pcode;
		this.ppic = ppic;
		this.pdate = pdate;
		this.catid = catid;
	}
	
	public Posts() {
		
	}

	public Posts(String ptitle, String pContent, String pcode, String ppic, Timestamp pdate, String category) {
		super();
		this.ptitle = ptitle;
		this.pContent = pContent;
		this.pcode = pcode;
		this.ppic = ppic;
		this.pdate = pdate;
		this.category = category;
	}

	public Posts(String ptitle, String pContent, String pcode, String ppic, String userId, String category) {
		super();
		this.ptitle = ptitle;
		this.pContent = pContent;
		this.pcode = pcode;
		this.ppic = ppic;
		this.userId = userId;
		this.category = category;
	}
}

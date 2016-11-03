package po;

public class memberPO {
	
	private String memberID;
	private String name;
	private String level;
	private int credit;
	private int phone;
	
	public memberPO(String memberID,String name,String level,int credit,int phone){
		this.setName(name);
		this.setMemberID(memberID);
		this.setLevel(level);
		this.setCredit(credit);
		this.setPhone(phone);
	}

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
}
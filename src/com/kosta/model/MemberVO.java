package com.kosta.model;

public class MemberVO {

	 int mid;
	 String mpassword;
	 String mname;
	 String phone;
	 String address;
	 String email;
	 
	 public MemberVO() {
	 }
	 
	public MemberVO(int mid, String mpassword, String mname, String phone, String address, String email) {
		super();
		this.mid = mid;
		this.mpassword = mpassword;
		this.mname = mname;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MemberVO [mid=").append(mid).append(", mpassword=").append(mpassword).append(", mname=")
				.append(mname).append(", phone=").append(phone).append(", address=").append(address).append(", email=")
				.append(email).append("]");
		return builder.toString();
	}
	 
}

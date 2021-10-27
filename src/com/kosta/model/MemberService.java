package com.kosta.model;

public class MemberService {
	public MemberVO loginChk(int mid, String mpassword) {
		MemberDAO dao = new MemberDAO();
		return dao.loginChk(mid, mpassword);
	}
}

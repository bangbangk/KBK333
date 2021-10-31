package org.zerock.domain;

/*import java.util.Date;*/

public class MemberVO {
	
		//회원 id
		private String memberId;
		
		//회원 비밀번호
		private String memberPw;
		
		//회원 이름
		private String memberName;
		
		//회원 이메일
		private String memberEmail;
		
		//등록일자
		private int regDate;
		
		// 관리자 구분(0:일반사용자, 1:관리자)
		private int adminCk;
		
		//회원 포인트
		private int point;

		public String getMemberId() {
			return memberId;
		}

		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}

		public String getMemberPw() {
			return memberPw;
		}

		public void setMemberPw(String memberPw) {
			this.memberPw = memberPw;
		}

		public String getMemberName() {
			return memberName;
		}

		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}

		public String getMemberEmail() {
			return memberEmail;
		}

		public void setMemberEmail(String memberEmail) {
			this.memberEmail = memberEmail;
		}

		public int getRegDate() {
			return regDate;
		}

		public void setRegDate(int regDate) {
			this.regDate = regDate;
		}
		
		public int getAdminCk() {
			return adminCk;
		}

		public void setAdminCk(int adminCk) {
			this.adminCk = adminCk;
		}

		public int getPoint() {
			return point;
		}

		public void setPoint(int point) {
			this.point = point;
		}
		
		

		@Override
		public String toString() {
			return "MemberVO [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName
					+ ", memberEmail=" + memberEmail + ", regDate=" + regDate + ", adminCk=" + adminCk + ", point=" + point+ "]";
		}

		
		
	}
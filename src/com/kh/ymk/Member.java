package com.kh.ymk;

	public class Member {
		
		private String name;
		private int memberNum;
		private int phoneNum;
		
		public Member() {
			this(100,100);
		}
		
		public Member(String name) {
			this.name = name;
		}
		
		public Member(int memberNum, int phoneNum) {
			this.memberNum = memberNum;
			this.phoneNum = phoneNum;
		}
		
		public Member(String name, int memberNum, int phoneNum) {
			this.name = name;
			this.memberNum = memberNum;
			this.phoneNum = phoneNum;
		}
			
		// getter 메소드
		public String getName() {
			return this.name = name;
		}
		
		public int getMemberNum() {
			return this.memberNum = memberNum;
		}
		
		public int getPhoneNum() {
			return this.phoneNum = phoneNum;
		}
		
		// setter 메소드
		public void setName(String name) {
			this.name = name;
		}	
		public void setMemberNum(int memberNum) {
			this.memberNum = memberNum;
		}
		
		public void setPhoneNum(int phoneNum) {
			this.phoneNum = phoneNum;
		}



	}



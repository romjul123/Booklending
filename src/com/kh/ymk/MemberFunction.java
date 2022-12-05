package com.kh.ymk;

import java.util.Scanner;


public class MemberFunction {
	Member [] members;
	
	public MemberFunction() {
		members = new Member[1];
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======= 도서 대여 프로그램 =======");
		System.out.println("1. 회원정보 입력");
		System.out.println("2. 회원정보 조회");
		System.out.println("3. 도서 대여하기");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int menu = sc.nextInt();
		return menu;
				
	}
	
	public void inputInf() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < members.length; i++) {
			System.out.println("======= 회원정보 입력 =======");
			System.out.print("이름 입력 : ");
			String name = sc.next();
			System.out.print("회원번호 입력 : ");
			int memberNum = sc.nextInt();
			System.out.print("전화번호 입력: ");
			int phoneNum = sc.nextInt();
			members[i] = new Member();
			members[i].setName(name);
			members[i].setMemberNum(memberNum);
			members[i].setPhoneNum(phoneNum);
					
			
		}
	}
	
	public void printInf() {
		for(int i = 0; i < members.length; i++) {
			System.out.println("======= 회원정보 조회 =======");
			System.out.println("이름 : " + members[i].getName());
			System.out.println("회원번호 : " + members[i].getMemberNum());
			System.out.println("전화번호 : " + members[i].getPhoneNum());
		}
	}
	
	public void lending() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======= 도서 대여하기 =======");
		System.out.println("1 어린왕자 / 생텍쥐페리 / 대여가능");
		System.out.println("2 테레즈 라캥 / 에밀 졸라 / 대여가능");
		System.out.println("3 까라마조프 가의 형제들 / 도스토예프스키 / 대여가능");
		System.out.println("번호를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println("예약이 완료되었습니다.");
		}
		
		
	
	
	public void goodByeMSG() {
		System.out.println("종료되었습니다.");
	}
	
	public void exceptionMsg() {
		System.out.println("1 ~ 4 사이의 숫자를 입력해주세요.");
	}


}

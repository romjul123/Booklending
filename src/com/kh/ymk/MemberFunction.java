package com.kh.ymk;

import java.util.Scanner;


public class MemberFunction {
	Member [] members;
	
	public MemberFunction() {
		members = new Member[1];
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======= ���� �뿩 ���α׷� =======");
		System.out.println("1. ȸ������ �Է�");
		System.out.println("2. ȸ������ ��ȸ");
		System.out.println("3. ���� �뿩�ϱ�");
		System.out.println("4. ���α׷� ����");
		System.out.print("�޴� �Է� : ");
		int menu = sc.nextInt();
		return menu;
				
	}
	
	public void inputInf() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < members.length; i++) {
			System.out.println("======= ȸ������ �Է� =======");
			System.out.print("�̸� �Է� : ");
			String name = sc.next();
			System.out.print("ȸ����ȣ �Է� : ");
			int memberNum = sc.nextInt();
			System.out.print("��ȭ��ȣ �Է�: ");
			int phoneNum = sc.nextInt();
			members[i] = new Member();
			members[i].setName(name);
			members[i].setMemberNum(memberNum);
			members[i].setPhoneNum(phoneNum);
					
			
		}
	}
	
	public void printInf() {
		for(int i = 0; i < members.length; i++) {
			System.out.println("======= ȸ������ ��ȸ =======");
			System.out.println("�̸� : " + members[i].getName());
			System.out.println("ȸ����ȣ : " + members[i].getMemberNum());
			System.out.println("��ȭ��ȣ : " + members[i].getPhoneNum());
		}
	}
	
	public void lending() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======= ���� �뿩�ϱ� =======");
		System.out.println("1 ����� / �������丮 / �뿩����");
		System.out.println("2 �׷��� ��Ļ / ���� ���� / �뿩����");
		System.out.println("3 ������� ���� ������ / �����俹����Ű / �뿩����");
		System.out.println("��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		}
		
		
	
	
	public void goodByeMSG() {
		System.out.println("����Ǿ����ϴ�.");
	}
	
	public void exceptionMsg() {
		System.out.println("1 ~ 4 ������ ���ڸ� �Է����ּ���.");
	}


}

package com.kh.ymk;

public class Run {
	public static void main(String [] args) {
		MemberFunction mFunc = new MemberFunction();
		END : 
		while(true) {
			int choice = mFunc.printMenu();
			switch(choice) {
			case 1 : 
				mFunc.inputInf();
				break;
			case 2 : 
				mFunc.printInf();
				break;
			case 3 : 
				mFunc.lending();
				break;
			case 4 : 
				mFunc.goodByeMSG();
				break END;
			default : 
				mFunc.exceptionMsg();
				break;
			}
		}
	}
}

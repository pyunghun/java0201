package com.greedy.section01.exception;

public class Application1 {

	public static void main(String[] args) throws Exception {

		
		/* 예외처리(exception)
		 * 1. 오류 (error)
		 * 2. 예외 (exception) 
		 * */
		
		/* 강제로 예외를 발생시키는 방법
		 * throw new 예외클래스명(); 
		 * 
		 * 예외 처리 방법
		 * 1. throws로 위임
		 * 2. try - catch 로 처리 
		 * */
		
		ExceptionTest et = new ExceptionTest();
		
		/* 상품 가격은 10000원 이고, 가진 돈은 50000원인 경우 */
//		et.chechEnoughMoney(10000, 50000);
		et.chechEnoughMoney(50000, 10000);

		System.out.println("프로그램을 종료합니다.");
		
		
	}

}

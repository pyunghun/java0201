package com.greedy.section01.exception;

public class Application2 {

	public static void main(String[] args) {

		/* try - catch 이용한 방법 */
		ExceptionTest et = new ExceptionTest();
		
		try {
//			et.chechEnoughMoney(10000, 50000);
			et.chechEnoughMoney(50000, 10000);
			
			System.out.println("========상품 구입 가능==========");
		} catch (Exception e) {
//			e.printStackTrace(); <- 에러가 난 이유를 설명하는 매소드
			System.out.println("========상품 구입 불가===========");
			System.out.println("돈을 더 들고 오세요");
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}

}

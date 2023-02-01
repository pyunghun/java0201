package com.greedy.section02.userexception;

import com.greedy.section02.userexception.exception.NegativeException;
import com.greedy.section02.userexception.exception.NotEnoughMoneyException;

public class Application1 {

	public static void main(String[] args) {

		
		ExceptionTest et = new ExceptionTest();
		
		try {
//			et.checkEnoughMoney(50000, 30000);
//			et.checkEnoughMoney(-50000, 50000);
//			et.checkEnoughMoney(30000, -50000);
			et.checkEnoughMoney(30000, 50000);
			
		} catch (NegativeException e) {
			e.printStackTrace();
		} catch (NotEnoughMoneyException e) {
			e.printStackTrace();
		}
	}

}

package com.greedy.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {

	public static void main(String[] args) {

		/* try-with-resource
		 * jdk1.7 추가
		 * close 해야 하는 인스턴스의 경우 try(인스턴스 생성){}
		 * 해당 try-catch 블럭이 완료될 때 자동으로 close 해준다.
		 *  */
		
		/* ; 은 여러 개의 객체를 넣을 때 사용한다. ;를 넣지 않으면 1개의 객체만 사용한다고 생각을 한다. */
		try(BufferedReader in = new BufferedReader(new FileReader("test.dat"));){
			String s;
			
			while((s = in.readLine()) != null) {
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		
	}

}

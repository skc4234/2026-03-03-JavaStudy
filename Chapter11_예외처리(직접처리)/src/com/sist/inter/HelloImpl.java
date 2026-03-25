package com.sist.inter;

public class HelloImpl implements Hello {

	@Override
	public void sayHello(String name) { // 메소드의 이름이 변경되도 main은 에러나지 않는다 => 결합성이 낮다 => 인터페이스
		// TODO Auto-generated method stub
		System.out.println(name + "님 환영합니다!!!");
	}

}

/*
 *  매개변수 알 수 없는 경우 => 사용자가 매개변수를 몇개 보낼지 모름
 *  	=> 웹(필터 사용) ==> 가변 매개변수
 *  	==>String... str  => 배열
 *   page236
 * 
 * 
 * 
 */

package com.sist.oop2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class Temp {
	// 검색 => 필터링 => String.format(String, Object... org)
	public void sum(int... value) { // Object... org
		int s = 0;
		for(int i=0; i<value.length; i++) {
			s+=value[i];
			
		}
		System.out.println("sum = " + s);
	}
	
	public String change(int num) {
		DecimalFormat d = new DecimalFormat("###,###,###");
		return d.format(num);
	}
	
	public String dateChange(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sdf.format(date);
		
	}
	
}

public class 메소드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp t = new Temp();
		t.sum(10,20,30);
		int a = 100000000;
		String res = t.change(a);
		System.out.println(res + "원");
		System.out.println(new Date());
		String d = t.dateChange(new Date());
		System.out.println(d);
		
	}

}

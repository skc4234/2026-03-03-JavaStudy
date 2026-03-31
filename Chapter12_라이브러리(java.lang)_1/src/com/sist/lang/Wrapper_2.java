package com.sist.lang;
import java.lang.reflect.Method;
import java.util.*;
class Controller {
	@RequestMapping("1")
	public void aaa() {
		System.out.println("Contoller : aaa() Call");
	}

	@RequestMapping("2")
	public void bbb() {
		System.out.println("Contoller : bbb() Call");
		
	}

	@RequestMapping("3")
	public void ccc() {
		System.out.println("Contoller : ccc() Call");
	
	}
	@RequestMapping("4")
	public void ddd() {
		System.out.println("Contoller : ddd() Call");
		
	}
	@RequestMapping("5")
	public void eee() {
		System.out.println("Contoller : eee() Call");
	
	}
}
public class Wrapper_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Controller c = new Controller();
		/*System.out.print("aaa(1),bbb(2),ccc(3),ddd(4),eee(5) 입력 : ");
		int no = scan.nextInt();
		if(no==1)c.aaa();
		else if(no==2)c.bbb();
		else if(no==3)c.ccc();
		else if(no==4)c.ddd();
		else if(no==5)c.eee();*/
		try {
			Class clsName = Class.forName("com.sist.lang.Controller");
			Object obj = clsName.getDeclaredConstructor().newInstance();
			Method[] methods = clsName.getDeclaredMethods();
			System.out.print("1~5 입력 : ");
			String no = scan.next();
			
//			for(Method m : methods) {
//				RequestMapping rm;
//			}
		
		
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

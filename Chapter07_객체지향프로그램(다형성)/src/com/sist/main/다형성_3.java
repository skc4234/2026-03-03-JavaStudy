package com.sist.main;
import java.util.*;
class AA {
	public void display() {
		System.out.println("AA : display() Call...");
	}
}
class BB extends AA {
	public void display() {
		System.out.println("BB : display() Call...");
	}
}
class CC extends AA {
	public void display() {
		System.out.println("CC : display() Call...");
	}
}
class DD extends AA {
	public void display() {
		System.out.println("DD : display() Call...");
	}
}
class Container {
	Map map = new HashMap(); // 제네릭 Map<Integer, AA> => get 리턴형 AA
	public Container() {
		map.put(1, new AA());
		map.put(2, new BB());
		map.put(3, new CC());
		map.put(4, new DD());
		// 상속이 없는 경우 => Object
	}
	public AA getBean(int key) {
		return (AA)map.get(key);
	}
}

class EE {
	public void display() {
		System.out.println("EE : display() Call...");
	}
}

class MM extends EE {
	public void display() {
		System.out.println("MM : display() Call...");
	}
}
public class 다형성_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴를 입력하시오(1,2,3,4) : ");
		int menu = scan.nextInt();
		Container c = new Container();
		AA aa = c.getBean(menu);
		aa.display();
		
		
		
		MM mm = new MM();
		mm.display();
		
		EE ee = new EE();
		ee.display();
		
		EE e1 = new MM();
		e1.display();
		MM mm1 = (MM)e1;
		mm1.display(); // 리턴형이 Object
		
		
		
//		if(menu == 1) {
//			AA a = new AA();
//			a.display();
//		}
//		else if(menu == 2) {
//			BB b = new BB();
//			b.display();
//		}
//		else if(menu == 3) {
//			BB b = new BB();
//			b.display();
//		}
//		else if(menu == 4) {
//			CC c = new CC();
//			c.display();
//		}
	}

}

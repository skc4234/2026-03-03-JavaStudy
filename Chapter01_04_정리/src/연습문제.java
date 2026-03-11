import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번
		Scanner scan = new Scanner(System.in);
		System.out.println("1번");
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		if(num>0) System.out.println(num + "는(은) 양수입니다");
		else if(num<0) System.out.println(num + "는(은) 음수입니다");
		else System.out.println("0입니다.");
		
		System.out.println();
		
		//2번
		System.out.println("2번");
		System.out.print("정수 입력 : ");
		num = scan.nextInt();
		if(num%3==0) System.out.println(num + "는(은) 3의 배수입니다");
		else System.out.println(num + "는(은) 3의 배수가 아닙니다");
		
		System.out.println();
		
		//3번
		System.out.println("3번");
		System.out.print("정수 입력 : ");
		num = scan.nextInt();
		if(num<0) {
			System.out.println(num*-1);  //절대값 Math.abs(num);
		}
		else System.out.println(num);
		
		System.out.println();
		
		//4번
		System.out.println("4번");
		System.out.print("정수 입력 : ");
		num = scan.nextInt();
		if((num%4==0) && (num%100!=0) || (num%400==0)) {
			System.out.println(num + "년도는 윤년입니다");
		}
		else {
			System.out.println(num + "년도는 윤년이 아닙니다");
		}
		
		System.out.println();
		
		//5번
		System.out.println("5번");
		System.out.print("정수 입력 : ");
		num = scan.nextInt();
		if(num>=90&&num<=100) System.out.println("A학점입니다");
		else if(num>=80) System.out.println("B학점입니다");
		else if(num>=70) System.out.println("C학점입니다");
		else if(num>=60) System.out.println("D학점입니다");
		else if(num>=0&&num<60) System.out.println("F학점입니다");
		else System.out.println("잘못된 점수입니다");
		
		System.out.println();
		
		//6번
		System.out.println("6번");
		System.out.print("정수 입력 : ");
		num = scan.nextInt();
		String odb = switch(num/10) {
		case 9,10 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		default -> "F";
		};
		System.out.println(odb + "학점입니다.");
		
		
		System.out.println();
		
		//7번
		System.out.println("7번");
		System.out.print("정수 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("+,-,*,/ 입력 : ");
		String c = scan.next();
		System.out.print("정수 입력 : ");
		int num2 = scan.nextInt();
		switch(c) {
		case "+" -> System.out.printf("%d + %d = %d", num1, num2, num1+num2);
		case "-" -> System.out.printf("%d - %d = %d", num1, num2, num1-num2);
		case "*" -> System.out.printf("%d * %d = %d", num1, num2, num1*num2);
		case "/" -> {
			if(num2==0) System.out.println("0으로 나눌 수 없습니다");
			else System.out.printf("%d / %d = %d", num1, num2, num1/num2);
		}
		default -> System.out.println("잘못 입력했습니다");
		}
		
		System.out.println();
		
		//8번
		int sum = 0;
		System.out.println("8번");
		for(int i=2; i<=100; i+=2) {
			sum += i;
		}
		System.out.println("2+4+...+100의 합 : " + sum);
		
		System.out.println();
		
		//9번
		System.out.println("9번");
		for(int i=5; i<=50; i+=5) {
			System.out.print(i + "       ");
		}
		
		System.out.println("\n");
		
		//10번
		System.out.println("10번");
		
		for(char d='B'; d<='N'; d+=2) {
			System.out.print(d + "     ");
		}
		System.out.println("\n");
		
		//11번
		System.out.println("11번");
		int answer11 = 0;
		System.out.print("정수 입력 : ");
		num = scan.nextInt();
		for(int i=1; i<=num; i++) {
			answer11 +=i;
		}
		System.out.printf("1부터 %d까지의 합 : %d\n", num, answer11);
		
		System.out.println();
		
		//12번
		System.out.println("12번");
		int j=0;
		for(int i=2; i<=30; i+=2) {
//			System.out.print(i + " ");
//			j++;
//			if(j>2) {
//				System.out.println();
//				j=0;
//			}
			System.out.print(i + " ");
			if(i%3==0) System.out.println();
		}
		
		System.out.println();
		
		//13번
		System.out.println("13번");
		int answer13 = 0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				answer13-=i;
			}
			else {
				answer13+=i;
			}
		}
		System.out.println("1-2+3-4+...-10까지의 합 : " + answer13);
		
		System.out.println();
		
		//14번
		System.out.println("14번");
		for(int i=1; i<=10; i++) {
			if(i%3==0) continue;
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//15번
		System.out.println("15번");
		while(true) {
			System.out.print("2자리수 정수 입력 : ");
			num = scan.nextInt();
			if(num<10 || num>99) {
				System.out.println("잘못된 정수 입력");
				continue;
			}
			if(num/10 == num%10) { // num%11==0
				System.out.println("10의 자리와 1의 자리가 같습니다");
				break;
			}
			else {
				System.out.println("10의 자리와 1의 자리가 다릅니다");
				break;
			}
		}
		
		System.out.println();
		
		//16번
		System.out.println("16번");
		System.out.print("달을 입력하세요(1~12) : ");
		num = scan.nextInt();
		if(num==3||num==4||num==5) System.out.println("봄입니다");
		else if(num==6||num==7||num==8) System.out.println("여름입니다");
		else if(num==9||num==10||num==11) System.out.println("가을입니다");
		else if(num==12||num==1||num==2) System.out.println("겨울입니다");
		else System.out.println("잘못 입력했습니다");
		
		switch(num) {
		case 3,4,5 -> System.out.println("봄입니다");
		case 6,7,8 -> System.out.println("여름입니다");
		case 9,10,11 -> System.out.println("가을입니다");
		case 12,1,2 -> System.out.println("겨울입니다");
		default -> System.out.println("잘못 입력했습니다");
		}
		
		System.out.println();
		//17번
		sum = 0;
		int i=1;
		while (i<100) {
			if(i%3!=0) {
				i++;
				continue; //빈칸
			}
			else sum += i;
			i++;
		}
		System.out.println("1부터 100까지 3의배수 합 : " + sum);
		
		System.out.println();
		
		//18번
		sum=0;
		i=1;
		while(true) {
			if(i>50) break; // 빈칸
			sum += i;
			i++;
		}
		System.out.println("1부터 50까지의 합 : " + sum);
	}
	

}

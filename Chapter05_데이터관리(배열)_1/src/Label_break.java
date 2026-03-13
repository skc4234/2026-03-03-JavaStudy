// 사용빈도 거의없음 => 2차 for문은 웹에서 거의 안쓰기때문
// label이 있는 break
public class Label_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa:
		for(int i=1; i<=3; i++) {
			for(int k=1; k<=3; k++) {
				System.out.println("i = " + i + ", k = "+ k);
			}
			for(int j=1; j<=3; j++) {
				
				if(j==2) break aaa; // if가 포함된 for문 종료
								// aaa 라벨이 붙은 for문 종료
				System.out.println("i = " + i + ", j = " + j);
			}
		}
	}

}

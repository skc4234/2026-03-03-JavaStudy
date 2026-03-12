/*
 * DB를 배열에 저장 => new를 사용하여 저장갯수 확인
 * 
 * 
 * 
 */
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"홍길동","이순신","강감찬","박문수","김두한"};
		String[] address = {"서울", "경기", "강원", "제주", "부산"};
		for(int i=0; i<names.length; i++) {
			System.out.println("(" + names[i] + ", " + address[i] + ")");
		}
	}

}

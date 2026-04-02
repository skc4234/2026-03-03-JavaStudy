04/01 - 정규 표현식, 리플렉션, 어노테이션
1. 정규식
    => 문자열이 정해진 형식으로 구성되어 있는지 검증
    => 검색하는 용도로 쓰일 수 있음
    => replaceAll(String regex, String s) / split(String regex) 메소드에서도 쓰임
   1) [] : 한 개의 문자
      - [a] => a 한 글자
      - [abc] => a,b,c 중에 한 글자
      - [a-z] => 알파벳 소문자 중 한 글자
      - [A-Za-z] => 알파벳 중 한 글자
      - [가-힣] => 한글 전체 중 한 글자
      - [0-9] => 숫자 중에 한 글자
    2) ^ : 시작 / $ : 끝
       - ^[A-Za-z] => 알파벳으로 시작하는 문자열 => startsWith(알파벳)과 동일한 기능
       - [A-Za-z]$ => 알파벳으로 끝나는 문자열 => endsWith(알파벳)과 동일한 기능
       ※ [^A-Z] => 알파벳 대문자 제외 // 대괄호 밖과 안 구별하기!!
    3) + : 한 개 이상 반복
       - abc+ => abcccccc => + 바로 앞 글자 반복 
       - (abc)+ => abcabcabc => 괄호 안에 있는 문자 반복(그룹화)
    4) * : 없음 또는 한 개 이상 반복
       - abc* => ab or abc or abcccc...
    5) ? : 없음 또는 한 개
       - abc? => ab or abc
    6) . : 임의의 한 글자
       - ab. => ab 다음에 오는 한 글자만 검증
       - ab.* => ab 또는 ab뒤에 오는 임의의 글자 모두 검증
       ※ 오라클에서는 _(언더바)가 임의의 한 글자
    7) | : or
       - a|b => a or b => [ab]와 같은 기능
    8) {} : 문자열 개수
       - {n} : 정확히 n개
       - {n,} : 최소 n개 이상
       - {n,m} : n개 이상 m개 이하
       - [0-9]{1,2} => 숫자가 최소 1개 이상 2개 이하
    9) \d : 한 개의 숫자        => [0-9] 와 동일
       \s : 공백
       \w : 한 개의 알파벳/숫자 => [A-Za-z_0-9] 와 동일
    **\d, \s, \w 와 ., *, ?, + 등의 정규식 기호는 \\을 붙일 것!!!**
1.1) 정규식 검증 클래스
   - Pattern 클래스와 Matcher 클래스
     - 문자열에서 숫자만 출력
     String msg = "비밀번호 : 1234, 또 다른 비밀번호 : 56787";
     String regex = "\\d+";
		 Pattern p = Pattern.compile(regex);
		 Matcher m = p.matcher(msg);
		 while(m.find()) {
			 System.out.println("비밀번호는 " + m.group());
    }
    => 1234
       56787

    - Pattern 클래스
      - boolean matchers(String regex) => equals(String s)와 동일 => 정규식을 전체 문자열과 비교해서 true/false 리턴
      - Pattern.compile(String regex) => 패턴에 정규식 입력
    - Matcher 클래스
		  - find() : 패턴과 부분 문자열의 일치여부 확인 => contains(String s)와 동일
		  - group() : 찾는 문자열 출력 => ()수에 따라 출력
	    - start() : 찾는 문자열의 첫번째 위치 인덱스 번호 반환
	    - end() : 찾는 문자열의 마지막 위치 인덱스 번호 반환
	    - replaceAll() : 바꿀 문자열로 대체
     
2. 리플렉션
    => 객체를 프로그램에서 동적 제어 하기위한 행위
    => 클래스(멤버변수, 생성자, 메소드)를 제어한다
    - 방법
       1) Class clsName = 클래스이름.class
       2) Class clsName = Class.forName("패키지명.클래스명")
       3) Class clsName = 객체참조변수.getClass();
        ex) String str = "";  // str 객체





04/02 - 제네릭, 컬렉션_1
1. 제네릭
    
     


|----|순서|중복|
|----|----|----|
|List|*강조*|테스트2|
|Set|*강조*|테스트2|
|Map|*강조*|테스트2|

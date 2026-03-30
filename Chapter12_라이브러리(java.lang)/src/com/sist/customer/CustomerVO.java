package com.sist.customer;


import lombok.Getter;
import lombok.Setter;

/*
 * C001,
 * user001,
 * pw001,
 * 김민수,
 * minsu.kim1@test.com,
 * 010-1000-0001,
 * 서울,
 * 2023-01-02,
 * VIP

 */
@Getter
@Setter
//@NoArgsConstructor // 매개변수가 없는 생성자(default)
//@AllArgsConstructor // 모든 매개변수가 있는 생성자
//@Data
//@ToString // 오버라이딩 된 ToString
//@EqualsAndHashCode // 오버라이딩 된 eqauls / hashCode
public class CustomerVO {
	private String customer_id;
	private String login_id;
	private String pwd;
	private String name;
	private String email;
	private String phone;
	private String loc;
	private String regdate;
	private String grade;
	
	
}

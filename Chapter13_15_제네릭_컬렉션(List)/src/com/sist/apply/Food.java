package com.sist.apply;

import lombok.Getter;
import lombok.Setter;

/*
 * 440|
 * 솔향한우촌|
 * 한식-생고기/등심|
 * (033) 661-5955|
 * 강원 강릉시 연곡면 영진리 364-60|
 * 3.0|
 * 40대, 주차방법: 무료, 주차장소: 업소앞|
 * /restaurant/restimg/006/zzmenuimg/h20138629_z.jpg|
 * 10:00 ~ 22:00|
 * 솔향기 그윽한 강릉의 명품 '솔향한우촌'. 강릉시에 있는 강북공설운동장 입구에 위치한 '솔향한우촌'은 품질 좋은 소고기만을 취급하는 한우전문점이다. 190석 규모의 넓고 깔끔한 내부와 전용 주차장이 갖추어져 있어 여러 모임에도 적합한 곳. 직접 키운 채소, 지역 농민이 생산한 쌀과 야채, 한우 잡목반에서 직접 키운 암소를 제공하고 있다. 처음부터 끝까지 정성을 가득담아 한 끼의 근사한 식사를 제공하는 '솔향한우촌', 강릉에 온다면 이 곳을 방문해 보는 것은 어떨까.|
 * 가족외식 , 돌잔치/회갑/생일 , 어른과 함께라면 , 술 마시는 친구와 함께 , 특별한 날엔 , 점심식사 , 접대 , 주차공간 , 한우전문점 , 불고기 , 육회 , 몸보신 , 고기 보양식 , 강릉 정동진 해돋이축제|
 * 10,000 ~ 20,000원
 * 
 */

@Getter
@Setter
public class Food {
	private int no;
	private String name;
	private String type;
	private String phone;
	private String address;
	private double score;
	private String parking;
	private String poster;
	private String time;
	private String content;
	private String theme;
	private String price;
	
}

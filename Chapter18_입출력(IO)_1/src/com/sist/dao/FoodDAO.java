package com.sist.dao;
import java.util.*;

import com.sist.vo.FoodVO;

import java.io.*;
// 실제 값을 채우는 경우 => Setter, 고정된 데이터가 있으면 Setter 필요 x
//파일, 데이터베이스 연동
public class FoodDAO {
	private static List<FoodVO> fList = new ArrayList<FoodVO>();
	static {
		try {
			FileReader fr = new FileReader("c:\\javadv\\food.txt");
			// 한 줄씩 읽는 클래스 => BufferedReader(기본)
			//StringBuilder sb = new StringBuilder();
			StringBuffer sb = new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			fr.close();
			String[] data = sb.toString().split("\n");
			for(String s : data) {
				StringTokenizer st = new StringTokenizer(s, "|");
				FoodVO f = new FoodVO();
				f.setNo(Integer.parseInt(st.nextToken()));
				f.setName(st.nextToken());
				f.setType(st.nextToken());
				f.setPhone(st.nextToken());
				f.setAddress(st.nextToken());
				f.setScore(Double.parseDouble(st.nextToken()));
				f.setParking(st.nextToken());
				f.setPoster(st.nextToken());
				f.setTime(st.nextToken());
				f.setContent(st.nextToken());
				f.setTheme(st.nextToken());
				f.setPrice(st.nextToken());
				fList.add(f);
				//System.out.println(f.getNo() + ". " + f.getName());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	public static List<FoodVO> getfList() {
		return fList;
	}
	
	
}

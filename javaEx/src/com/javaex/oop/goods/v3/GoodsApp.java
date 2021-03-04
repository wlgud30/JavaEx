package com.javaex.oop.goods.v3;

public class GoodsApp {
	public static void main(String[] args) {
		Goods notebook = new Goods();
		Goods notebook2 = new Goods("LG Gram",1500000);//새로 생성한 생성자의 파라미터에 맞게 입력한다
		notebook2.showInfo();
		
		//누군가 악의적,실수로 
		//notebook2.setPrice(15000);
		//이와 같이 set하ㅁ는것을막기위해 getter 만 사용한다
		
		notebook2.showInfo();
		
		//notebook.setName("LG Gram");
		//notebook.setPrice(1500000);
		
		Goods smartphone = new Goods();
		//smartphone.name="iPhone SE";
		//smartphone.price=650000;
		//smartphone.setName("iPhone Se");
		//smartphone.setPrice(650000);
		
		
		//System.out.printf("%s, %d원%n",notebook.name,notebook.price);
		//System.out.printf("%s, %d원%n",smartphone.name,smartphone.price);
		notebook.showInfo();
		smartphone.showInfo();
	}
}

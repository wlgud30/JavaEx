package com.javaex.oop.goods.v2;

public class GoodsApp {
	public static void main(String[] args) {
		Goods notebook = new Goods();
		notebook.setName("LG Gram");
		notebook.setPrice(1500000);
		
		Goods smartphone = new Goods();
		//smartphone.name="iPhone SE";
		//smartphone.price=650000;
		smartphone.setName("iPhone Se");
		smartphone.setPrice(650000);
		
		
		//System.out.printf("%s, %d원%n",notebook.name,notebook.price);
		//System.out.printf("%s, %d원%n",smartphone.name,smartphone.price);
		notebook.showInfo();
		smartphone.showInfo();
	}
}

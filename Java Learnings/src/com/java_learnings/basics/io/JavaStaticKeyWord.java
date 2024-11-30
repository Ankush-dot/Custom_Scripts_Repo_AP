package com.java_learnings.basics.io;


class HondaCity
{
	static long orignalPrice = 5000000;
	public float calIDV;
	
	static void idvPrice() {
		System.out.println("IDV Price will be afte 5 yers : " + orignalPrice/2);
		
	}
	
}
public class JavaStaticKeyWord {
	
	public static void main(String[] args) {
		
		HondaCity hc = new HondaCity();
		HondaCity.orignalPrice = 16000000;
		HondaCity.idvPrice();
		System.out.println(HondaCity.orignalPrice);
		hc.calIDV = 10000.5f;
		System.out.println(hc.calIDV);

	}

}

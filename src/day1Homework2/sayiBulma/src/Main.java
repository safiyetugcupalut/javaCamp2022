package day1Homework2.sayiBulma.src;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int [] {1,2,5,7,9,0};
		int aranacak= 5;
		//boolean varMi = false;
		
		
		//Benim yaptığım çözüm
		
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] == aranacak) {
				System.out.println("Aranan sayi : " + sayilar[i] + " dir.");
			}
			else {
				System.out.println(sayilar[i] + " aranan sayi değildir.");
			}
			}
		}
	
	
		//Hocanın yaptığı çözüm
	
		
		/*
		 * for(int sayi : sayilar) { if(sayi == aranacak) { varMi = true; break; } }
		 * if(varMi) { System.out.println("Sayı mevcuttur."); }else {
		 * System.out.println("Sayi mevcut değildir."); }
		 */

	}



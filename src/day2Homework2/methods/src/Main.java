package day2Homework2.methods.src;

public class Main {

	public static void main(String[] args) {
			sayiBulmaca();
			sayiBulmaca();
			sayiBulmaca();
			sayiBulmaca();
}
	public static void sayiBulmaca() {
		int[] sayilar = new int [] {1,2,5,7,9,0};
		int aranacak= 5;
		boolean varMi = false;

		  for(int sayi : sayilar) {
			  if(sayi == aranacak) { 
				  varMi = true;
				  break; 
				  } 
			  }
		  
		  String mesaj="";
		  if(varMi) { 
			 mesajVer("Sayı mevcuttur: "+aranacak);
			 mesajVer(mesaj);
		  }else {
		  System.out.println("Sayi mevcut değildir: "+aranacak); 
		  }
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}

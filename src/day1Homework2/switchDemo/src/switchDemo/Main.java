package day1Homework2.switchDemo.src.switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'C';
		
		switch(grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B' :
			
		case 'C' :
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D' :
			System.out.println("Malesef Kaldınız");
			break;
		case 'F' :
			System.out.println("Mükemmel : Geçtiniz");
			break;
			default:
				System.out.println("Geçersiz not girdiniz");
		}

	}

}

package Zamanim;

import java.util.Scanner;

public class ZamanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour;
		int minute;
		int second;
		Scanner input= new Scanner(System.in);
		System.out.println("Saati Giriniz");
		hour=input.nextInt();
		
		System.out.println("Dkikayi Giriniz");
		minute=input.nextInt();
		
		System.out.println("Saniye Giriniz");
		second=input.nextInt();
		
		Timel z= new Timel(hour,minute,second);
		System.out.println(z.display());
		z.setHour(11);
		System.out.println(z.display());
		z.setHour(25,33,45);
		System.out.println(z.display());
	}

}

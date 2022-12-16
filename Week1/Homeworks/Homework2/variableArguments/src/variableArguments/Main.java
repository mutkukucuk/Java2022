package variableArguments;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel";
		String yeniMesaj = "sehirVer()";
		System.out.println(yeniMesaj);
		int sayi = topla(15,7);
		System.out.println(sayi);
		int toplam = topla2(1,2,3,4,5);
		System.out.println(toplam);

	}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	

	public static int topla(int a, int b)
	{
		int toplam = a + b;
		return toplam;
	}
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	
}

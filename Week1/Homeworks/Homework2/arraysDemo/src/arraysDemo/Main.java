package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Utku";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Engin";
        String ogrenci4 = "Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("--------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Utku";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Engin";

        for (int i=0;i<ogrenciler.length;i++)
        {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("--------------------");

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

	}

}

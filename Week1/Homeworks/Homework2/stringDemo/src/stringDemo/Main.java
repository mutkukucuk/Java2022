package stringDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel";
        System.out.println(mesaj);

/*        System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5. eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yasasin!"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("a"));
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.lastIndexOf("co"));*/

        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,4));

        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.toLowerCase());

        System.out.println(mesaj.trim());

	}

}

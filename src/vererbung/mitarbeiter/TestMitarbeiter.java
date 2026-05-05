package vererbung.mitarbeiter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMitarbeiter {

	public static void main(String[] args) {
		
		Angestellter A1 = new Angestellter("Kenzo", "junior", 12300);
		
		Azubi  azu = new Azubi("Hinoshi", "kenzo", 1200);
		
		A1.zeigeDaten();
		A1.befoerdere();
		A1.addZulage(200);

		A1.zeigeDaten();
		
		System.out.println();
		
		azu.zeigeDaten();
		azu.erhoeheGehalt(120);
		azu.addZulage(200);
		
		Date date = new Date();
		
		SimpleDateFormat f = new SimpleDateFormat("dd:MM:YYY  HH:mm:ss");
		
		String s = f.format(date);
		
		System.out.println(s);
		
		String current = System.getProperty("user.dir") ;
		System.out.println(current);
	}
}

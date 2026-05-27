package ausgewählteKlassen.Passwort;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;

public class MailAdresse1 {

    private final Properties p = new Properties();

    // Konstruktor: lädt die Datei mit den Mailadressen
    
    public MailAdresse1(String filename) throws IOException {
    	
        try (FileInputStream in = new FileInputStream(filename)) {
        	
            p.load(in);
            
        }
    }

    // Zugriff über Namen
    
    public String getMailAdresse(String name) {
    	
        return p.getProperty(name);
        
    }

    // Alle Namen zurückgeben
    
    public String[] name() {
    	
        String[] namen = new String[p.size()];
        
        Enumeration<?> e = p.propertyNames();
        
        int i = 0;
        
        while (e.hasMoreElements()) {
        	
            namen[i] = (String) e.nextElement();
            
            i++;
            
        }
        
        return namen;
    }

    // Neue Adresse hinzufügen
    
    public void addMailAdresse(String name, String mail) {
    	
        p.put(name, mail);
        
    }

    // Änderungen speichern
    public void save(String filename) throws IOException {
    	
        try (FileOutputStream out = new FileOutputStream(filename)) {
        	
            p.store(out, "Mailadressen gespeichert");
            
        }
    }

    @Override
    public String toString() {
    	
        return Arrays.toString(name());
        
    }

    // Testprogramm
    public static void main(String[] args) throws IOException {
    	
        // Pfad anpassen: Datei muss im Ordner Passwort liegen
    	
        String path = "C:\\Users\\joker\\eclipse-workspace\\KenzoProjekt\\src\\ausgewählteKlassen\\Passwort\\Mailadresse.txt";

        MailAdresse1 mail = new MailAdresse1(path);

        // Zugriff über Namen
        
        System.out.println("Kenzo: " + mail.getMailAdresse("Kenzo"));
        
        System.out.println("Meri: " + mail.getMailAdresse("Meri"));
        
        System.out.println("Joker: " + mail.getMailAdresse("Joker"));

        // Ausgabe aller Namen
        
        System.out.println("Alle Namen: " + Arrays.toString(mail.name()));
        

        // Neue Adresse hinzufügen und speichern
        
        mail.addMailAdresse("Test", "test@example.com");
        
        mail.save(path);
    }
}

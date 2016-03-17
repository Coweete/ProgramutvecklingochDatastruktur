package laboration5;
import sun.awt.PeerEvent;

import java.util.*;
import java.io.*;

public class Exercise2 {
    private ArrayList<Person> persons = new ArrayList<Person>();
    
    public void readPersons( String filnamn ) {
        try {
            BufferedReader br = new BufferedReader( new FileReader( filnamn ) );
            String[] parts;
            Person person;
            String txt = br.readLine();
            while( txt != null ) {
                parts = txt.split( "," );
                person = new Person( parts[ 0 ], parts[ 1 ], parts[ 2 ] );
                persons.add( person );
                txt = br.readLine();
            }
            br.close();
        } catch( IOException e ) {
            System.out.println( "readPersons: " + e );
        }
    }

    public String toString() {
        return "Lagrade personer: " + persons.toString();
    }
    
    public void printPersons() {
        for (Person p : persons){
            System.out.println("Personnummer: " + p.getSocialSecurityNumber() + ", \tNamn: " +
            p.getFirstName() + " " + p.getLastName());
        }
    }
    
    public int position( String socialSecurityNumber ) {
        Person p;
        for (int i = 0; i < persons.size(); i++) {
            p = persons.get(i);
            if(socialSecurityNumber.equals(p.getSocialSecurityNumber())){
                return i;
            }
        }
        return -1;
    }
    
    public void printName( String socialSecurityNumber ) {
        int i = position(socialSecurityNumber);
        if(i == -1){
            System.out.println(socialSecurityNumber + " finns inte!");
        }else {
            Person p = persons.get(i);
            System.out.println("Personen heter " + p.getFirstName() + " " + p.getLastName());
        }
    }
    
    public boolean containsFirstName( String firstName ) {
        for (int i = 0; i < persons.size(); i++) {
            Person p = persons.get(i);
            if(p.getFirstName().equals(firstName)){
                return true;
            }
        }
        return false;
    }
    
    public void changeLastName( String socialSecurityNumber, String lastName ) {
        int pos = position(socialSecurityNumber);
        if(pos != -1){
            Person p = persons.get(pos);
            p.setLastName(lastName);
        }
    }


    
    public static void main( String[] args ) {
        Exercise2 ex2 = new Exercise2();
        ex2.readPersons( "src/files/personer.txt" );
        System.out.println( ex2.toString() );
        ex2.printPersons();
        System.out.println( ex2.position( "840102-4567" ) );
        System.out.println( ex2.position( "111111-2222" ) );
        ex2.printName( "840102-4567" );
        ex2.printName( "111111-2222" );
        System.out.println( ex2.containsFirstName( "Edit" ) );
        System.out.println( ex2.containsFirstName( "Anna" ) );
        ex2.changeLastName( "660503-8901", "Trädrot" );
        ex2.printName("660503-8901");
//        System.out.println( ex2.toString() );
    }
}
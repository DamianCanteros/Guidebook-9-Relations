
package exercise_1.service;

import exercise_1.object.Dog;
import exercise_1.object.Person;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Service {
    
    Scanner read = new Scanner(System.in);
    ArrayList <Person> Persons =  new ArrayList();
    ArrayList <Dog> Dogs =  new ArrayList();

// Crea personas.
    public void createPerson(){
        
        String answer = "Y";
        
        do {
            
            System.out.println("");
            System.out.println("PERSON");
            
            System.out.println("insert name");
            String name = read.next();
            
            System.out.println("insert lastname");
            String lastname = read.next();
            
            System.out.println("insert age");
            int age = read.nextInt();
            
            System.out.println("insert identification");
            int identification = read.nextInt();

            Persons.add(new Person(name,lastname,age,identification));
            
            System.out.println("Do you want insert another Person? Y/N");
            answer = read.next();

        } while (answer.equalsIgnoreCase("Y"));
    }
// Crea perros.
    public void createDog(){
        
        String answer = "Y";
        
        do {
            
            System.out.println("");
            System.out.println("DOG");
            
            System.out.println("insert name");
            String name = read.next();
            
            System.out.println("insert breed");
            String breed = read.next();
            
            System.out.println("insert age");
            int age = read.nextInt();
            
            System.out.println("insert size");
            double size = read.nextDouble();
            
            Dogs.add(new Dog(name,breed,age,size));
            
            System.out.println("Do you want insert another Dog? Y/N");
            answer = read.next();

        } while (answer.equalsIgnoreCase("Y"));
    }
// Muestra en pantalla todos los perros.
    public void showDog(){
        
        for (Dog aux : Dogs) {
            
            System.out.println(aux.toString()); 
        }
    }
// Muestra en pantalla todas las personas.
    public void showPerson(){
        
        for (Person aux : Persons) {
            
            System.out.println(aux.toString()); 
        }
    }
// Carga la moscota adoptada a la persona.
    public void adopt(){

        System.out.println("insert the name of the person who is going to adopt");
        String nameP = read.next();
        
        for (Person aux : Persons) {
            
            if (aux.getName().equalsIgnoreCase(nameP)) {
            
                System.out.println("insert the name of the dog you want to adopt");
                String nameD = read.next();
        
                for (Dog aux2 : Dogs) {

                    if (aux2.getName().equalsIgnoreCase(nameD)) {

                       aux.setDog(aux2); 
                    }
                }
            }     
        }
    }
}

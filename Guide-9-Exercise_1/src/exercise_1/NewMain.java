/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package exercise_1;

import exercise_1.service.Service;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class NewMain {

    public static void main(String[] args) {

        Service s1 = new Service();
        Scanner read = new Scanner(System.in);
        
                int answer;
        
        do {
            System.out.println("");
            System.out.println("What would you like to do?");
            System.out.println("");
            System.out.println("1.Create Person");
            System.out.println("2.Create Dog");
            System.out.println("3.Show Person");
            System.out.println("4.Show Dog");
            System.out.println("5.Adopt Dog");
            System.out.println("6.Salir");
            answer = read.nextInt();
            System.out.println("");

            switch (answer){

                case 1: s1.createPerson();
                break;
                case 2: s1.createDog();
                break;
                case 3: s1.showPerson();
                break;
                case 4: s1.showDog();
                break;
                case 5: s1.adopt();
                break;
                case 6: break;
            } 
        } while (answer!=6);
    }   
}

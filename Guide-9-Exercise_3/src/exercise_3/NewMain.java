/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package exercise_3;

import exercise_3.service.CardService;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class NewMain {

    public static void main(String[] args) {
        
        CardService s1 = new CardService();
        Scanner read = new Scanner(System.in);
        
        int answer;
        
        do {
            System.out.println("");
            System.out.println("What would you like to do?");
            System.out.println("");
            System.out.println("1.Create Deck");
            System.out.println("2.Barajar");
            System.out.println("3.Sacar una carta");
            System.out.println("4.Ver la cantidad de cartas disponibles");
            System.out.println("5.Sacar varias cartas");
            System.out.println("6.Ver cartas del monton");
            System.out.println("7.Ver cartas restantes");
            System.out.println("8.Salir");
            answer = read.nextInt();
            System.out.println("");

            switch (answer){

                case 1: s1.createDeck();
                break;
                case 2: s1.barajar();
                break;
                case 3: s1.siguienteCarta();
                break;
                case 4: s1.cartasDisponibles();
                break;
                case 5: s1.darCartas();
                break;
                case 6: s1.cartasMonton();
                break;
                case 7: s1.mostrarBaraja();
                break;
                case 8: break;
            } 
        } while (answer!=8);   
    }
}

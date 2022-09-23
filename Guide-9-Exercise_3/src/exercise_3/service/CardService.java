
package exercise_3.service;

import exercise_3.object.Card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class CardService {
    
    ArrayList <Card> Deck = new ArrayList();
    ArrayList <Card> DrawPile = new ArrayList();
    ArrayList <Card> DiscardPile = new ArrayList();
    Scanner read = new Scanner(System.in);
             
//crea la baraja
    public void createDeck(){
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 11; j++) {
                int number=j;
                if (j>7) {
                   number=j+2;
                }
                switch (i) {
                    case 0:  Deck.add( new Card(number,"espada"));
                    break;
                    case 1:  Deck.add( new Card(number,"basto"));
                    break;
                    case 2:  Deck.add( new Card(number,"oro"));
                    break;
                    case 3:  Deck.add( new Card(number,"copa"));
                    break;
                }
            }
        }
    }
    
//cambia de posición todas las cartas aleatoriamente.
    public void barajar(){

        Collections.shuffle(Deck);
    }
//devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
    public void siguienteCarta(){
        
        for (Card card : Deck) {
            
            DiscardPile.add(card);
            Deck.remove(card);
            System.out.println(card); 
            break;
        }
        boolean end = Deck.isEmpty();
        if (end) {
            System.out.println("there are no more cards");
        }
    }
//indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles(){
        
        System.out.println(Deck.size());
    }      
//dado un número de cartas que nos pidan, le devolveremos ese número decartas. 
//En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero debemos indicárselo al usuario.
    public void darCartas(){
        
        System.out.println("how many cards do you want");
        int Draw = read.nextInt();
        
        if (Deck.size()>= Draw) {
            
            for (int i = 0; i < Draw; i++) {
                siguienteCarta();
            }
        }else{
            System.out.println("there are no enough cards");
        }
    }   
//mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario
    public void cartasMonton(){
        
        boolean end = Deck.isEmpty();
        if (end) {
            
            System.out.println("there are no more cards");
            
        }else{
            for (Card card : DiscardPile) {
            
                System.out.println(card); 
            }
        }
    } 
//muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja(){
        
        for (Card card : Deck) {
            
            System.out.println(card);   
        }
    } 
}

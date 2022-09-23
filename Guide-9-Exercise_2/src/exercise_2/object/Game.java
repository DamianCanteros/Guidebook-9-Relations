
package exercise_2.object;

import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class Game {
    
    WaterGun wg1 = new WaterGun();
        
    private ArrayList<Player>GamePlayers;
    private WaterGun Gun;

    public Game() {
    }
    
//este método recibe los jugadores y el revolver para guardarlos en los atributos del juego.  
    public void llenarJuego(ArrayList<Player>Players, WaterGun wg1){
        
        GamePlayers=Players;
        Gun=wg1;
    } 
//cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego
    public void ronda(){
            
        boolean wet = false;
        do {
            for (Player aux : GamePlayers) {
                if (aux.disparo(Gun)) {
                    System.out.println("Game Over");
                    System.out.println(aux+" is wet");
                    wet = true;
                    break;
                }
            }
        } while (wet == false);
        

    }   
}



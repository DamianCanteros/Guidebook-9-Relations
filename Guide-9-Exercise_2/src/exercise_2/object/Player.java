
package exercise_2.object;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Player {
    
    WaterGun wg1 = new WaterGun();
    ArrayList<Player>Players =  new ArrayList();
    Scanner read = new Scanner(System.in);
        
    private Integer id; // (representa el número del jugador), 
    private String name; // (Empezara con Jugador más su ID, “Jugador 1” por ejemplo)
    private Boolean wet; // (indica si está mojado o no el jugador)

    public Player() {
    }

    public Player(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWet(Boolean wet) {
        this.wet = wet;
    }

    public void setWg1(WaterGun wg1) {
        this.wg1 = wg1;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean getWet() {
        return wet;
    }

    public WaterGun getWg1() {
        return wg1;
    }
    
    public ArrayList<Player> getPlayers() {
        return Players;
    }
    
    @Override
    public String toString() {
        return "Player " + id + " " + name ;
    }
    
//el método, recibe el revolver de agua y llama a los métodos de mojar() y siguienteChorro() de Revolver.
//El jugador se apunta, aprieta el gatillo y si el revolver tira el agua, el jugador se moja.
//El atributo mojado pasa a false y el método devuelve true, sino false.   
    public boolean disparo(WaterGun wg1){
        
        setWet(wg1.mojar());
        wg1.siguienteChorro();
        return getWet();
    }
//Crea la lista de jugadores
    public void createPlayer(){
       
        int id = 1;
        String answer = "Y";
        do {
            System.out.println("enter player name");
            String name = read.next();

            Players.add(new Player(id,name));
            
            System.out.println("Do you want enter another player? Y/N");
            answer = read.next();
            
            id +=1;
            
        } while (id<7 && answer.equalsIgnoreCase("Y"));
    }
}

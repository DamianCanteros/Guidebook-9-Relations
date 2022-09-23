
package exercise_2.object;

/**
 *
 * @author Damian
 */
public class WaterGun {
    
    
    private int CurrentPosition; //(posición del tambor que se dispara, puede que esté el agua o no) 
    private int WaterPosition; // (la posición del tambor donde se encuentra el agua) 

    public WaterGun() {
    }

    public WaterGun(int CurrentPosition, int WaterPosition) {
        this.CurrentPosition = CurrentPosition;
        this.WaterPosition = WaterPosition;
    }

    public void setCurrentPosition(int CurrentPosition) {
        this.CurrentPosition = CurrentPosition;
    }

    public void setWaterPosition(int WaterPosition) {
        this.WaterPosition = WaterPosition;
    }

    public int getCurrentPosition() {
        return CurrentPosition;
    }

    public int getWaterPosition() {
        return WaterPosition;
    }

    @Override
    public String toString() {
        return "WATER GUN{" + "\n" +
               "Current Position= " + CurrentPosition + "\n" +
               "Water Position= " + WaterPosition ;
    }
    
//le pone los valores de posición actual y de posición del agua. Los valores deben ser aleatorios.
    public void llenarRevolver(){
        
        setCurrentPosition((int)(Math.random() * 6) + 1);
        setWaterPosition((int)(Math.random() * 6) + 1);    
    }
//devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar(){
        
        boolean aux=false;
        
        if (getCurrentPosition() == getWaterPosition()) {
            aux=true;
        }
        return aux;
    }
//cambia a la siguiente posición del tambor
    public void siguienteChorro(){
        
        setCurrentPosition(getCurrentPosition()+1);
    } 
}

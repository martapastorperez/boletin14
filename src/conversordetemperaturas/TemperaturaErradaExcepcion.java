
package conversordetemperaturas;


public class TemperaturaErradaExcepcion extends Exception  {
  
    public TemperaturaErradaExcepcion(){
       super("recorda que a temperatura non pode ser < 80 ºC");
    }
    public TemperaturaErradaExcepcion(String s){
        super(s);
    }
    
}

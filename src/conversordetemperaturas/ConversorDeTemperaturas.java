
package conversordetemperaturas;


public class ConversorDeTemperaturas {

   
    public static void main(String[] args) {
        ConversorTemperaturas ct=new ConversorTemperaturas();
        try{
            ct.centigradosAFharenheit(79);
    
        }catch(TemperaturaErradaExcepcion e){
            System.out.println(e.toString());
        }
        ct.centígradosAReamur(80);
        
    }
    
}

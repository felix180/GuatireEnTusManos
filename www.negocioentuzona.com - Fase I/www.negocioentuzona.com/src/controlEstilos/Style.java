package controlEstilos;

/**
 * Created by caraque on 07/04/2015.
 */
public class Style {
       boolean a = false;
    public String rrButton(){
        String estilo = new String("rr-button");
        if(a==false){
            estilo = "rr-button";
            a = true;
        }else{
            estilo = "rr-button close";
        }
        return estilo;
    }
}

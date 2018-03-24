/*
 * Crear una funcion que reciba una url y lo que queremos optener de esa url
    *String parsearURL("http://www.uasd.edu.do?nombre=albert&apellido=hidalgo&sexo=M&telefono=8099982632","telefono")
    *Si se introduce telefono devolvera el numero
    *String parsearURL(string URL, string llaveBusqueda);
    *Expresiones regulares http://regexlib.com/
 */
package validaciones;

/**
 *
 * @author Usuario
 */
public class Validaciones {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       System.out.println("\033[37mExtrayendo valores de variables pasadas por GET");
       ParsearURL nuevaurl = new ParsearURL();        
       System.out.println(nuevaurl.parsearURL("http://www.uasd.edu.do?nombre=albert&apellido=hidalgo&sexo=M&telefono=8099982632","sexo")); 
       System.out.println(("\033[37mValidando cedulas"));
       Cedula cedula = new Cedula();
       cedula.validar_cedula("03105103315");
       System.out.println(("\033[37mValidando Tajetas"));
       Tarjeta tarjeta = new Tarjeta();
       tarjeta.Tajeta_credio_debito("4762696579621389");
    }
    
}

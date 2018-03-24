/**
 * Albert Eduardo Hidalgo Taveras
 * 24/10/2017
 */
package validaciones;

/**
 *
 * @author Albert Eduardo Hidalgo Taveras
 */
public class Cedula {
    public void validar_cedula(String cedula){
         //Declaración de variables a nivel de método o función.
               int digito;
               int digitoVerificador;
               int longitud = cedula.length();
               int suma_restante_operacion = 0;
               int decena_superior;
               int numero_verificador;
               String resultado_operacion_separadas_por_digitos = "";
               System.out.println("Cedula: "+cedula);
                   //verificamos que la longitud del parametro sea igual a 11
                   if (longitud == 11)
                   {
                    digitoVerificador = Integer.parseInt(cedula.substring(10).trim());
                      /*recorremos en un ciclo for cada dígito de la cédula
                    La operacion seria igual a lo siguiente
                    ejemplo:
                             0560173604 |3 ultimo digito es el verificador
                             1212121212
                    
                    Multiplicamos cada numero de la cedula por 1 o por 2 depediendo su posicion.
                    El siguiente ciclo iterra los numeros pares e impares de una variable i inicializada en 9 para ir hacia atras
                    en el arreglo
                    
                    */
                      for (int i = 9; i >= 0; i--){
                          //si el digito no es par multiplicamos por 2
                          digito = Integer.parseInt(String.valueOf(cedula.charAt(i))); //Convirtiendo lo extraido de la cadena a char y luego a int
                          if ((i % 2) != 0){
                              resultado_operacion_separadas_por_digitos += Integer.toString(digito*2);
                          }
                         
                           else
                           {                             
                               resultado_operacion_separadas_por_digitos += Integer.toString(digito);
                           }
                       }
                      /* El ciclo anteiror almacena las operaciones para posteriormente sumar cada digito por el del lado.
                      OJO no es cada cantidad resultante. por ejemplo un 16 en la multiplicacion de 2*8 seria la suma del 1 y el 6.
                      */
                      for(String valor: resultado_operacion_separadas_por_digitos.split("")){
                          suma_restante_operacion += Integer.parseInt(valor);
                      }
                         decena_superior = ((suma_restante_operacion/10)+1)*10; //Buscando decena inmediatamente superior para restarlo a la suma anterior   
                         numero_verificador = decena_superior - suma_restante_operacion;
                         
                    /*El ultimo numero de la cedula es el digito verificador mientras que el 
                           digitoVerificador es el resultado de la operacion*/
                 if (numero_verificador == digitoVerificador || (numero_verificador%10) == 0 ){
                          System.out.println("Valida");
                      }else{
                     System.out.println("Cedula no valida!" + " Verificar: El ultimo digito podria ser " + numero_verificador);
                 }
                  }
                  else
                 {
                     System.out.println("La cédula debe contener once(11) digitos");
                }

    }
}

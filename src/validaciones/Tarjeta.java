/**
 * Una tarjeta valida tiene un digito inicial igual a:
 * 3 = American Express
 * 4 = Visa
 * 5 = MasterCard
 * 
 */
package validaciones;

/**
 *
 * @author Usuario
 */
public class Tarjeta {
    public void Tajeta_credio_debito(String numero_tarjeta){
         //Declaración de variables a nivel de método o función.
           String expresion_regular = "^((67\\d{2})|(4\\d{3})|(5[1-5]\\d{2})|(6011))(-?\\s?\\d{4}){3}|(3[4,7])\\ d{2}-?\\s?\\d{6}-?\\s?\\d{5}$";
           int digito; //Variable que almacenara cada digito para realizar los calculos
           int digitoVerificador;
           int cantidad_caracteres_tarjeta = numero_tarjeta.length();
           int suma_restante_operacion = 0;
           int decena_superior;
           int numero_verificador;
           String resultado_operacion_separadas_por_digitos = "";
           System.out.println("Tarjeta: "+numero_tarjeta);
            //verificamos que la longitud del parametro sea igual a 15 o 16
           if (cantidad_caracteres_tarjeta == 15 || cantidad_caracteres_tarjeta == 16 && numero_tarjeta.matches(expresion_regular)){
            digitoVerificador = Integer.parseInt(numero_tarjeta.substring(cantidad_caracteres_tarjeta-1).trim());
              /*recorremos en un ciclo for cada dígito de la tarjeta
            La operacion seria igual a lo siguiente

            529028995402515  |8 Digito verificador
            212121212121212

            Multiplicamos cada numero de la tarjeta por 1 o por 2 depediendo su posicion.
            El siguiente ciclo iterra los numeros pares e impares de una variable i inicializada en 0 para ir hacia creciendo
            hasta llegar a 14 que seria el numero 15 de la tarjeta. ( 0 es la primera posicion).                    
            */
              for (int i = 0; i <= cantidad_caracteres_tarjeta-2; i++){
                  //si el digito es par multiplicamos por 2
                  digito = Integer.parseInt(String.valueOf(numero_tarjeta.charAt(i))); //Convirtiendo lo extraido de la cadena a char y luego a int
                  if ((i % 2) == 0){
                      resultado_operacion_separadas_por_digitos += Integer.toString(digito*2);
                  }else{                             
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
             int tipo_tarjeta = Integer.parseInt(numero_tarjeta.substring(0,1).trim());
             switch(tipo_tarjeta){
                 case 3:
                     System.out.println("Tarjeta American Express valida!");
                     break;
                 case 4:
                     System.out.println("Tarjeta VISA valida!");
                     break;
                 case 5:
                    System.out.println("Tarjeta MasterCard valida!");
                    break;
                 
             }
             }else{
             System.out.println("Tarjeta no valida!");
         }
         
          }else{
             System.out.println("La Tarjeta debe contener once(16) digitos numericos");
        }
    }
}

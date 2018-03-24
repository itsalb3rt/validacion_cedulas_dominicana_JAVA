/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validaciones;

/**
 *
 * @author Usuario
 */
public class ParsearURL {
    
    public String parsearURL(String url, String llaveBusqueda){
      String cadena = url;
        cadena = cadena.substring(cadena.indexOf("?")+1)+"&"; //separa las variables del dominio, le agrego el operador & al final para tener un fin al realizar la busqueda
        cadena = cadena.substring(cadena.indexOf(llaveBusqueda)+llaveBusqueda.length()+1); //Buscando desde donde se extraera
        cadena = cadena.substring(0, cadena.substring(0, cadena.indexOf("&")).length()); //Extrayendo segun la cantidad de caracteres desde el indice 0
        return cadena;
    }
}

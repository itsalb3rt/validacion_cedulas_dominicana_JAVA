**Valida cedulas de la Republica Dominicana con el algoritmo de luhn**

*Extra: Tambien valida tarjetas de credito y extrae valores de una URL.*

El algoritmo de Luhn o fórmula de Luhn, también conocida como "algoritmo de módulo 10", es una fórmula de suma de verificación, utilizada para validar una diversidad de números de identificación; como números de tarjetas de crédito, números IMEI, etc.

Esta aplicación verifica si una cedula dominicana es válida según el algoritmo de **luhn** de igual manera valida números de tarjeta de crédito/debito que le pasemos.

Otro extra es que extrae el valor de una variable que le especifiquemos procedente de una URL.

Ejemplo:

           ParsearURL nuevaurl = new ParsearURL();        
           System.out.println(nuevaurl.parsearURL("http://www.uasd.edu.do?nombre=albert&apellido=hidalgo&sexo=M&telefono=8099982632","sexo")); 
           System.out.println(("\033[37mValidando cedulas"));
           Cedula cedula = new Cedula();
           cedula.validar_cedula("03105103315");
           System.out.println(("\033[37mValidando Tajetas"));
           Tarjeta tarjeta = new Tarjeta();
           tarjeta.Tajeta_credio_debito("4762696579621389");
		   
Resultado:

```java
run:
Extrayendo valores de variables pasadas por GET
M
Validando cedulas
Cedula: 03105103315
Valida
Validando Tajetas
Tarjeta: 4762696579621389
Tarjeta VISA valida!
BUILD SUCCESSFUL (total time: 0 seconds)
```

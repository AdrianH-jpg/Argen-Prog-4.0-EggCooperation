/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg8.ejercicio3;

import Entidad.Persona;
import Service.PersonaService;

/**
 *
 * @author Adrian H
 */
public class Guia8Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realizar una clase llamada Persona en el paquete de entidades que
         * tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre,
         * ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún
         * otro atributo, puede hacerlo. Agregar constructores, getters y
         * setters. En el paquete Servicios crear PersonaServicio con los
         * siguientes 3 métodos: Método esMayorDeEdad(): indica si la persona es
         * mayor de edad. La función devuelve un booleano. Metodo
         * crearPersona(): el método crear persona, le pide los valores de los
         * atributos al usuario y después se le asignan a sus respectivos
         * atributos para llenar el objeto Persona. Además, comprueba que el
         * sexo introducido sea correcto, es decir, H, M o O. Si no es correcto
         * se deberá mostrar un mensaje
         * Método calcularIMC(): calculara si la persona está en su peso ideal
         * (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
         * valor menor que 20, significa que la persona está por debajo de su
         * peso ideal y la función devuelve un -1. Si la fórmula da por
         * resultado un número entre 20 y 25 (incluidos), significa que la
         * persona está en su peso ideal y la función devuelve un 0. Finalmente,
         * si el resultado de la fórmula es un valor mayor que 25 significa que
         * la persona tiene sobrepeso, y la función devuelve un 1. A
         * continuación, en la clase main hacer lo siguiente: Crear 4 objetos de
         * tipo Persona con distintos valores, a continuación, llamaremos todos
         * los métodos para cada objeto, deberá comprobar si la persona está en
         * su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e
         * indicar para cada objeto si la persona es mayor de edad. Por último,
         * guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
         * en distintas variables(arrays), para después calcular un porcentaje
         * de esas 4 personas cuantas están por debajo de su peso, cuantas en su
         * peso ideal y cuantos, por encima, y también calcularemos un
         * porcentaje de cuantos son mayores de edad y cuantos menores. Para
         * esto, podemos crear unos métodos adicionales.
         */
        
        
        PersonaService PS = new PersonaService();
       
       
        // Crear 4 objetos de tipo Persona
        Persona persona1 = new Persona("Javier", 28, 'M',70.0,1.8);
        Persona persona2 = new Persona("María", 25, 'M', 60.0, 1.6);
        Persona persona3 = new Persona("Juan", 17, 'H', 70.0, 1.75);
        Persona persona4 = new Persona("Ana", 30, 'M', 55.0, 1.65);
        
        //System.out.println(persona5);
        
//        try{
//            Persona persona5 = PS.crearPersona();
//           System.out.println(PS.esMayorDeEdad(persona5)); 
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

        /*
        Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
        números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
        para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
        una división con los dos numeros y mostrar el resultado.
        */

        
        int[] imcResultados = new int[4];
        boolean[] mayorEdadResultados = new boolean[4];
        
        imcResultados[0] = PS.calcularIMC(persona1);
        mayorEdadResultados[0] = PS.esMayorDeEdad(persona1);
        
        imcResultados[1] = PS.calcularIMC(persona2);
        mayorEdadResultados[1] = PS.esMayorDeEdad(persona2);
        
        imcResultados[2] = PS.calcularIMC(persona3);
        mayorEdadResultados[2] = PS.esMayorDeEdad(persona3);
        
        imcResultados[3] = PS.calcularIMC(persona4);
        mayorEdadResultados[3] = PS.esMayorDeEdad(persona4);
        
        
        // Calculamos el porcentaje de personas por debajo de su peso, en su peso ideal y por encima
        int debajoPeso = 0;
        int pesoIdeal = 0;
        int encimaPeso = 0;
        int mayor = 0;
        int menor = 0;
        
        for (int i = 0; i < imcResultados.length; i++) {
           switch (imcResultados[i]) {
               case -1:
                   debajoPeso++;
                   break;
               case 0:
                   pesoIdeal++;
                   break;
               default:
                   encimaPeso++;
                   break;
           }
        }
        try {
            for (int i = 0; i < mayorEdadResultados.length; i++) {
                if (mayorEdadResultados[i]) {
                    mayor++;
                } else {
                    menor++;
                }
            }
        } catch (RuntimeException e) {
            System.out.println("error "+ e);
        }catch(Exception e){
            System.out.println(e);
        }
        
        double porcentajeDebajoPeso = debajoPeso * 100.0 / imcResultados.length;
        double porcentajePesoIdeal = pesoIdeal * 100.0 / imcResultados.length;
        double porcentajeEncimaPeso = encimaPeso * 100.0 / imcResultados.length;
        double mayorPorcentaje = mayor * 100.0 / mayorEdadResultados.length;
        double menorPorcentaje = menor * 100.0 / mayorEdadResultados.length;
        
        System.out.println("Porcentaje de personas por debajo de su peso ideal: " + porcentajeDebajoPeso + "%");
        System.out.println("Porcentaje de personas en su peso ideal: " + porcentajePesoIdeal + "%");
        System.out.println("Porcentaje de personas con sobre peso: " + porcentajeEncimaPeso + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + mayorPorcentaje + "%");
        System.out.println("Porcentaje de personas menores de edad: " + menorPorcentaje + "%");
    }
    
}

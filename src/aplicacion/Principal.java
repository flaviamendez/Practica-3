/**
 * The Principal class serves as the entry point for the application.
 * It demonstrates the usage of the Matematicas class to calculate the value of PI.
 * 
 * <p>This class contains the main method which prints the value of PI calculated
 * using the piLambda method from the Matematicas class.</p>
 * 
 * @see mates.Matematicas
 */
package aplicacion;

import mates.Matematicas;

public class Principal {
     public static void main(String[] args) {
        System.out.println("El número PI es " + Matematicas.piLambda(100000));
    }
}

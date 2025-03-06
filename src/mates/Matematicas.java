package mates;
import java.util.stream.IntStream;


public class Matematicas {
    public static double piLambda(long pasos) {
        long puntosDentroDelCirculo = IntStream.range(0, (int) pasos)
            .mapToObj(i -> new double[]{Math.random(), Math.random()})
            .filter(punto -> punto[0] * punto[0] + punto[1] * punto[1] <= 1)
            .count();
        return 4 * (double) puntosDentroDelCirculo / pasos;
    }

   
}
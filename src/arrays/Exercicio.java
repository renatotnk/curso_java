package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        double[] notas = {9.9, 7.8, 8.7, 9.8};

        for(double nota:notas){
            System.out.println(nota);
        }
        
        System.out.println(Arrays.toString(notasAlunoA));

    }
}

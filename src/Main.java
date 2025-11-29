import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Vetor do primeiro exercício: " + ex1());
//        System.out.println("Matriz do segundo exercício: " + ex2());
        System.out.println("Vetor do terceiro exercício: " + ex3());

    }

    public static String ex1(){
        int[] numeros = new int[10];

        for (int count = 0; count < numeros.length; count++) {
            numeros[count] = 10 * (count + 1);
            System.out.println("Valor do vetor na posição ["+ count + "]: " + numeros[count]);
        }
        return Arrays.toString(numeros);
    }

    public static String ex2(){
        char[][] letras = new char[4][4];
        char letra = 'a';

        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras.length; j++) {
                letras[i][j] = letra;
                letra++;
                System.out.println("Valor da matriz na posição ["+ i + "][" + j + "]:" + letras[i][j]);
            }
        }
        return Arrays.deepToString(letras);
        // deepToString -> This method is designed for converting multidimensional arrays to strings.
    }

    public static String ex3(){
        Random numeroAleatorio = new Random();
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10];
        int numeroEntrada = 0;

        // Itera no array e lhe atribui valores aleatórios
        for (int posicao = 0; posicao < numeros.length; posicao++) {
            numeros[posicao] = numeroAleatorio.nextInt(100 + 1);
            //Exibe os valores do vetor para consultas
            //System.out.println("Na posição ["+(posicao+1)+"] do vetor, tem o valor: " + numeros[posicao]);
        }

        System.out.println("Digite um número inteiro e positivo para ser procurado no vetor: ");
        numeroEntrada = leitor.nextInt();

        boolean numeroExisteNoArray = false;

        for (int posicao = 0; posicao < numeros.length; posicao++) {
            if (numeroEntrada == numeros[posicao]){
                numeroExisteNoArray = true;
                System.out.println("Está na posição: " + (posicao+1) );
            }
        }

        if (!numeroExisteNoArray){
            System.out.println("O valor não existe no vetor");
        }

        return Arrays.toString(numeros);
    }
}
package Video_de_funcoes;

/* Imprima os números positivos

Escreva uma função que receba 5 números e imprima usando o Display
Se algum dos parâmetros for igual a 0:
“0 é neutro”
Se não apenas os números positivos.

Ex:
(filtrar-positivos -3 -1 0 1 4 7)


Saída esperada:
“0 é neutro”
“1 é positivo”
“4 é positivo”
“7 é positivo”
*/



public class Main {

    public static void filtrarPositivos(int... numeros){

        for (int numero:numeros) {

            if (numero == 0){
                System.out.println("0 é neutro");
            } else if (numero > 0) {
                System.out.println(numero + " é positivo");

            }

        }
    }


    public static void main(String[] args) {

        filtrarPositivos(-3, -1, 0, 1, 4, 7);

    }
}

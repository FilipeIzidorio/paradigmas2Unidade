package funcoes_parte_2.funcao_1;
// Função 1: Converter Números em Letras do Alfabeto

import java.util.List;
import java.util.stream.Collectors;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static final String[] ALFABETO = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
            "u", "v", "w", "x", "y", "z"
    };

    public static String numerosParaLetras(List<Integer> numeros) {
        return numeros.stream()
                .map(n -> ALFABETO[n - 1])
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 26);
        String resultado = numerosParaLetras(numeros);
        System.out.println("Resultado: " + resultado);  // Saída: "abcdz"
    }
}

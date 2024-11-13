package funcoes_parte_2.funcao_2;
//Função 2: Converter Números em Notas Musicais
import java.util.List;
import java.util.stream.Collectors;

public class Main{

    private static final String[] NOTAS = {"Do", "Re", "Mi", "Fa", "Sol", "La", "Si"};

    public static List<String> numerosParaNotas(List<Integer> numeros) {
        return numeros.stream()
                .map(n -> NOTAS[(n - 1) % NOTAS.length])
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3);
        List<String> resultado = numerosParaNotas(numeros);
        System.out.println("Resultado: " + resultado);  // Saída: ["Do", "Re", "Mi"]
    }
}


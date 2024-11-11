package FOP;

public class Main {
    public static void main(String[] args) {
        // Exemplo 1: Verificar qual número é maior
        System.out.println("Exemplo 1: Verificar qual número é maior");
        maiorNumero(10, 20);

        // Exemplo 2: Verificar se dois números são múltiplos
        System.out.println("\nExemplo 2: Verificar se dois números são múltiplos");
        saoMultiplos(15, 5);

        // Exemplo 3: Converter tempo em horas, minutos e segundos
        System.out.println("\nExemplo 3: Converter tempo em horas, minutos e segundos");
        tempoEmHorasMinutosSegundos(3661); // Exemplo com 3661 segundos

        // Exemplo 4: Contagem regressiva até zero
        System.out.println("\nExemplo 4: Contagem regressiva até zero");
        contarAteZero(5);

        // Exemplo 5: Converter idade expressa em dias para anos, meses e dias
        System.out.println("\nExemplo 5: Converter idade expressa em dias para anos, meses e dias");
        idadeEmAnosMesesDias(10500); // Exemplo com 10500 dias

        // Exemplo 6: Calcular operação aritmética
        System.out.println("\nExemplo 6: Calcular operação aritmética");
        double resultadoOperacao = calcularOperacao(10, 5, '+');
        System.out.println("Resultado: " + resultadoOperacao);

        // Exemplo 7: Calcular INSS com base no salário bruto
        System.out.println("\nExemplo 7: Calcular INSS com base no salário bruto");
        double inss = calcularINSS(2000.00); // Exemplo com salário de 2000.00
        System.out.println("Valor do INSS: " + inss);

        // Exemplo 8: Calcular o fatorial de um número
        System.out.println("\nExemplo 8: Calcular o fatorial de um número");
        int numeroFatorial = 5; // Exemplo com o número 5
        long resultadoFatorial = fatorial(numeroFatorial);
        System.out.println("Fatorial de " + numeroFatorial + " é: " + resultadoFatorial);
    }

    // Função para verificar qual número é maior
    public static void maiorNumero(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("O maior número é " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é " + num2);
        } else {
            System.out.println("Os números são iguais");
        }
    }

    // Função para verificar se dois números são múltiplos
    public static void saoMultiplos(int num1, int num2) {
        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("Os números são múltiplos");
        } else {
            System.out.println("Os números não são múltiplos");
        }
    }

    // Função para converter tempo em horas, minutos e segundos
    public static void tempoEmHorasMinutosSegundos(int tempoSegundos) {
        int horas = tempoSegundos / 3600;
        int minutos = (tempoSegundos % 3600) / 60;
        int segundos = tempoSegundos % 60;

        System.out.println("Horas: " + horas + ", Minutos: " + minutos + ", Segundos: " + segundos);
    }

    // Função para contagem regressiva até zero
    public static void contarAteZero(int numero) {
        while (numero > 0) {
            System.out.println(numero);
            numero--;
        }
        System.out.println("Encerrado");
    }

    // Função para converter idade em dias para anos, meses e dias
    public static void idadeEmAnosMesesDias(int idadeDias) {
        int anos = idadeDias / 365;
        int meses = (idadeDias % 365) / 30;
        int dias = (idadeDias % 365) % 30;

        System.out.println("Anos: " + anos + ", Meses: " + meses + ", Dias: " + dias);
    }

    // Função para calcular o resultado de uma operação aritmética
    public static double calcularOperacao(double num1, double num2, char operacao) {
        switch (operacao) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero.");
                    return 0;
                }
            default:
                System.out.println("Operação inválida.");
                return 0;
        }
    }

    // Função para calcular o INSS com base no salário bruto
    public static double calcularINSS(double salarioBruto) {
        if (salarioBruto <= 1200.00) {
            return salarioBruto * 0.02;
        } else if (salarioBruto <= 2500.00) {
            return salarioBruto * 0.05;
        } else {
            return salarioBruto * 0.08;
        }
    }

    // Função para calcular o fatorial de um número
    public static long fatorial(int numero) {
        if (numero < 0) {
            System.out.println("Número inválido para cálculo de fatorial.");
            return -1;
        }

        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}


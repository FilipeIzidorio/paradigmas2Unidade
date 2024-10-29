package TratamentoDeExcecoes;



import TratamentoDeExcecoes.enums.TipoBalanca;
import TratamentoDeExcecoes.exceptions.ArquivoNaoEscritoException;
import TratamentoDeExcecoes.factory.BalancaFactory;
import TratamentoDeExcecoes.interfaces.IBalanca;
import TratamentoDeExcecoes.models.Produto;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws ArquivoNaoEscritoException, FileNotFoundException {
        Produto produto1 = new Produto();
        produto1.setCodigo(1032);
        produto1.setDescricao(" FRANGO");
        produto1.setTipo("9");
        produto1.setValor(5.00);

        Produto produto2 = new Produto();
        produto2.setCodigo(1033);
        produto2.setDescricao(" LIGUINCA");
        produto2.setTipo("9");
        produto2.setValor(5.00);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);

        IBalanca balancaFilizola = BalancaFactory.getBalanca(TipoBalanca.FINIZOLA_SMART);
        balancaFilizola.exportar(produtos, "src/main/java/TratamentoDeExcecoes/testeFilizola.txt");


        IBalanca balancaToledo = BalancaFactory.getBalanca(TipoBalanca.TOLEDO_MGV6);
        balancaToledo.exportar(produtos, "src/main/java/TratamentoDeExcecoes/testeToledo.txt");

        IBalanca balancaUrano = BalancaFactory.getBalanca(TipoBalanca.URANO_INTEGRA);
        balancaUrano.exportar(produtos, "src/main/java/TratamentoDeExcecoes/testeUrano.txt");

        System.out.println("Arquivos gerados com sucesso!");


    }
}


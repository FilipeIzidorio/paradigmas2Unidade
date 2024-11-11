package TratamentoDeExcecoes.interfaces;



import TratamentoDeExcecoes.exceptions.ArquivoNaoEscritoException;

import java.io.FileNotFoundException;
import java.util.List;

public interface IBalanca<T> {
    void exportar(List<T> produtos, String pastaArquivoTxt) throws ArquivoNaoEscritoException, FileNotFoundException;
}

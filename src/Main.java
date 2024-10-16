import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        ConsultaCEP consultaCep = new ConsultaCEP();

        System.out.println("Digite o seu CEP: ");
        var cep = leitura.next();

        try{
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvarArquivo(novoEndereco);
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }


    }

}

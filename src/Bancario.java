import com.sun.org.apache.xpath.internal.SourceTree;
import pessoa.Pessoa;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by willi on 09/08/2017.
 */
public class Bancario {

    public static void main ( String [] Args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int n;
        int m;
        int l;





        Pessoa p = new PessoaFisica("joaquim", "1234567776");
        Pessoa p2 =new PessoaFisica("jose", "2333332322");
        Pessoa p3 = new PessoaJuridica("naosei", "34444322222");
        Pessoa p4 = new PessoaJuridica("Marcelo","433233333");
        Pessoa p5 = new PessoaFisica("julio", "12345456356");
        Pessoa p6 =new PessoaFisica("josiane", "2333336345622");
        Pessoa p7 = new PessoaJuridica("nadir", "344447555522");
        Pessoa p8 = new PessoaJuridica("Marcos","43356433633");
        Pessoa p9 = new PessoaFisica("joana", "1234567775");
        Pessoa p10 =new PessoaFisica("josias", "2333755542");
        Pessoa p11 = new PessoaJuridica("noe", "344765422");
        Pessoa p12 = new PessoaJuridica("Mauricio","435433333");






        Banco b = new Banco();
        b.cadastrar(p);
        b.cadastrar(p2);
        b.cadastrar(p3);
        b.cadastrar(p4);
        b.cadastrar(p5);
        b.cadastrar(p6);
        b.cadastrar(p7);
        b.cadastrar(p8);
        b.cadastrar(p9);
        b.cadastrar(p10);
        b.cadastrar(p11);
        b.cadastrar(p12);

        System.out.println("Quer Listar ou Imprimir as contas");
        System.out.println("1 - Listar,  2 - Imprimir");
        m=entrada.nextInt();

        if(m==1){
            entrada.nextLine();
            System.out.println("Listar 1- Pessoa Fisica, 2- Pessoa Juridica, 3- Todas");
            l = entrada.nextInt();
            if(l==1){
                System.out.println(b.getPessoaFisica());
            }else if(l==2){
                System.out.println(b.getPessoaJuridica());
            }else if(l==3){
                System.out.println(b.getPessoaFisica());
                System.out.println(b.getPessoaJuridica());
            }


        }else{
            entrada.nextLine();
            System.out.println("Escolha o tipo de impressão");
            System.out.println("1- Contas Pessoas Fisicas, 2- Contas Pessoas Juridicas, 3- Todas");
            n = entrada.nextInt();
            if(n == 1) {
                System.out.println("Pessoa Fisica");

                FileWriter arq = new FileWriter("d:\\contas.txt");
                PrintWriter gravaArq = new PrintWriter(arq);

                gravaArq.printf("+---------------------Contas--------------------+ \n");

                gravaArq.println(b.getPessoaFisica());

                gravaArq.printf("+-----------------------------------------------+ ");

                arq.close();

                System.out.println("Listagem de contas de pessoas fisicas criado com sucesso");




            }else if(n==2){
                System.out.println("Pessoa Juridica");

                FileWriter arq = new FileWriter("d:\\contas.txt");
                PrintWriter gravaArq = new PrintWriter(arq);

                gravaArq.printf("+---------------------Contas--------------------+ \n");

                gravaArq.println(b.getPessoaJuridica());

                gravaArq.printf("+-----------------------------------------------+ ");

                arq.close();

                System.out.println("Listagem de contas de pessoas Juridicas criado com sucesso");


            }else if(n==3){
                System.out.println("Todas as contas");

                FileWriter arq = new FileWriter("d:\\contas.txt");
                PrintWriter gravaArq = new PrintWriter(arq);

                gravaArq.printf("+---------------------Contas--------------------+ \n");

                gravaArq.println(b.getPessoaFisica());
                gravaArq.println(b.getPessoaJuridica());

                gravaArq.printf("+-----------------------------------------------+ ");

                arq.close();

                System.out.println("Listagem de contas criado com sucesso");
            }

        }





    }

}

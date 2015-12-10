/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package aplicacao_seguranca;

import java.io.IOException;
import java.util.Scanner;
import modelo.*;
import persistencia.*;

public class Aplicacao_seguranca {

    private static int menu = 0;
    private static int sair = 0;
    
    private static int menuCadastro = 0;
    private static int sairCadastro = 0;
    
    /*variaveis cadastro policial*/
    private static int id_policial;
    private static int num_idPolicial;
    private static String nomePolicial;
    private static String tituloPolicial;
    private static String cepPolicial;
    private static String cidadePolicial;
    private static String bairroPolicial;
    private static String estadoPolicial;
    private static int delegaciaPolicial;
    
    /*variaveis cadastro cidadao*/
    private static int id_cidadao;
    private static String cpfCidadao;
    private static String nomeCidadao;
    private static String sexoCidadao;
    private static String estado_civilCidadao;
    private static String data_nascimentoCidadao;
    private static String cepCidadao;
    private static String cidadeCidadao;
    private static String bairroCidadao;
    private static String estadoCidadao;
    
    /*variaveis cadastro ocorrencia*/
    //
    
    /*variaveis cadastro delegacia*/
    private static int id_delegacia;
    private static String nomeDelegacia;
    private static String cepDelegacia;
    private static String cidadeDelegacia;
    private static String bairroDelegacia;
    private static String estadoDelegacia;
    private static int categoriaDelegacia;
    
    /*variaveis cadastro categoria de delegacia*/
    private static int id_categoriaDelegacia;
    private static String nomeCatDel;
    
    /*variaveis cadastro categoria de item*/
    private static int id_categoriaItem;
    private static String nomeCatItem;
    
    /*variaveis cadastro bairro*/
    private static int id_bairro;
    private static String nomeBairro;
    private static int categoria_segBairro;
    private static String imagemBairro;
    
    /*variaveis cadastro categoria de objeto pessoal*/
    private static int id_categoriaObjPessoal;
    private static String nomeObjPessoal;
   
    /*variaveis cadastro categoria de ocorrencia*/
    private static int id_categoriaOcorrencia;
    private static String nomeCatOcorrencia;
   
    /*variaveis cadastro de deposito*/
    private static int id_deposito;
    private static String nomeDeposito;
    private static int chefeDeposito;
    private static String cepDeposito;
    private static String cidadeDeposito;
    private static String bairroDeposito;
    private static String estadoDeposito;
    private static int delegaciaDeposito;
    
    /*Busca de dados*/
    private static int menuBusca = 0;
    private static int sairBusca = 0;
    
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        while (sair == 0) {
            System.out.println("\t\t--------------- Aplicacao de seguranca cidade BD ---------------");
            System.out.println("\t\t Escolha uma das operações abaixo: ");
            System.out.println("\t\t 1.Cadastrar policial");
            System.out.println("\t\t 2.Cadastrar cidadao");
            System.out.println("\t\t 3.Efetuar cadastro de ocorrencia");
            //System.out.println("\t\t 4.Cadastros gerais");
            System.out.println("\t\t 4.Busca de dados no sistema");
            System.out.println("\t\t 5.Sair da aplicacao");
            menu = scan.nextInt();
            
            //new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            
            switch (menu)
            {
                case 1:
                    System.out.println("\t\t-----------------------------------------------------------");
                    System.out.println("\t\t                Cadastro de policial");
                    Policial policial = new Policial();
                    System.out.println("\t\t Insira os dados para o cadastro");
                    System.out.println("\t\t Nome: ");
                   
                    break;
                
                case 2:
                    System.out.println("\t\t-----------------------------------------------------------");
                    System.out.println("\t\t                Cadastro de cidadao");
                    
                    
                    break;
                case 3:
                    System.out.println("\t\t-----------------------------------------------------------");
                    System.out.println("\t\t                Cadastro de Ocorrencia");
                    
                    
                    break;
                      
                case 4:
                    while(sairBusca == 0){
                        System.out.println("\t\t-----------------------------------------------------------");
                        System.out.println("\t\t                Cadastros Gerais");
                        System.out.println("\n\t\t Escolha uma das operações abaixo: ");
                        System.out.println("\t\t 1.Cadastrar delegacia");
                        System.out.println("\t\t 2.Cadastrar categoria de delegacia");
                        System.out.println("\t\t 3.Cadastrar categoria de item");
                        System.out.println("\t\t 4.Cadastrar categoria de seguranca");
                        System.out.println("\t\t 5.Cadastrar bairro");
                        System.out.println("\t\t 6.Cadastrar categoria de objeto pessoal");
                        System.out.println("\t\t 7.Cadastrar categoria de ocorrencia");
                        System.out.println("\t\t 8.Cadastrar deposito");
                        System.out.println("\t\t 9.Sair de Cadastros gerais");
                        menuBusca = scan.nextInt();
                        
                        switch (menuBusca)
                        {
                            case 1:
                                System.out.println("\t\t-----------------------------------------------------------");
                                System.out.println("\t\t                Cadastro de delegacia");
                                System.out.println("\t\t Insira os dados para o cadastro");
                                
                                break;
                            case 2:
                                System.out.println("\t\t-----------------------------------------------------------");
                                System.out.println("\t\t                Cadastro de categoria de delegacia");
                                System.out.println("\t\t Insira os dados para o cadastro");
                                sairBusca = 1;
                                break;
                        }
                    }
                    break;
                case 6:
                    sair = 1;    
                    break;
            }
        }
        System.out.println("teste");
    } 
}

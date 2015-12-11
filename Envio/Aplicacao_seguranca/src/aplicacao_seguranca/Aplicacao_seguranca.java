/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package aplicacao_seguranca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.*;
import persistencia.*;

public class Aplicacao_seguranca {

    private static int menu = 0;
    private static int sair = 0;
    private static String espera;
    
    /*Busca de dados*/
    private static int menuBusca = 0;
    private static int sairBusca = 0;
    
    /*Policial*/
    private static int menuPolicial = 0;
    private static int sairPolicial = 0;
    
    /*Cidadao*/
    private static int menuCidadao = 0;
    private static int sairCidadao = 0;
    
    /*Ocorrencia*/
    private static int menuOcorrencia = 0;
    private static int sairOcorrencia = 0;
    
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
    private static int id_ocorrencia = 0; 
    private static int num_ocorrencia = 0;
    private static String observacaoOcorrencia;
    private static int policialOcorrencia = 0;
    private static int categoriaOcorrencia = 0;
    private static int bairroOcorrencia = 0;

    

    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        while (sair == 0) {
            System.out.println("\t\t--------------- Aplicacao de seguranca cidade BD ---------------");
            System.out.println("\t\t Escolha uma das operações abaixo: ");
            System.out.println("\t\t 1.Menu policial");
            System.out.println("\t\t 2.Menu cidadao");
            System.out.println("\t\t 3.Menu ocorrencia");
            System.out.println("\t\t 4.Busca de dados no sistema");
            System.out.println("\t\t 5.Sair da aplicacao");
            menu = scan.nextInt();
            
            //new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            
            switch (menu)
            {
                case 1:
                    
                    while (sairPolicial == 0){
                        System.out.println("\t\t-----------------------------------------------------------");
                        System.out.println("\t\t                Menu policial");
                        System.out.println("\t\t Escolha uma das opcoes abaixo:");
                        System.out.println("\t\t 1.Cadastrar policial");
                        System.out.println("\t\t 2.Atualizar policial");
                        System.out.println("\t\t 3.Excluir policial");
                        System.out.println("\t\t 4.Ver lista de policiais");
                        System.out.println("\t\t 5.Sair do menu do policial");
                        menuPolicial = scan.nextInt();

                        Policial policial = new Policial();
                        PolicialDAO pDAO = new PolicialDAO();
                    
                        switch (menuPolicial)
                        {
                            case 1:
                                
                                System.out.println("\t\tInsira os dados a serem cadastrados");
                                System.out.println("\t\tNum_id:");
                                num_idPolicial = scan.nextInt();
                                System.out.println("\t\tNome:");
                                nomePolicial = scan.nextLine();
                                nomePolicial = scan.nextLine();
                                System.out.println("\t\tTitulo:");
                                tituloPolicial = scan.nextLine();
                                System.out.println("\t\tCep: ");
                                cepPolicial = scan.nextLine();
                                System.out.println("\t\tCidade:");
                                cidadePolicial = scan.nextLine();
                                System.out.println("\t\tBairro:");
                                bairroPolicial = scan.nextLine();
                                System.out.println("\t\tEstado:");
                                estadoPolicial = scan.nextLine();
                                System.out.println("\t\tDelegacia:");
                                delegaciaPolicial = scan.nextInt();
                                
                                policial.setNum_id(num_idPolicial);
                                policial.setNome(nomePolicial);
                                policial.setTitulo(tituloPolicial);
                                policial.setCep(cepPolicial);
                                policial.setCidade(cidadePolicial);
                                policial.setBairro(bairroPolicial);
                                policial.setEstado(estadoPolicial);
                                policial.setDelegacia(delegaciaPolicial);
                                
                                pDAO.inserir(policial);
                                espera = scan.nextLine();
                                System.out.println("\n\n\n\n\n\n\n\n\n");
                                break;
                                
                            case 2:
                                System.out.println("\t\tInsira os dados a serem alterados");
                                System.out.println("\t\tNum_id:");
                                num_idPolicial = scan.nextInt();
                                System.out.println("\t\tNome:");
                                nomePolicial = scan.nextLine();
                                nomePolicial = scan.nextLine();
                                System.out.println("\t\tTitulo:");
                                tituloPolicial = scan.nextLine();
                                System.out.println("\t\tCep: ");
                                cepPolicial = scan.nextLine();
                                System.out.println("\t\tCidade:");
                                cidadePolicial = scan.nextLine();
                                System.out.println("\t\tBairro:");
                                bairroPolicial = scan.nextLine();
                                System.out.println("\t\tEstado:");
                                estadoPolicial = scan.nextLine();
                                System.out.println("\t\tDelegacia:");
                                delegaciaPolicial = scan.nextInt();
                                System.out.println("\t\tInsira a Id do policial a ser atualizado: ");
                                id_policial = scan.nextInt();
                                
                                policial.setNum_id(num_idPolicial);
                                policial.setNome(nomePolicial);
                                policial.setTitulo(tituloPolicial);
                                policial.setCep(cepPolicial);
                                policial.setCidade(cidadePolicial);
                                policial.setBairro(bairroPolicial);
                                policial.setEstado(estadoPolicial);
                                policial.setDelegacia(delegaciaPolicial);
                                policial.setId_policial(id_policial);
                                
                                pDAO.alterar(policial);
                                
                                espera = scan.nextLine();
                                System.out.println("\n\n\n\n\n\n\n\n\n");
                                
                                break;
                                
                            case 3:
                                System.out.println("Exclusao de dados, insira a Id do policial para retirar seu cadastro da base de dados.");
                                System.out.println("Id: ");
                                id_policial = scan.nextInt();
                                
                                policial.setId_policial(id_policial);
                                
                                pDAO.excluir(policial);
                                
                                espera = scan.nextLine();
                                System.out.println("\n\n\n\n\n\n\n\n\n");
                                
                                break;
                                
                            case 4:
                                System.out.println("Impressao dos policiais cadastrados no sistema");
                                List<Policial> policiais = new ArrayList<>();
                                
                                policiais = pDAO.getLista();
                                System.out.println("Num_id\tNome\t\tTitulo\tCep\tCidade\tBairro\tEstado\tDelegacia\tId_policial");
                                for (int i = 0; i < policiais.size(); i++) {
                                      policial = policiais.get(i);
                                      System.out.println(policial.getNum_id()+"\t|"+policial.getNome()+"\t\t|"+policial.getTitulo()+"\t|"+policial.getCep()+"\t|"+policial.getCidade()+"\t|"+policial.getBairro()+"\t|"+policial.getEstado()+"\t|"+policial.getDelegacia()+"\t|"+policial.getId_policial());
                                }
                                espera = scan.nextLine();
                                
                                espera = scan.nextLine();
                                System.out.println("\n\n\n\n\n\n\n\n\n");
                                
                                break;

                            case 5:
                                sairPolicial = 1;
                                
                                espera = scan.nextLine();
                                System.out.println("\n\n\n\n\n\n\n\n\n");
                                
                                break;
                        }
                    }
                  
                    break;
                
                case 2:
                    
                    while (sairCidadao == 0){
                        System.out.println("\t\t-----------------------------------------------------------");
                        System.out.println("\t\t                Menu cidadao");
                        System.out.println("\t\t Escolha uma das opcoes abaixo:");
                        System.out.println("\t\t 1.Cadastrar cidadao");
                        System.out.println("\t\t 2.Atualizar cidadao");
                        System.out.println("\t\t 3.Excluir cidadao");
                        System.out.println("\t\t 4.Ver lista de cidadao");
                        System.out.println("\t\t 5.Sair do menu do cidadao");

                        menuCidadao = scan.nextInt();
                    
                        Cidadao cidadao = new Cidadao();
                        CidadaoDAO cDAO = new CidadaoDAO();
                        
                        switch (menuCidadao)
                        {
                             case 1:
                                System.out.println("\t\tInsira os dados a serem cadastrados");
                                System.out.println("\t\tCpf:");
                                cpfCidadao = scan.nextLine();
                                cpfCidadao = scan.nextLine();
                                System.out.println("\t\tNome:");
                                nomeCidadao = scan.nextLine();
                                System.out.println("\t\tSexo:");
                                sexoCidadao = scan.nextLine();
                                System.out.println("\t\tEstado Civil:");
                                estado_civilCidadao = scan.nextLine();
                                System.out.println("\t\tData de nascimento:");
                                data_nascimentoCidadao = scan.nextLine();
                                System.out.println("\t\tCep: ");
                                cepCidadao = scan.nextLine();
                                System.out.println("\t\tCidade:");
                                cidadeCidadao = scan.nextLine();
                                System.out.println("\t\tBairro:");
                                bairroCidadao = scan.nextLine();
                                System.out.println("\t\tEstado:");
                                estadoCidadao = scan.nextLine();
                                
                                cidadao.setCpf(cpfCidadao);
                                cidadao.setNome(nomeCidadao);
                                cidadao.setSexo(sexoCidadao);
                                cidadao.setEstado_civil(estado_civilCidadao);
                                cidadao.setData_nascimento(data_nascimentoCidadao);
                                cidadao.setCep(cepCidadao);
                                cidadao.setCidade(cidadeCidadao);
                                cidadao.setBairro(bairroCidadao);
                                cidadao.setEstado(estadoCidadao);
                                
                                cDAO.inserir(cidadao);
                                
                                System.out.println("\n\n\n\n\n\n\n\n\n");
                                break;
                                
                            case 2:
                                System.out.println("\t\tInsira os dados a serem alterados");
                                System.out.println("\t\tCpf:");
                                cpfCidadao = scan.nextLine();
                                cpfCidadao = scan.nextLine();
                                System.out.println("\t\tNome:");
                                nomeCidadao = scan.nextLine();
                                System.out.println("\t\tSexo:");
                                sexoCidadao = scan.nextLine();
                                System.out.println("\t\tEstado Civil:");
                                estado_civilCidadao = scan.nextLine();
                                System.out.println("\t\tData de nascimento:");
                                data_nascimentoCidadao = scan.nextLine();
                                System.out.println("\t\tCep: ");
                                cepCidadao = scan.nextLine();
                                System.out.println("\t\tCidade:");
                                cidadeCidadao = scan.nextLine();
                                System.out.println("\t\tBairro:");
                                bairroCidadao = scan.nextLine();
                                System.out.println("\t\tEstado:");
                                estadoCidadao = scan.nextLine();
                                System.out.println("\t\tInsira a Id do cidadao a ser atualizado:");
                                id_cidadao = scan.nextInt();
                                
                                cidadao.setCpf(cpfCidadao);
                                cidadao.setNome(nomeCidadao);
                                cidadao.setSexo(sexoCidadao);
                                cidadao.setEstado_civil(estado_civilCidadao);
                                cidadao.setData_nascimento(data_nascimentoCidadao);
                                cidadao.setCep(cepCidadao);
                                cidadao.setCidade(cidadeCidadao);
                                cidadao.setBairro(bairroCidadao);
                                cidadao.setEstado(estadoCidadao);
                                cidadao.setId_cidadao(id_cidadao);
                                
                                cDAO.alterar(cidadao);
                                System.out.println("\n\n\n\n\n\n\n\n\n");    
                                break;
                                
                            case 3:
                                System.out.println("Exclusao de dados, insira a Id do cidadao para retirar seu cadastro da base de dados.");
                                System.out.println("Id: ");
                                id_cidadao = scan.nextInt();
                                
                                cidadao.setId_cidadao(id_cidadao);
                                
                                cDAO.excluir(cidadao);
                                System.out.println("\n\n\n\n\n\n\n\n\n");
                                break;
                            case 4:
                                System.out.println("Impressao dos cidadaos cadastrados no sistema");
                                List<Cidadao> cidadaos = new ArrayList<>();
                                
                                cidadaos = cDAO.getLista();
                                
                                System.out.println("Cpf\tNome\tSexo\tEstado civil\tData de nascimento\tCep\tCidade\tBairro\tEstado\tDelegacia\tId_policial");
                                for (int i = 0; i < cidadaos.size(); i++) {
                                      cidadao = cidadaos.get(i);
                                      System.out.println(cidadao.getCpf()+"\t|"+cidadao.getNome()+"\t\t|"+cidadao.getSexo()+"\t|"+cidadao.getEstado_civil()+"\t|"+cidadao.getData_nascimento()+"\t|"+cidadao.getCep()+"\t|"+cidadao.getCidade()+"\t|"+cidadao.getBairro()+"\t|"+cidadao.getEstado()+"\t|"+cidadao.getId_cidadao());
                                }
                                System.out.println("\n\n\n\n\n\n\n\n\n");
                                break;

                            case 5:
                                sairCidadao = 1;
                                System.out.println("\n\n\n\n\n\n\n\n\n");
                                break;
                        }
                    }
                    
                    break;

                case 3:
                    while (sairOcorrencia == 0){
                        System.out.println("\t\t-----------------------------------------------------------");
                        System.out.println("\t\t                Menu de Ocorrencia");
                        System.out.println("\t\t Escolha uma das opcoes abaixo:");
                        System.out.println("\t\t 1.Cadastrar ocorrencia");
                        System.out.println("\t\t 2.Atualizar ocorrencia");
                        System.out.println("\t\t 3.Excluir ocorrencia");
                        System.out.println("\t\t 4.Ver lista de ocorrencias");
                        System.out.println("\t\t 5.Sair do menu de ocorrencia");
                        menuOcorrencia = scan.nextInt();
                    
                        Ocorrencia ocorrencia = new Ocorrencia();
                        OcorrenciaDAO oDAO = new OcorrenciaDAO();
                    
                        switch (menuOcorrencia)
                        {
                            case 1:

                                System.out.println("\t\tInsira os dados a serem cadastrados");
                                System.out.println("\t\tNumero Ocorrencia:");
                                num_ocorrencia = scan.nextInt();
                                System.out.println("\t\tObservacao:");
                                observacaoOcorrencia = scan.nextLine();
                                observacaoOcorrencia = scan.nextLine();
                                System.out.println("\t\tPolicial:");
                                policialOcorrencia = scan.nextInt();
                                System.out.println("\t\tCategoria: ");
                                categoriaOcorrencia = scan.nextInt();
                                System.out.println("\t\tBairro:");
                                bairroOcorrencia = scan.nextInt();
                                
                                ocorrencia.setNum_ocorrencia(num_ocorrencia);
                                ocorrencia.setObservacao(observacaoOcorrencia);
                                ocorrencia.setPolicial(policialOcorrencia);
                                ocorrencia.setCategoria(categoriaOcorrencia);
                                ocorrencia.setBairro(bairroOcorrencia);
                                
                                oDAO.inserir(ocorrencia);
                                
                                espera = scan.nextLine();
                                System.out.println("\n\n\n\n\n\n\n\n\n");
                                break;

                            case 2:
                                System.out.println("\t\tInsira os dados a serem alterados");
                                System.out.println("\t\tNumero Ocorrencia:");
                                num_ocorrencia = scan.nextInt();
                                System.out.println("\t\tObservacao:");
                                observacaoOcorrencia = scan.nextLine();
                                observacaoOcorrencia = scan.nextLine();
                                System.out.println("\t\tPolicial:");
                                policialOcorrencia = scan.nextInt();
                                System.out.println("\t\tCategoria: ");
                                categoriaOcorrencia = scan.nextInt();
                                System.out.println("\t\tBairro:");
                                bairroOcorrencia = scan.nextInt();
                                System.out.println("\t\tId da Ocorrencia:");
                                id_ocorrencia = scan.nextInt();
                                
                                ocorrencia.setNum_ocorrencia(num_ocorrencia);
                                ocorrencia.setObservacao(observacaoOcorrencia);
                                ocorrencia.setPolicial(policialOcorrencia);
                                ocorrencia.setCategoria(categoriaOcorrencia);
                                ocorrencia.setBairro(bairroOcorrencia);
                                ocorrencia.setId_ocorrencia(id_ocorrencia);
                                
                                oDAO.alterar(ocorrencia);

                                espera = scan.nextLine();
                                System.out.println("\n\n\n\n\n\n\n\n\n");

                                break;

                            case 3:
                                System.out.println("Exclusao de dados, insira a Id da ocorrencia para retirar seu cadastro da base de dados.");
                                System.out.println("Id: ");
                                id_ocorrencia = scan.nextInt();

                                ocorrencia.setId_ocorrencia(id_ocorrencia);

                                oDAO.excluir(ocorrencia);

                                espera = scan.nextLine();
                                System.out.println("\n\n\n\n\n\n\n\n\n");

                                break;

                            case 4:
                                System.out.println("Impressao das ocorrencias cadastradas no sistema");
                                List<Ocorrencia> ocorrencias = new ArrayList<>();

                                ocorrencias = oDAO.getLista();
                                System.out.println("Id ocorrencia\tNumero Ocorrencia\tObservacao\tPolicial\tCategoria\tBairro");
                                for (int i = 0; i < ocorrencias.size(); i++) {
                                      ocorrencia = ocorrencias.get(i);
                                      System.out.println(ocorrencia.getId_ocorrencia()+"\t|"+ocorrencia.getNum_ocorrencia()+"\t\t|"+ocorrencia.getObservacao()+"\t|"+ocorrencia.getPolicial()+"\t|"+ocorrencia.getCategoria()+"\t|"+ocorrencia.getBairro());
                                }
                                espera = scan.nextLine();

                                espera = scan.nextLine();
                                System.out.println("\n\n\n\n\n\n\n\n\n");

                                break;
                            case 5:
                                sairOcorrencia = 1;
                                break;
                        }
                    }
                        
                    break;
                case 4:
                    
                    break;
                case 5:
                    sair = 1;    
                    break;
            }
        }
    } 
}

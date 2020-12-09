package main.modulos.GramaticasRegulares.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import main.grupo03.AppController;
import main.modulos.GramaticasRegulares.domain.models.GR;
import main.modulos.GramaticasRegulares.domain.utils.Gerador;
import main.modulos.GramaticasRegulares.domain.utils.Regras;

public class GRController extends AppController {
    private final Tooltip tipo = Tooltip.GR;
    
    public HashMap<String, String> validacao = new HashMap<String, String>();
    private int qtdPalavras;
    private String nao_terminais, terminais, regras, raizes, resultado;
    
    static GR G_R = new GR(); //VARIAVEL QUE CONTEM LISTAS COM AS VARIAVEIS TERMINAIS, NAO-TERMINAIS E CONJUNTOS DE REGRAS PARA CADA NAO TERMINAL
    static Gerador gerador = new Gerador();
    
    private static int infinity; //VARIAVEL USADA PARA REALIZAR VERIFICACAO DE EXCECOES
    
    private String argumento; //VARIAVEL USADA PARA INTERAGIR COM O USUARIO
    private Scanner scan = new Scanner(System.in); //VARIAVEL USADA PARA INTERAGIR COM O USUARIO
    private String alfa = new String(); //VARIAVEL USADA PARA GUARDAR O ALFABETO COMPLETO CONTENDO VARIAVEIS TERMINAIS E NAO-TERMINAIS
    private char cont_alfa[]; //VARIAVEL USADA PARA GUARDAR O ALFABETO COMPLETO CONTENDO VARIAVEIS TERMINAIS E NAO-TERMINAIS NO FORMATO DE VETOR
    private char[] cont_regra_0; //VARIAVEL USADA PARA REALIZAR VERIFICACAO DE EXCECOES
    private List<String> cont_regra_1 = new ArrayList(); //VARIAVEL USADA PARA REALIZAR VERIFICACAO DE EXCECOES
    private boolean verificador; //VARIAVEL USADA PARA REALIZAR VERIFICACAO DE EXCECOES
    private boolean caso_do_meio;
    private int cont_0; //VARIAVEL USADA PARA REALIZAR VERIFICACAO DE EXCECOES
    private int cont_1; //VARIAVEL USADA PARA REALIZAR VERIFICACAO DE EXCECOES
    private int n, automatico;

    public GRController() {
        
    }
    
    public GRController(int qtd, String nao_terminais, String terminais, String regras, String raizes) {
        alfa = alfa + "&"; //DEFININDO QUE O PRIMEIRO ELEMENTO DO ALFABETO É O VAZIO
        n = qtd;
        this.qtdPalavras = qtd;
        gerador.setQtd(qtd);
        
        addNaoTerminais(nao_terminais);
        this.nao_terminais = nao_terminais;
        addTerminais(terminais);
        this.terminais = terminais;
        
        cont_alfa = alfa.toCharArray(); //PASSA A STRING DO ALFABETO PARA O FORMATO ARRAY
        
        addRegras(regras);
        this.regras = regras;
        
        addRaizes(raizes);
        this.raizes = raizes;
        
    }
    
    public boolean addNaoTerminais(String string) {
        string = string.replaceAll(" ", "");
        String[] split = string.split(",");
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals(" ")) {
                argumento = split[i];
                
                verificador = false; //VARIAVEL TODA VEZ QUE ENTRA NESSA FUNCAO É DEFINIDA EM FALSE
                for (int x = 0; x < G_R.nao_terminais.size(); x++) { //PERCORRE TODAS NAO TERMINAIS
                    if (G_R.nao_terminais.get(x).contains(argumento)) { //COMPARA SE O USUARIO DIGITOU UMA NAO-TERMINAL REPETIDA
                        validacao.put("erroNaoTerminal", "\nSimbolo invalido! Ja existente nas variaveis nao-terminais\n"); //INTERACAO COM O USUARIO
                        verificador = true; //DEFINE TRUE SINALIZANDO QUE HOUVE UMA EXCECAO
                    }
                }
                if (argumento.contains("&")) { //VERIFICA SE USUARIO DIGITOU O SIMBOLO USADO PARA DEFINIR VAZIO
                    validacao.put("erroNaoTerminal", "\nSimbolo '&' invalido! Ja existente simbolizando o vazio\n"); //INTERACAO COM O USUARIO
                    verificador = true; //DEFINE TRUE SINALIZANDO QUE HOUVE UMA EXCECAO
                    break;
                }
                if (verificador == false) { //CASO SEJA FALSE PROCEGUE
                    G_R.nao_terminais.add(argumento); //ARMAZENA A NAO-TERMINAL DIGITADA PELO USUARIO
                    G_R.conj_regras.add(new Regras()); //ADICIONA UM ESPACO NA LISTA DE REGRAS
                    alfa = alfa + argumento; //ADICIONA A NAO TERMINAL NO ALFABETO
                    // System.out.println("\nInserido com sucesso!\n"); //INTERACAO COM O USUARIO
                }
            }
        }

        return validacaoStatus();
        
    }
    
    public boolean addTerminais(String string) {
        string = string.replaceAll(" ", "");
        String[] split = string.split(",");
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals(" ")) {
                argumento = split[i];
                
                verificador = false; //VARIAVEL TODA VEZ QUE ENTRA NESSA FUNCAO É DEFINIDA EM FALSE
                for (int x = 0; x < G_R.nao_terminais.size(); x++) { //PERCORRE TODAS NAO TERMINAIS
                    if (G_R.nao_terminais.get(x).contains(argumento)) { //COMPARA SE O USUARIO DIGITOU UMA TERMINAL IGUAL A UMA NAO-TERMINAL
                        validacao.put("erroTerminal", "\nSimbolo invalido! Ja existente nas variaveis nao-terminais\n"); //INTERACAO COM O USUARIO
                        verificador = true; //DEFINE TRUE SINALIZANDO QUE HOUVE UMA EXCECAO
                    }
                }
                for (int x = 0; x < G_R.terminais.size(); x++) { //PERCORRE TODAS TERMINAIS
                    if (G_R.terminais.get(x).contains(argumento)) {//COMPARA SE O USUARIO DIGITOU UMA TERMINAL REPETIDA
                        validacao.put("erroTerminal", "\nSimbolo invalido! Ja existente nas variaveis terminais\n"); //INTERACAO COM O USUARIO
                        verificador = true; //DEFINE TRUE SINALIZANDO QUE HOUVE UMA EXCECAO
                    }
                }
                if (argumento.contains("&")) { //VERIFICA SE USUARIO DIGITOU O SIMBOLO USADO PARA DEFINIR VAZIO
                    validacao.put("erroTerminal", "\nSimbolo '&' invalido! Ja existente simbolizando o vazio\n"); //INTERACAO COM O USUARIO
                    verificador = true; //DEFINE TRUE SINALIZANDO QUE HOUVE UMA EXCECAO
                }
                if (verificador == false) { //CASO SEJA FALSE PROCEGUE
                    G_R.terminais.add(argumento); //ARMAZENA A TERMINAL DIGITADA PELO USUARIO
                    alfa = alfa + argumento; //ADICIONA A NAO TERMINAL NO ALFABETO
                    // System.out.println("\nInserido com sucesso!\n"); //INTERACAO COM O USUARIO
                }
            }
        }

        return validacaoStatus();
        
    }
    
    public boolean addRegras(String string) {
        string = string.replaceAll(" ", "");
        String[] split = string.split(",");
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals(" ")) {
                argumento = split[i];
                
                cont_0 = 0; //VARIAVEL USADA PARA VERIFICACAO DE EXCECAO
                cont_1 = 0; //VARIAVEL USADA PARA VERIFICACAO DE EXCECAO
                verificador = false; //VARIAVEL TODA VEZ QUE ENTRA NESSA FUNCAO É DEFINIDA EM FALSE
                caso_do_meio = true; //VARIAVEL TODA VEZ QUE ENTRA NESSA FUNCAO É DEFINIDA EM TRUE
                cont_regra_0 = argumento.toCharArray(); //ARGUMENTO E PASSADO PARA FORMA DE ARRAY PARA PODER SER ANALISADO MELHOR
                cont_regra_1.clear(); //LISTA COM CARACTERES E LIMPA

                for (int x = 0; x < cont_regra_0.length; x++) { //PERCORRE TODOS OS CARACTERES DIGITADOS PELO USUARIO
                    for (int y = 0; y < cont_alfa.length; y++) { //PERCORRE TODO ALFABETO
                        if (cont_regra_0[x] == cont_alfa[y]) { //VERIFICA SE O CARACTER PERTENCE AO ALFABETO
                            cont_0++; //SOMA CASO PERTENCA
                        }
                    }
                }
                
                for (int x = 0; x < cont_regra_0.length; x++) { //PERCORRE TODOS OS CARACTERES DIGITADOS PELO USUARIO
                    for (int y = 0; y < G_R.nao_terminais.size(); y++) { //PERCORRE TODAS VARIAVEIS NAO-TERMINAIS
                        StringBuilder aux_0 = new StringBuilder(); //CRIA UMA STRINGBUILDER
                        aux_0.append(cont_regra_0[x]); //ADICIONA O CARACTER QUE ESTA SENDO ANALISADO
                        String aux_1 = aux_0.toString(); //PASSA O CARACTER PARA O MODELO STRING
                        if (aux_1.contains(G_R.nao_terminais.get(y))) { //VERIFICA SE O CARACTER É IGUAL A ALGUMA VARIAVEL NAO-TERMINAL
                            if ((x == 0 || x == cont_regra_0.length-1)) { //VERIFICA SE É A ULTIMA OU PRIMEIRA POSICAO DA REGRA PARA GARANTIR QUE SEJA LINEAR A DIREITA OU A ESQUERDA
                                caso_do_meio = false; 
                            }
                            cont_1++; //SOMA SE É IGUAL A ALGUMA NAO-TERMINAL
                        }
                    }
                }
                
                if(cont_1 == 0) //VERIFICA SE NENHUMA NAO-TERMINAL FOI DIGITADA
                {
                 caso_do_meio = false; //FALSO CASO NAO HAJA PROBLEMAS E NENHUM RISCO DE QUEBRA DE LINEARIDADE 
                }
                
                if (cont_0 == cont_regra_0.length && cont_1 < 2 && caso_do_meio == false) { //CASO SEJA CONT_0 IGUAL O TAMANHO DA PALAVRA DIGITADA SIGNIFICA QUE TODOS CARACTERES PERTENCEM AO ALFABETO QUE FOI GERADO, CASO CONT_1 DEMONSTRE QUE HA MENOS DE DUAS NAO-TERMINAIS NO TERMO E CASO NAO HAJA NENHUMA QUEBRA DE LINEARIDADE ENTAO O PROCESSO SEGUE
                    G_R.conj_regras.get(i).derivacoes.add(argumento); //A REGRA E ADICIONADA NA LISTA DE REGRAS
                    // System.out.println("\nInserido com sucesso!\n"); //INTERACAO COM O USUARIO
                } else {
                    validacao.put("erroRegra", "\nSimbolo "+ argumento +" invalido!\n"); //INTERACAO COM O USUARIO
                }
            }
        }

        return validacaoStatus();
        
    }
    
    public boolean addRaizes(String string) {
        string = string.replaceAll(" ", "");
        String[] split = string.split(",");
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals(" ")) {
                argumento = split[i];
                
                verificador = false; //VARIAVEL TODA VEZ QUE ENTRA NESSA FUNCAO É DEFINIDA EM FALSE
                for (int x = 0; x < G_R.nao_terminais.size(); x++) { //PERCORRE TODAS NAO-TERMINAIS
                    if (G_R.nao_terminais.get(x).contains(argumento) && !argumento.contains("@")) { //VERIFICA SE O USUARIO DIGITOU CORRETAMENTE 
                        infinity=0;
                        derivador(argumento); // SE SIM MANDA PARA O DERIVADOR
                        verificador = true; //DEFINE TRUE SINALIZANDO QUE NAO HOUVE UMA EXCECAO
                    }
                }
                if (verificador == false) { //SE NAO INVALIDA A OPERACAO
                    validacao.put("erroRaiz", "\nSimbolo " + argumento + " invalido!\n"); //INTERACAO COM O USUARIO
                }
            }
        }

        return validacaoStatus();
        
    }
    
    public String execute() {
        String retorno = "";
        
        //EXIBIÇÃO
        retorno += ("Regras:"); //INTERACAO COM O USUARIO
        for (int x = 0; x < G_R.conj_regras.size(); x++) { //PERCORRE TODOS CONJUNTOS DE REGRAS
            int z = G_R.conj_regras.get(x).derivacoes.size(); //DEFINE Z O TAMANHO DESTA LISTA DE REGRAS
            for (int y = 0; y < z; y++) { //PERCORRE TODAS REGRAS DESTE CONJUNTO E REALIZA A EXIBICAO SENDO CADA LINHA REGRAS DE UMA NAO-TERMINAL
                retorno += (G_R.nao_terminais.get(x) + " -> "); //EXIBE QUAL NAO-TERMINAL PERTENCE A REGRA
                retorno += (G_R.conj_regras.get(x).derivacoes.get(y) + " "); //INTERACAO COM O USUARIO
            }
            retorno += ("\n");
        }
        retorno += ("Alfabeto:"); //INTERACAO COM O USUARIO
        for (int x = 0; x < cont_alfa.length; x++) { //PERCORRE TODO ALFABETO
            retorno += (cont_alfa[x] + " - "); //INTERACAO COM O USUARIO
        }
        retorno += ("\n");
        
        String result = "";
        
        result += gerador.GerarPalavras();
        gerador.Ordenador2();
        result += gerador.Mostra_Todas();
        // retorno += gerador.Ordenador();
        result += gerador.GerarPalavras();
        
        G_R.setQtdPalavras(qtdPalavras);
        G_R.setRaizes(raizes);
        G_R.setResultado(result);
        
        return retorno += result;
    }
          
    public static void derivador(String parametro) { //ONDE AS PALAVRAS SAO DERIVADAS
        String resultado = new String(); //VARIAVEL FINAL QUE SERA MOSTRADA PARA O USUARIO
        boolean aux = false; //VARIAVEL TODA VEZ QUE ENTRA NESSA FUNCAO É DEFINIDA EM FALSE
        Random choice = new Random(); //VARIAVEL USADA PARA SORTEAR O CAMINHO QUE SERA SEGUIDO
        char origem[] = parametro.toCharArray(); //ORIGEM RECEBE O PARAMETRO EM FORMATO DE ARRAY
        char finale[]; //VARIAVEL USADA PARA TRATAR SIMBOLO VAZI0
           
        
        for (int x = 0; x < G_R.nao_terminais.size(); x++) { //PERCORRE TODAS NAO-TERMINAIS
            for (int y = 0; y < origem.length; y++) { //PERCORRE TODO TERMO DIGITADO PELO USUARIO

                StringBuilder aux1 = new StringBuilder(); //DEFINIDO O STRINGBUILDER
                aux1.append(origem[y]); //ADICIONADO O CARACTER DA PALAVRA DIGITADA PELO USUARIO
                String aux2 = aux1.toString(); //ENTAO TRANSFORMADO EM STRING

                if (G_R.nao_terminais.get(x).equals(aux2)) { //E COMPARADO SE IGUAL A ALGUMA NAO TERMINAL
                    infinity++;
                    aux = true; //AUX DEFINIDA EM TRUE SIMBOLIZANDO QUE UM TERMO A SER DERIVADO FOI ENCONTRADO E A FUNCAO DEVE SER CHAMADA NOVAMENTE PARA VERIFICACAO
                    for (int z = 0; z < origem.length; z++) { //FAZ O MESMO QUE A SEGUNDA FOR, PERCORRE TODO TERMO DIGITADO PELO USUARIO
                        if (y != z && origem[z] != '&') { //COMPARA SE O CARACTER E DIFERENTE DO QUE FOI ACHADO E É IGUAL A UMA NAO-TERMINAL
                            StringBuilder argamassa = new StringBuilder(); //DEFINE STRINGBUILDER
                            argamassa.append(origem[z]); //ADICIONA O CARACTER
                            resultado = resultado + argamassa.toString(); //CONCATENA COM O RESULTADO ESSE CARACTER QUALQUER
                        }
                        if (y == z) { //SE ORIGEM ESTA NO CARACTER DE MESMA POSICAO DE Z E Y ENTAO ESTE CARACTER E UMA NAO TERMINAL E DEVE SER APLICADA UMA REGRA DE DERIVACAO
                            resultado = resultado + G_R.conj_regras.get(x).derivacoes.get(choice.nextInt(G_R.conj_regras.get(x).derivacoes.size())); // É ESCOLHIDA ALEATORIAMENTE UMA REGRA PERTENCENTE A ESTA NAO-TERMINAL E ENTAO CONCATENADA EM RESULTADO
                        }
                    }
                }

            }
        }

        finale = resultado.toCharArray(); //RESULTADO E TRANFORMADA EM VETOR
        resultado = ""; //RESULTADO É LIMPA
        for (int z = 0; z < finale.length; z++) { //PERCORRE TODOS CARACTERES
            if (finale[z] != '&' && finale.length<200) { //VERIFICA, SE NAO FOR UM SIMBOLO DE VAZIO CONCATENA RESULTADO
                StringBuilder argamassa = new StringBuilder();
                argamassa.append(finale[z]);
                resultado = resultado + argamassa.toString(); //A PALAVRA É REESCRITA SEM O SIMBOLO DE VAZIO
            } else if (finale.length == 200) //CASO A PALAVRA TOTAL TENHA ALCANCADO 200 CARACTERES 
             {
              aux=false; //PARA DE DERIVAR
              gerador.setPalavra(resultado);
             }
        }
        if(infinity == 100) //VERIFICA SE FORAM FEITAS 100 DERIVACOES
        {
         aux=false; //PARA DE DERIVAR CASO SIM
         gerador.setPalavra(resultado);
        }

        if (aux == true) { //CASO TRUE A RECURSIVA É ATIVADA
            gerador.setPalavra(resultado);
            System.out.println("-> " + resultado); //INTERACAO COM O USUARIO
            derivador(resultado); //DERIVADOR E CHAMADO
        }
    }   
    
    public static String rand_root(){
        Random gato = new Random();
        return G_R.nao_terminais.get(gato.nextInt(G_R.nao_terminais.size()));
    }
    
    public Tooltip getTipo() {
        return tipo;
    }
    
    public boolean validacaoStatus() {
        for (String erro : validacao.keySet()) {
            if (erro.equals("erroNaoTerminal") 
                    || erro.equals("erroTerminal") 
                        || erro.equals("erroRegra")
                            || erro.equals("erroRaiz")) {
                return false;
            }
        }
        return true;
    }

    public static GR getG_R() {
        return G_R;
    }

    @Override
    public String toString() {
        return ("Tipo: " + tipo.toString() +
                "\nqtdPalavras:" + qtdPalavras + 
                "\nnao_terminais:" + nao_terminais + 
                "\nterminais:" + terminais + 
                "\nregras:" + regras + 
                "\nraizes:" + raizes +
                "\nresultado:" + resultado);
    }
    
} 

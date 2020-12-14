package main.modulos.AutomatoFinitoDeterministico.domain;

import main.modulos.AutomatoFinitoPilha.domain.Alfabeto;

import java.util.*;

/** Autômato Finito Determinístico
 **/
public class AFD {
    public ArrayList<String> estados;
    public char[] alfabeto;
    public String estadoInicial;
    public ArrayList<String> estadosFinais;
    public String[][] transicoes;
    public String novoEstadoInicial ; 
    /** Lista de configurações do autômato
     **/

    /** Construtor do autômato
     * @param estados Conjunto de estados separados por vírgula
     * @param alfabeto Alfabeto de símbolos da pilha
     * @param estadoInicial Estado inicial
     * @param estadosFinais Conjunto de estados finais separados por vírgula
     * @param transicoes Conjunto de relações de transições:
     *  {"s", "a", "B"}
     *      s - Estado atual
     *      a - Símbolo de entrada
     *      B - Próximo estado
     **/
    public AFD(String estados, String alfabeto, String estadoInicial, String estadosFinais, String[][] transicoes) {
        this.estados = new ArrayList<>(Arrays.asList(estados.trim().split("\\s*,\\s*")));
        this.alfabeto = alfabeto.toCharArray();
        this.estadoInicial = estadoInicial;
        this.estadosFinais = new ArrayList<>(Arrays.asList(estadosFinais.trim().split("\\s*,\\s*")));;
        this.transicoes = transicoes;
    }

    /** Construtor do autômato com objetos
     * @param estados Conjunto de estados separados
     * @param alfabeto Alfabeto de símbolos da pilha
     * @param estadoInicial Estado inicial
     * @param estadosFinais Conjunto de estados finais
     * @param transicoes Conjunto de relações de transições:
     *  {"s", "a", "B"}
     *      s - Estado atual
     *      a - Símbolo de entrada
     *      B - Próximo estado
     **/
    public AFD(ArrayList<String> estados, char[] alfabeto, String estadoInicial, ArrayList<String> estadosFinais, String[][] transicoes){
        this.estados = estados;
        this.alfabeto = alfabeto;
        this.estadoInicial = estadoInicial;
        this.estadosFinais = estadosFinais;
        this.transicoes = transicoes;
    }

    /** Verifica se a palavra pertence ou não ao conjunto de palavras reconhecidas pelo autômato
     * @param palavra Fita dos símbolos de entrada
     * @param configuracoes Objeto onde serão salvas as configurações da computação realizada
     * @return true ou false para palavra reconhecida ou não
     **/
     public boolean Reconhecer(String palavra, Configuracoes configuracoes) {
        String palavraAux = palavra;
        String estadoAtual = this.estadoInicial;
        configuracoes.add(estadoAtual, palavraAux);

            // Percorre todas as transições
            for (int i = 0; i < this.transicoes.length; ++i) {
                // Verifica se a transição corresponde ao estado atual e símbolo lido
                if (this.transicoes[i][0].equals(estadoAtual)) {
                    if (this.transicoes[i][1].equals(palavraAux.substring(0, 1))) {

                        // Subtrai a palavra
                        palavraAux = palavraAux.substring(1);
                        // Troca o estado atual para o estado da transição
                        estadoAtual = this.transicoes[i][2];

                        // Se não há mais entradas, salva a configuração com a palavra vazia
                        if (palavraAux.length() == 0) {
                            configuracoes.add(estadoAtual, "ε");
                            break;
                        }

                        // Salva o estado atual
                        configuracoes.add(estadoAtual, palavraAux);
                        // Reinicia o loop
                        i = -1;
                    }
                }
            }
            // Verifica se o último estado alcançado pertence aos estados finais e retorna
            if (this.estadosFinais.contains(estadoAtual)) {
                return true;
            } else {
               return false;
            }
    }

    /** Minimiza o Autômato Finito Determinístico
     * @return Versão minimizada do Autômato
     **/
    public AFD minimizar() {
        // Lista dos novos estados
        ArrayList<String> novoEstados = new ArrayList<String>();

        // Adiciona o estado inícial
        novoEstados.add(this.estadoInicial);

        // Adiciona todos os estados atingíveis
        estadosAtingiveis(this.estadoInicial, novoEstados);

        // Cria tabela relacionando os estados
        Map<List<String>, Integer> tabelaRelacoes = new HashMap<List<String>, Integer>();
        for(int i = 0; i < novoEstados.size(); i++) {
            for(int j = i+1; j < novoEstados.size(); j++) {
                List<String> parEstados = Arrays.asList(novoEstados.get(i), novoEstados.get(j));

                // Marca com 1 os pares de estados trivialmente não equivalentes (um é final e outro não)
                if( estadosFinais.contains(novoEstados.get(i)) != estadosFinais.contains(novoEstados.get(j))) {
                    tabelaRelacoes.put(parEstados, 1);
                } else {
                    tabelaRelacoes.put(parEstados, 0);
                }

            }
        }

        // Cria lista para posterior analise de estados
        Map<List<String>, ArrayList<List<String>>> listaAnalise = new HashMap<List<String>, ArrayList<List<String>>>();
        // Marca dos estados não equivalentes
        for (Map.Entry<List<String>, Integer> entry : tabelaRelacoes.entrySet()) {
            List<String> parEstados = entry.getKey();
            int valor = entry.getValue();

            // Analisa somente pares de estados não marcados
            if (valor == 1) {
                continue;
            }

            // Percorre o alfabeto
            for (char simb : this.alfabeto) {
                // Pega os próximos estados para os estados analisados e o símbolo do alfabeto
                String proxEst1 = proximoEstado(parEstados.get(0), simb);
                String proxEst2 = proximoEstado(parEstados.get(1), simb);

                // Se os estados levam a estados diferentes, salva na lista para posterior análise
                if (proxEst1 != proxEst2) {
                    List<String> proxEstados = Arrays.asList(proxEst1, proxEst2);

                    // Inverte os estados do par caso necessário
                    if(tabelaRelacoes.get(proxEstados) == null) {
                        proxEstados = Arrays.asList(proxEst2, proxEst1);
                    }


                    int proxValor = tabelaRelacoes.get(proxEstados);
                    // Verifica se o par equivalente dos próximos estados está marcado com 1 na tabela de análise
                    if (proxValor == 1) {
                        // O par de estados atuais e todos da lista devem ser marcado também
                        tabelaRelacoes.put(parEstados, 1);
                        marcarListaPares(tabelaRelacoes, listaAnalise, parEstados);
                    } else {
                        // O par de estados atuais é adicionado a lista encabeçada pelo par de próximos estados
                        ArrayList<List<String>> lista;
                        if (!listaAnalise.containsKey(proxEstados)) {
                            listaAnalise.put(proxEstados, new ArrayList<List<String>>());
                        }
                        lista = listaAnalise.get(proxEstados);
                        lista.add(parEstados);
                    }
                }

            }
        }


         ArrayList<String> novoEstadosFinais = new ArrayList<String>();

        // Adiciona os estados finais atingíveis a lista de novos estados finais
        for(String estado : novoEstados){
            if(this.estadosFinais.contains(estado)) {
                novoEstadosFinais.add(estado);
            }
        }

        ArrayList<String[]> auxNovoTransicoes = new ArrayList<String[]>();

        // Adiciona as transições dos estados atingíveis a lista auxiliar de novas transições
        for(String estado : novoEstados) {
            for(String[] transicao : this.transicoes) {
                if(transicao[0].equals(estado)){
                    auxNovoTransicoes.add(transicao.clone());
                }
            }
        }

        // Unifica os estados equivalentes
        for (Map.Entry<List<String>, Integer> entry : tabelaRelacoes.entrySet()) {
            List<String> parEstados = entry.getKey();
            int valor = entry.getValue();

            // Somente analise estados não marcados
            if (valor == 1) {
                continue;
            }

            // Remove estados antigos e adiciona o unificado
            String nomeNovoEstado = parEstados.get(0) + parEstados.get(1);
            novoEstados.remove(parEstados.get(0));
            novoEstados.remove(parEstados.get(1));
            novoEstados.add(nomeNovoEstado);
            Collections.sort(novoEstados);

            // Se um dos estados unificados é inicial, o novo estado é ínicial
            if (parEstados.contains(this.estadoInicial)) {
                novoEstadoInicial = nomeNovoEstado;
            }

            // Se ambos estados são finais, o novo estado é final
            if (novoEstadosFinais.contains(parEstados.get(0)) && novoEstadosFinais.contains(parEstados.get(1))) {
                novoEstadosFinais.add(nomeNovoEstado);
            }
            // Remove os estados finais antigos da lista
            novoEstadosFinais.remove(parEstados.get(0));
            novoEstadosFinais.remove(parEstados.get(1));

            // Percorre as transições substituindo os estados alterados pelo novo
            for (int i = 0; i < auxNovoTransicoes.size(); i++) {

                String[] transicao = auxNovoTransicoes.get(i);

                if (parEstados.get(0).equals(transicao[0])) {
                    transicao[0] = nomeNovoEstado;
                }
                if (parEstados.get(1).equals(transicao[0])) {
                    auxNovoTransicoes.remove(i);
                    i--;
                }
                if (parEstados.get(0).equals(transicao[2])) {
                    transicao[2] = nomeNovoEstado;
                }
                if (parEstados.get(1).equals(transicao[2])) {
                    transicao[2] = nomeNovoEstado;
                }
            }
        }

        // Cria a matriz de transições a partir da lista auxiliar de transições
        String[][] novoTransicoes = new String[auxNovoTransicoes.size()][3];
        for (int i = 0; i < auxNovoTransicoes.size(); i++) {
            novoTransicoes[i] = auxNovoTransicoes.get(i);
        }

        // Retorna o novo Autômato minimizado
        return new AFD(novoEstados, this.alfabeto, novoEstadoInicial, novoEstadosFinais, novoTransicoes);
        }

    /** Retorna o próximo estado de uma transição
     * @param estadoAtual Estado atual da transição
     * @param entrada Símbolo lido
     * @return Próximo estado
     **/
    private String proximoEstado(String estadoAtual, char entrada){
        String proxEstado = "";
        for(String[] transicao : this.transicoes) {
            if(transicao[0] == estadoAtual && transicao[1].charAt(0) == entrada) {
                proxEstado = transicao[2];
            }
        }

        return proxEstado;
    }

    /** Marca todos os pares de estados de uma lista de análise
     * @param tabelaRelacoes Tabela de relações onde serão marcados os pares
     * @param listaAnalise Lista de análise de onde serão recebidos os pares a serem marcados
     * @param listaAnalise Par de estados que encabeça a lista
     **/
    private void marcarListaPares(Map<List<String>, Integer> tabelaRelacoes, Map<List<String>, ArrayList<List<String>>> listaAnalise, List<String> parEstados) {
        ArrayList<List<String>> lista = listaAnalise.get(parEstados);
        if(lista == null) {
            return;
        }
        for(List<String> proxEstados : lista) {
            tabelaRelacoes.put(proxEstados, 1);
            marcarListaPares(tabelaRelacoes, listaAnalise, proxEstados);
        }
    }

    /** Verifica os estados atingíveis a partir do estado dado
     * @param estado Estado ínicial da verificação
     * @param estados lista onde serão salvos os estados atingíveis
     **/
    private void estadosAtingiveis(String estado, ArrayList<String> estados) {
        for (int i = 0; i < this.transicoes.length; i++) {
            if (estado.equals(this.transicoes[i][0]) && !estados.contains(this.transicoes[i][2])) {
                estados.add(this.transicoes[i][2]);
                Collections.sort(estados);
                estadosAtingiveis(this.transicoes[i][2], estados);
            }
        }
    }

    public String getAlfabetoToString() {
        String alfabetoString= "";
        for (int i = 0; i < this.alfabeto.length ; i++) {
            alfabetoString = alfabetoString + this.alfabeto[i] + ",";
        }
        return alfabetoString;
    }

    public String getEstadosFinaisToString() {
        String estadosFinaisString = "";
        for (int i = 0; i < this.estadosFinais.size() ; i++) {
            estadosFinaisString = estadosFinaisString + this.estadosFinais.get(i) + ',';
        }
        return estadosFinaisString;
    }

    public String getEstadoInicial() {
        return estadoInicial;
    }

    public String getEstadosToString() {
        String estadosString = "";
        for (int i = 0; i < this.estados.size() ; i++) {
            estadosString = estadosString + this.estados.get(i) + ',';
        }
        return estadosString;
    }
}

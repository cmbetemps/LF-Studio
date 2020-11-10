package main.grupo03.model;

import java.util.ArrayList;

// Revisado por Thiago,Charles,Pedro, Kelvin e Ritiele - 27/09 | 20:00 - 20:45
// Parcialmente comentado por Pedro - 04/10 - 15:30 - 19:20
public class GLC extends AppModel {
    private final Tooltip tipo = Tooltip.GLC;

    private ArrayList<Character> variaveis;   // "Variáveis" contêm terminais e variáveis | todas as variáveis e terminais que o usuário digitou
    private ArrayList<Character> terminais;   // "Terminais" contêm todos os simbolos terminais descritos pelo usuário | Todos os simbolos terminais digitados pelo usuário
    private ArrayList<String> regras;         // "Regras" Contêm uma lista de todas as regras do usuário, dividindo elas por posição da lista
    private Character raiz;                   // "Raiz" é equivalente ao "Símbolo terminal", também enviado pelo usuário, o simbolo terminal é a "raiz" da gramática, podendo destrinchar em todos os terminais
    private String[][] regrasMatriz;          // Local que será utilizado para salvar as regras, basicamente uma formatação das regras recebidas pela lista de string em um formato utilizável
    private ArrayList<String> resultado;      // Resultado esperado após execução
    private transient boolean statusOK = false;         // Se resultado obtido

	/*
	O construtor da Classe, é onde será recebida a gramática que o usuário inseriu e feito suas atribuições.
	Também é o ponto de partida onde será verificado se a expressão foi inserida adequadamente e se ela faz sentido.
	Se não fizer sentido, o usuário será notificado qual foi o problema econtrado na expressão. Caso contrário, o fluxo do programa terá continuidade.
	*/
	
    public GLC(ArrayList<Character> variaveis, ArrayList<Character> terminais, ArrayList<String> regras, char raiz) throws Exception {
        this.variaveis = variaveis;             // seta variaveis
        this.terminais = terminais;             // seta terminais
        this.regras = regras;                   // seta regras
        this.raiz = raiz;                       // seta raiz
        boolean check = true;                   // variável auxiliar de teste
        for (Character temp : terminais) {      // Vai checar se os terminais estão contidos nas variáveis
            if (!variaveis.contains(temp)) {
                check = false;
            }
        }
        for (int x = variaveis.size() - 1; x > 0; x--) { // Remove todos os terminais repetidos de variaveis
            if (terminais.contains(variaveis.get(x))) {
                variaveis.remove(x);
            }
        }
        if (!check) {   // Caso, 'check' seja falso, terminais não estavam contidos nas variáveis.
            throw new Exception ("Os terminais não estão nas variáveis");   // Terminais contiverem o simbolo inicial ou as regras colocadas não façam sentido para os terminais e variáveis fornecidas, então a entrada é recusada
        }

        if (!variaveis.contains(raiz)) {  
            throw new Exception("Raiz não está presente entre as variáveis");
        }

        if (terminais.contains(raiz)) {   
            throw new Exception("Raiz usada é um dos terminais");
        }

        if (!padraoRegras()) {   
            throw new Exception("Regras estão mal formatadas");
        }

        if (!raizCheck()) { 
            throw new Exception("Raiz não consegue chegar a todos as variáveis");
        }
        
        statusOK = true;

        System.out.println("Checagem completa");

    }

    //Feito por Thiago e Kelvin - 24/09 | 02:00 - 04:00
    //{S -> AA, S -> BA, A -> ABA|BA|SA}
	/*
	Função onde chama a checagem das regras, para ver se elas fazem sentido.
	Caso façam, é chamada outra função para que as regras sejam transferidas para uma matriz.
	Se alguma das funções verificar que há algum problema, padraoRegras() retorna false ao construtor.
	*/
    private boolean padraoRegras() {       // Padrão esperado para as regras inseridas
        boolean test = true;
        ArrayList<String> lista = new ArrayList<String>();
        if (!checkRegrasSimb()) { // Chama a função checkRegrasSimb(), caso ela retorne false, foi achado algum erro com as regras digitadas
            return false;
        }
        while (test) {
            test = false;
            for (String regra : regras) { // Percorre a lista de regras, formantando as regras inseridas pelo usuário. Caso as regras estejam no formato "E -> A|O", a função a seguir formata elas em "E -> A" "E -> O"
                if (regra.contains("|")) {
                    lista.add(regra.trim().substring(0, regra.indexOf("|")));
                    regras.set(regras.indexOf(regra), regra.replace(regra.trim().substring(5, regra.indexOf("|") + 1), ""));
                    test = true;
                }
            }
        }
        lista.addAll(regras);
        lista.sort(String.CASE_INSENSITIVE_ORDER);
        regrasMatriz = new String[lista.size()][2];
        regras = lista;
        matrizAdd();
        return true;
    }

    // Refatorado por Kelvin 24/09 | 06:00 - 06:20
    // Lógica por Thiago
	//Checa se as regras digitadas fazem sentido para os terminais/simbolos inseridos, também há uma pequena formatação das regras
    private boolean checkRegrasSimb() {
        for (String regra : regras) {
            regra = regra.replaceAll(" ", "").replaceAll("->", "").replaceAll("\\|", "");
            for (int x = 0; x < regra.length(); x++) {                
                if (!(variaveis.contains(regra.charAt(x)) || terminais.contains(regra.charAt(x)))) {
                    return false;
                }
            }
        }
        return true;
    }

    // Refatorado por Kelvin 24/09 | 06:00 - 06:20
    // Lógica por Thiago
	// Função chamada em PadraoRegras(), para transformar a lista de regras, já formatada, em uma matriz.
	//Só adiciona à regrasMatriz regras que não façam referência a si mesma, como por exemplo C->C
    private void matrizAdd() { 
        int contaRegras = 0;
        for (String regra : regras) {
            if (regra.trim().substring(0, 1) != regra.trim().substring(5)) {
                regrasMatriz[contaRegras][0] = regra.trim().substring(0, 1);
                regrasMatriz[contaRegras][1] = regra.trim().substring(5).replaceAll(" ", "");
                contaRegras++;
            }
        }
    }

    // Feito por Thiago e Kelvin 26/09 | 21:30 - 22:40
    // Função que checa se o simbolo inicial digitado está correto para as regras inseridas
    private boolean raizCheck() {
        ArrayList<Integer> confirma = new ArrayList<Integer>();
        int x = 0, y = 0;
        for (Character nope : variaveis) { //Percorre variaveis verificando se alguma é igual a raiz. Caso seja, adiciona 1 à confirma, se não adiciona 0.
            if (nope.equals(raiz)) {
                confirma.add(1);
            } else {
                confirma.add(0);
            }
        }
        while (x < regrasMatriz.length) { //Percorre a matriz de regras verificando se a regra faz sentido, caso faça troca o 0 da lista para 1.
            y = 0;
            while (y < regrasMatriz.length) {
                if (confirma.get(variaveis.indexOf((regrasMatriz[y][0].charAt(0)))) == 1) {
                    for (String cada : regrasMatriz[y][1].split("")) {
                        if (variaveis.contains(cada.charAt(0))) {
                            confirma.set(variaveis.indexOf(cada.charAt(0)), 1);
                        }
                    }
                }
                y++;
            }
            x++;
        }
        if (confirma.contains(0)) { //Caso houver alguma regra que não faça sentido, o array confirma terá 0 em uma de suas posições. Logo, a raiz não é um símbolo inicial. Se não for um símbolo inicial, é retornado false ao construtor.
            return false;
        } else {
            return true;
        }
    }

	// Função que mostra o processo de derivação até a expressão/string digitada pelo usuário.
    public ArrayList derivar(String entrada) {
        ArrayList<Integer> variacoes = new ArrayList<Integer>();
        ArrayList<String> retorno = new ArrayList<String>();
        retorno.add(entrada);
        String entradaLocal = entrada;
        boolean skip = false;
        StringBuilder builder = new StringBuilder(entradaLocal);
        int nivel = 0, inicio = 0, fim = inicio + 1, regra = 0, novaRegra = 0;
        for (String x : entrada.split("")) {
            if (!terminais.contains(x.charAt(0))) {    // Checa se a string digitada pelo usuário faz parte das terminais, caso negativo, retorna
                return null;
            }
        }
        while (nivel >= 0) {  //Testando todas as variações possíveis pra derivar, até encontrar o caminho que resulte ao símbolo inicial, variável "Raiz" descrita, caso saia do While, então não existe derivação possível 
            for (; inicio < entradaLocal.length(); inicio++) {
                for (; fim <= entradaLocal.length(); fim++) {
                    if (skip) {
                        skip = false;
                    } else {
                        regra = buscaRegra(entradaLocal.substring(inicio, fim), novaRegra);
                        if (regra != -1) {                      // Esse if entra caso achar uma regra que possa aplicar
                            variacoes.add(inicio);
                            variacoes.add(fim);
                            variacoes.add(regra);
                            nivel++;
                            builder.replace(inicio, fim, regrasMatriz[regra][0]);
                            entradaLocal = builder.toString();
                            retorno.add(entradaLocal);
                            inicio = 0;
                            fim = 0;
                           
                        }
                    }
                }
                fim = inicio + 1;
            }
            if (entradaLocal.equals(raiz.toString())) {           // Encontrou uma derivação completa e faz o retorno do caminho encontrado para ela
                // for (String linha : retorno) {
                    // System.out.println(linha);
                // }
                resultado = retorno;
                return retorno;
            }
            if (retorno.size() > 1) {                            // Caso encontre um "beco sem saída" retorna para o nível anterior e tenta outra variação
                nivel--;
                retorno.remove(retorno.size() - 1);
                entradaLocal = retorno.get(retorno.size() - 1);
                fim = variacoes.remove(variacoes.size() - 2);
                inicio = variacoes.remove(variacoes.size() - 2);
                if (buscaRegra(entradaLocal.substring(inicio,fim), variacoes.get(variacoes.size() - 1) + 1) == -1) {   // Checa se a mesma "Sílaba" tem outra regra aplicável para ela, ex: "E -> a", "I -> a", ou seja 'a' possuí duas regras do qual pode derivar
                    skip = true;
                    novaRegra = 0;
                } else { //Tem mais conjuntos cuja regra pode ser convertida, essa parte do código é que vai testar os outros caminhos dessa silaba
                    novaRegra = variacoes.get(variacoes.size() - 1) + 1;
                }
                variacoes.remove(variacoes.size() - 1);
                builder = new StringBuilder(entradaLocal);
            } else {
                nivel--;
            }

        }
        resultado.add("Não existe derivação correta para a palavra");

        return null;
    }

    // Recebe a "sílaba" checada, e o "inicioBusca" estabelece a primeira regra a ser checada, utilizando o exemplo anterior, caso E - > a = inicioBusca0, o próximo valor para 'a', deve ser I -> a = inicioBusca6, considerando que as regras estão em uma matriz
    private int buscaRegra(String parte, int inicioBusca) {  
        for (int x = inicioBusca; x < this.regrasMatriz.length; x++) {
            if (parte.equals(regrasMatriz[x][1])) {
                return x;
            }
        }
        return -1;
    }

    // Kelvin Clovis (Setters e Getters) - 03/10  | 14:50-15:00 
    public ArrayList<Character> getVariaveis() {
        return variaveis;
    }

    public void setVariaveis(ArrayList<Character> variaveis) {
        this.variaveis = variaveis;
    }

    public ArrayList<Character> getTerminais() {
        return terminais;
    }

    public void setTerminais(ArrayList<Character> terminais) {
        this.terminais = terminais;
    }

    public ArrayList<String> getRegras() {
        return regras;
    }

    public void setRegras(ArrayList<String> regras) {
        this.regras = regras;
    }

    public Character getRaiz() {
        return raiz;
    }

    public void setRaiz(Character raiz) {
        this.raiz = raiz;
    }

    public String[][] getRegrasMatriz() {
        return regrasMatriz;
    }

    public void setRegrasMatriz(String[][] regrasMatriz) {
        this.regrasMatriz = regrasMatriz;
    }

    public Tooltip getTipo() {
        return tipo;
    }
    
    public ArrayList<String> getResultado() {
        return resultado;
    }

    public boolean isStatusOK() {
        return statusOK;
    }

    @Override
    public String toString() {
        return ("Tipo: " + tipo.toString() +
                "\nTerminais: " + getTerminais() + 
                "\nVariáveis: " + getVariaveis() + 
                "\nSímbolo inicial: " + getRaiz() + 
                "\nRegras: " + getRegras() +
                "\nResultado: " + getResultado());
    }

}
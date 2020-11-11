package main.modulos.AutomatoFinitoPilha.domain.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Arvore implements Iterable<Arvore> {
    Configuração configuração;
    Arvore pai;
    List<Arvore> filho;

    private List<Arvore> elementsIndex;

    /** Construtor para alocar o objeto Arvore
     **/
    public Arvore(){};

    /** Construtor da Arvore
     * @param configuração configuração atual a ser salva na árvore
     **/
    public Arvore(Configuração configuração){
        iniciarArvore(configuração);
    };

    /** Inicializa a árvore
     * @param configuraçãoInicial configuração da raiz da árvore
     **/
    public void iniciarArvore(Configuração configuraçãoInicial){
        this.configuração = configuraçãoInicial;
        this.filho = new LinkedList<Arvore>();
        this.elementsIndex = new LinkedList<Arvore>();
        this.elementsIndex.add(this);
    }

    /** Insere um novo nó
     * @param nóFilho configuração do novo nó
     * @return o novo nó
     **/
    public Arvore novoFilho(Configuração nóFilho) {
        Arvore filho = new Arvore(nóFilho);
        filho.pai = this;
        this.filho.add(filho);
        this.registrarBusca(filho);
        return filho;
    }

    /** Verifica se o nó é raiz
     * @return true ou false
     **/
    public boolean isRoot() {
        return pai == null;
    }

    /** Verifica se o nó é folha (extremidade do nível)
     * @return true ou false
     **/
    public boolean isLeaf() {
        return filho.size() == 0;
    }

    /** Retorna o nível do nó
     * @return nível do nó
     **/
    public int getLevel() {
        if (this.isRoot())
            return 0;
        else
            return pai.getLevel() + 1;
    }

    /** Registra nó para busca
     * @param nó nó a ser registrado
     **/
    private void registrarBusca(Arvore nó) {
        elementsIndex.add(nó);
        if (pai != null)
            pai.registrarBusca(nó);
    }

    /** Tenta encontrar um estado final válido entre as configurações da árvore
     * @return um estado final ou null
     **/
    public Arvore encontrarEstadoValido() {
        for (Arvore element : this.elementsIndex) {
            if (element.configuração.reconhecido)
                return element;
        }

        return null;
    }

    /** Encontra a raiz da árvore
     * @return nó raiz da árvore
     **/
    public Arvore encontrarRaiz() {
        for (Arvore element : this.elementsIndex) {
            if (element.isRoot())
                return element;
        }

        return null;
    }

    @Override
    public Iterator<Arvore> iterator() {
        Iterador iterador = new Iterador(this);
        return iterador;
    }

}
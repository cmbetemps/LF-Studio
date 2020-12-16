package main.modulos.AutomatoFinitoPilha.domain;

public class Configuracao {
    String[] transição;
    Estado estado;
    Fita fita;
    Pilha pilha;
    boolean reconhecido;

    /** Construtor da configuração
     * @param transição função de transição que levou a essa configuração
     * @param estado estado atual
     * @param fita fita atual
     * @param pilha pilha atual
     **/
    public Configuracao(String[] transição, Estado estado, Fita fita, Pilha pilha) {
        this.transição = transição;
        this.estado = new Estado(estado);
        this.fita = new Fita(fita);
        this.pilha = new Pilha(pilha);
        this.reconhecido = false;
    }

    /** Construtor de cópia
     * @param configuracao objeto a ser copiado
     * @return a cópia do objeto
     **/
    public Configuracao(Configuracao configuracao) {
        this.estado = new Estado(configuracao.estado);
        this.fita = new Fita(configuracao.fita);
        this.pilha = new Pilha(configuracao.pilha);
        this.reconhecido = configuracao.reconhecido;
    }

    @Override
    public String toString() {
        return estado.toString() + "\n" + fita.toString() + "\n" + pilha.toString();
    }
}
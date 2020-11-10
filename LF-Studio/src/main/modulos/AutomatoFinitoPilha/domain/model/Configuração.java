package main.modulos.AutomatoFinitoPilha.domain.model;

public class Configuração {
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
    public Configuração(String[] transição, Estado estado, Fita fita, Pilha pilha) {
        this.transição = transição;
        this.estado = new Estado(estado);
        this.fita = new Fita(fita);
        this.pilha = new Pilha(pilha);
        this.reconhecido = false;
    }

    /** Construtor de cópia
     * @param configuração objeto a ser copiado
     * @return a cópia do objeto
     **/
    public Configuração(Configuração configuração) {
        this.estado = new Estado(configuração.estado);
        this.fita = new Fita(configuração.fita);
        this.pilha = new Pilha(configuração.pilha);
        this.reconhecido = configuração.reconhecido;
    }

    @Override
    public String toString() {
        return estado.toString() + "\n" + fita.toString() + "\n" + pilha.toString();
    }
}
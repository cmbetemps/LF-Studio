package domain;

import java.util.Arrays;

public class Automato {
  protected boolean debug = false;
  protected int[] aceitacao;
  protected int estadoInicial;
  protected int[][][] transicao;
  protected String alfabeto;
  protected String fitaDeEntrada;

  protected Automato(int[] aceitacao, int estadoInicial, int[][][] transicao, String alfabeto) {
    this.aceitacao = aceitacao;
    this.transicao = transicao;
    this.alfabeto = alfabeto;
    this.estadoInicial = estadoInicial;
  }

  public Automato(){}

  public void setDebug(boolean debug) {
    this.debug = debug;
  }
  public boolean isDebug() {
    return debug;
  }

  public int[] getAceitacao() {
    return aceitacao;
  }

  public void setAceitacao(int[] aceitacao) {
    this.aceitacao = aceitacao;
  }

  public int getEstadoInicial() {
    return estadoInicial;
  }

  public void setEstadoInicial(int estadoInicial) {
    this.estadoInicial = estadoInicial;
  }

  public int[][][] getTransicao() {
    return transicao;
  }

  public void setTransicao(int[][][] transicao) {
    this.transicao = transicao;
  }

  public String getAlfabeto() {
    return alfabeto;
  }

  public void setAlfabeto(String alfabeto) {
    this.alfabeto = alfabeto;
  }

  public String getFitaDeEntrada() {
    return fitaDeEntrada;
  }

  public void setFitaDeEntrada(String fitaDeEntrada) {
    this.fitaDeEntrada = fitaDeEntrada;
  }

  /**Metodo para converter um automato finito nao deterministico para um automato deterministico
   * @param naoDeterministico
   */
  protected void convertToDfa(NaoDeterministico naoDeterministico){
  }

  public Automato createObject(Automato automato) {
    return automato;
  }

  @Override
  public String toString() {
    return "Automato{" +
      "\ndebug=" + debug +
      "\n, aceitacao=" + Arrays.toString(aceitacao) +
      "\n, estadoInicial=" + estadoInicial +
      "\n, transicao=" + Arrays.toString(transicao) +
      "\n, alfabeto='" + alfabeto + '\'' +
      "\n, fitaDeEntrada='" + fitaDeEntrada + '\'' +
      '}';
  }
}

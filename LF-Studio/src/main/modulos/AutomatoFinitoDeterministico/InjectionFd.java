package main.modulos.AutomatoFinitoDeterministico;

import main.modulos.AutomatoFinitoDeterministico.domain.model.AFD;

public class InjectionFd {
  private static AFD automato;

  public static AFD getAutomato() {
    return automato;
  }

  public static void setAutomato(AFD automatoRecebido) {
    automato = automatoRecebido;
  }

}

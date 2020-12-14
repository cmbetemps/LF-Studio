package main.modulos.AutomatoFinitoDeterministico;


import main.modulos.AutomatoFinitoDeterministico.domain.AFD;

import java.util.HashMap;

public class FdInjection {
  private static AFD automato;

  public static AFD getAutomato() {
    return automato;
  }

  public static void setAutomato(AFD automatoRecebido) {
    automato = automatoRecebido;
  }

}

package main.modulos.AutomatoFinitoPilha.domain.model;

import java.util.ArrayList;
import java.util.Arrays;
import main.modulos.AutomatoFinitoPilha.controllers.AFP_Injection;

public class Estado {
    String estadoInicial;
    ArrayList<String> estadosFinais;
    String estadoAtual;

    /**
     * Construtor do Estado
     *
     * @param estadoInicial estado inicial
     * @param estadosFinais String contendo os estados finais separados por vírgula
     **/
    public Estado(String estadoInicial, String estadosFinais) {
        this.estadoInicial = this.estadoAtual = estadoInicial;
        this.estadosFinais = new ArrayList<>(Arrays.asList(estadosFinais.trim().split("\\s*,\\s*")));
    }

    /**
     * Construtor de cópia
     *
     * @param copia Estado a ser copiado
     * @return o objeto copiado
     **/
    public Estado(Estado copia) {
        this.estadoInicial = this.estadoAtual = new String(copia.estadoAtual);
        this.estadosFinais = new ArrayList<>(copia.estadosFinais);
    }

    /**
     * Verifica se o estado atual é igual ao estado da função de transição
     *
     * @param estadoTransição estado da função de transição
     * @return true ou false para sim ou não
     **/
    public boolean comparar(String estadoTransição) {
        return estadoAtual.equals(estadoTransição);
    }

    /**
     * Troca o estado
     *
     * @param novoEstado estado para onde será efetuada a troca
     **/
    public void trocar(String novoEstado) {
        estadoAtual = novoEstado;
    }

    /**
     * Verifica se o estado atual pertence aos estados finais e retorna um booleano
     *
     * @return true ou false para pertence ou não
     **/
    public boolean pertence() {
        for (int x = 0; x < estadosFinais.size(); x++) {
            if (estadoAtual.equals(estadosFinais.get(x))) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica se os estados finais e iniciais pertencem ao conjunto de estados
     * especificado
     *
     * @param estados conjunto de estados
     * @return true ou false para pertencem ou não
     **/
    public boolean validar(String estados) {
        boolean flagValido = true;
        ArrayList<String> auxiliar;

        auxiliar = new ArrayList<>(Arrays.asList(estados.trim().split("\\s*,\\s*")));

        if (!auxiliar.contains(estadoInicial)) {
            //System.out.println("Erro - O estado inicial não pertence ao conjunto de estados.");
            flagValido = false;
        } else {
            System.out.println("Ok - O estado inicial pertence ao conjunto de estados.");
        }

        if (!auxiliar.containsAll(estadosFinais)) {
            //System.out.println("Erro - Algum estado final não pertence ao conjunto de estados.");
            flagValido = false;
        } else {
            //System.out.println("Ok - Todos os estados finais pertencem ao conjunto de estados.");
        }
        AFP_Injection.setConfirm(flagValido);
        return flagValido;
    }

    @Override
    public String toString() {
        return estadoAtual;
    }
}

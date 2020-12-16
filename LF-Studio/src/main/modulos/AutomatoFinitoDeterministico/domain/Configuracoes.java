/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoDeterministico.domain;

import java.util.LinkedList;
import java.util.List;

public class Configuracoes {

        public List<String[]> configuracoes;

        public Configuracoes (){
            this.configuracoes = new LinkedList<String[]>();
        }

        /** Adiciona uma nova configuração a lista
         * @param estado Estado atual
         * @param fita Fita de entrada atual
         **/
        public void add(String estado, String fita) {
            this.configuracoes.add(new String[]{estado, fita});
        }

        /** Imprime as configurações no console
         **/
        public void imprimir(){
            for(int i = 0; i < this.configuracoes.size(); i++) {
                System.out.println("(" + this.configuracoes.get(i)[0] + ", " + this.configuracoes.get(i)[1] + ")");
            }
        }
        
        public String getConfiguracoes(){
             StringBuilder retornar = new StringBuilder();
             for(int i = 0; i < configuracoes.size(); i++) {
                retornar.append("(" + configuracoes.get(i)[0] + ", " + this.configuracoes.get(i)[1] + ")\n");
             }
             return retornar.toString();
        }
    
}

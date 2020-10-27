package estado;


public class Estado {
    String estado;
    String[] estadosfinais;

    
    public Estado(String estadoinicial, String estadosfinaisinicial) {          // recebo duas strings e separo a dos
        this.estado = estadoinicial;                                            // estados finais em um array
        String[] auxiliar = estadosfinaisinicial.split("");                     
        this.estadosfinais = auxiliar.clone();
    }
    
    public boolean comparar(String estadotransicaosimbolo) {                    // retorno "true" se estado é igual
        return estado.equals(estadotransicaosimbolo);                           // ao valor que vem como argumento da
    }                                                                           // matriz transições
    
    public void trocar(String novoestado) {                                     // estado atual vai para estado novo
        estado = novoestado;                                                    // com argumento da matriz transições
    }
    
    public boolean pertence() {                                                 // retorno "true" se estado atual
        for(int x = 0; x < estadosfinais.length; x++) {                         // é igual a um dos estados finais
            if(estado.equals(estadosfinais[x])) {
                return true;
            }
        }
        return false;
    }
    
    @Override                                                                   // função override para receber conteúdo
    public String toString() {                                                  // da string ao invés da localização
        return estado;
    }
}

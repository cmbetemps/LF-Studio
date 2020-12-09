package main.modulos.GramaticasLivreDeContexto.domain.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import main.grupo03.AppModel;

public final class GLC extends AppModel{
    private final Tooltip tipo = Tooltip.GLC;
    
    public int quantidade = 0;
    private String simboloInicial;
    private Alfabeto alfabeto;
    public TreeMap<Integer, String> palavrasGeradas;
    private String[][] _palavras;
    private Regras regras;
    private boolean gramaticaValida = false;

    public GLC() {
    }

    /**
     * @Author Yann Silva
     * Construtor
     * @param simboloInicial
     * @param alfabeto
     * @param regras
     */
    public GLC(String simboloInicial, Alfabeto alfabeto, Regras regras) {
        this.simboloInicial = simboloInicial;
        this.alfabeto = alfabeto;
        this.regras = regras;
        validarEntrada();
    }

   /**
     * @Author Yann Silva
     * Geração das palavras que estão na fila
     * e transportação para a matriz de _palavras
     * já com palavras só terminais
     */
    private void setarPalavras() {
        validarEntrada();
        if(!is_gramaticaValida()) System.exit(1);

        List<String> fila = new ArrayList<>();
        fila.add(simboloInicial);
        
        for(int geradas = 0; geradas < quantidade;) {
            String auxiliar = fila.remove(0);
            String[] arrayAuxiliar = auxiliar.split("");
            int terminais = 0;

            for(int x = 0; x < auxiliar.length(); x++) {
                for(int y = 0; y < alfabeto.terminais.length; y++) {
                    if(arrayAuxiliar[x].contains(alfabeto.terminais[y])) {
                        terminais++;
                    }
                }
            }
            
            if(terminais == auxiliar.length()) {
                _palavras[geradas] = auxiliar.split("");
                geradas++;
            } else {
                preencherFila(alfabeto, regras, auxiliar, fila);
            }
        }
    }

   /**
     * @Author Yann Silva
     * Percorre as regras e relaciona o numero de nao terminais
     * com a quantidade de palavras a serem geradas
     * @param alfabeto
     * @param regras
     * @param auxiliar
     * @param fila
     */
    private void preencherFila(Alfabeto alfabeto, Regras regras, String auxiliar, List<String> fila) {
        boolean gerado;
        for(int x = 0; x < auxiliar.length(); x++) {
            for(int y = 0; y < alfabeto.naoTerminais.length; y++) {
                if(auxiliar.substring(x, x+1).contains(alfabeto.naoTerminais[y])) {
                    gerado = true;
                    for(int z = 0; z < regras.matrizregras.length; z++) {
                        if(auxiliar.substring(x, x+1).contains(regras.matrizregras[z][0])) {
                            String nova = auxiliar.replaceFirst(regras.matrizregras[z][0], regras.matrizregras[z][1]);
                            fila.add(nova);
                        }
                    }
                    if(gerado){
                        return;
                    }
                }
            }
        }
    }


   /**
     * @Author Yann Silva
     * Metodo de gerar palavras, só insere se o numero
     * de palavras a serem geradas for maior que 0
     * @param quantidade
     */
    public boolean gerarPalavras(int quantidade) {
        if(quantidade <= 0){
            System.out.println("A quantidade de palavras deve ser maior que 0");
            return false;
        }
        palavrasGeradas  = new TreeMap<Integer, String>();
        this.quantidade = quantidade;
        this._palavras = new String[quantidade][];

        setarPalavras();
        Arrays.sort(this._palavras, (a, b)->Integer.compare(Arrays.toString(a).length(), Arrays.toString(b).length()));
        for(int x = 0; x < this._palavras.length; x++) {
            System.out.print("Palavra [" + (x + 1) + "]: ");
            String palavra = Arrays.toString(this._palavras[x]).replace(",", "").replace("[", "").replace("]", "").trim();
            palavrasGeradas.put(x +1, palavra);
            System.out.println(palavra);
        }
        return true;
    }

   /**
     * @Author Michel Silva
     * Metodo Overload de gerarPalavras
     * é chamado quando for preciso utilizar o arquivo
     */
    public boolean gerarPalavras( ) {
        return gerarPalavras(this.quantidade);
    }


   /**
     * @Author Michel Silva
     * Validação de erros para um alfabeto valido
     * e para simbolo inicial valido
     */
    public void validarEntrada()   {
        try {
            alfabeto.validar();
            gramaticaValida = true;
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
            gramaticaValida =  false;
        }
        try{
            if(simboloInicial.length() > 1) {
                gramaticaValida = false;
                throw  new Exception("A gramatica deve ter apenas um simbolo inicial");
            }
            gramaticaValida = false;
            for (int i = 0; i <alfabeto.naoTerminais.length ; i++) {
                if(simboloInicial.contains(alfabeto.naoTerminais[i])){
                    gramaticaValida = true;
                }
            }
            if(gramaticaValida== false){
                throw  new Exception("O simbolo inicial deve pertencer ao Alfabeto");
            }
        }catch (Exception e){
            e.getMessage();
            e.printStackTrace();
        }
    }

    public boolean is_gramaticaValida() {
        return gramaticaValida;
    }

    public Tooltip getTipo() {
        return tipo;
    }
    
    public String getPalavrasGeradas() {
        String retorno = "";
        for(Map.Entry<Integer, String> entry : palavrasGeradas.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            retorno += (key + " => " + value + "\n");
        }
        return retorno;
    }
    
    public String exportar(String diretorio) {
        try {
            Gson json = new Gson();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            // String strJson = json.toJson(this, ER.class);
            try (FileWriter writer = new FileWriter(diretorio)) {
                gson.toJson(this, writer);
            } catch (IOException e) {
                return "Erro ao exportar arquivo, falha ao cria-lo!";
            }
            // System.out.println(strJson);
            // System.out.println(toString());
        } catch (Exception e) {
            return "Erro ao exportar arquivo!";
        }
        return "Arquivo exportado com sucesso!";
    }
    
}

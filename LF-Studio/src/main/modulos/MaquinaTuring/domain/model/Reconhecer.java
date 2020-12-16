package main.modulos.MaquinaTuring.domain.model;

import java.util.ArrayList;

public class Reconhecer {

	public boolean reconhecer(String palavra, ArrayList<String> config,String path) {

		boolean reconhece = false;

		ArrayList<Transicao> listaTransicao = new ArrayList<>();

		// caminho para leitura do arquivo de configuração da máquina
		ArrayList<String> arquivo = Arquivo.lerArquivo(path);

		Maquina maquinadeTuring = new Maquina();

		maquinadeTuring.setEstadoIni(arquivo.get(0));
		maquinadeTuring.setEstadoFim(arquivo.get(1));
		maquinadeTuring.setIniFita(arquivo.get(3));
		maquinadeTuring.setFimFita(arquivo.get(2));

		int cont = 7; // arquivotransições começa depois do 7

		// contagem do arquivo (separação por virgulas)
		while (cont < arquivo.size()) {

			Transicao transicao = new Transicao();

			String[] loc = arquivo.get(cont).split(","); // ponteiro que vai colocar em cada array

			transicao.setDe(loc[0]); // estado inicial
			transicao.setPara(loc[4]); // proximo estado
			transicao.setLido(loc[1]); // le o caracter
			transicao.setGravar(loc[2]); // proximo caracter
			transicao.setDirecao(loc[3]); // para onde o cabeçote vai andar

			listaTransicao.add(transicao);

			cont++; // contador ate o final das linhas do arquivo
		}

		maquinadeTuring.setTransicao(listaTransicao);

		// recebe a fita
		maquinadeTuring.setFita(palavra);
		String fitaAux = maquinadeTuring.getFita();
		char[] fita = fitaAux.toCharArray();
		int cabecote = 0;
		String estado = maquinadeTuring.getEstadoIni();
		boolean terminou = false;

		while (terminou == false) {

			Transicao transicaoaux = new Transicao();

			int aux = 0;
			boolean encerrar = false;
			// System.out.println(maquinadeTuring.getTransicao().size());

			// checagem dos caracteres dentro da fita
			while (aux < maquinadeTuring.getTransicao().size() && encerrar == false) {
				Transicao tr = maquinadeTuring.getTransicao().get(aux);
				if (tr.getDe().equals(estado) && tr.getLido().equals(String.valueOf(fita[cabecote]))) {
					transicaoaux = tr;
					encerrar = true;
					config.add(tr.getDe() + "," + tr.getLido() + "," + String.valueOf(fita[cabecote]) + ",D," + transicaoaux.getPara());
				}
				aux++;
			}

			estado = transicaoaux.getPara();

			// anda o cabeçote (verifica se a palavra foi aceita ou não)
			if (encerrar != false)
				fita[cabecote] = transicaoaux.getGravar().charAt(0);

			if (transicaoaux.getDirecao().equals("D") && cabecote < fita.length) {
				cabecote++;
			} else if (transicaoaux.getDirecao().equals("E") && cabecote != 0) {
				cabecote = cabecote - 1;
			}

			if (encerrar == false) {
				terminou = true;
				reconhece = false;
			} else if (estado.equals(maquinadeTuring.getEstadoFim())) {
				terminou = true;
				reconhece = true;
			} else if (cabecote == -1) {
				terminou = true;
				reconhece = true;
			}
		}
		return reconhece;
	}

}

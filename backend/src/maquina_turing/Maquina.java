package maquina_turing;

import java.util.ArrayList;

public class Maquina {
	private String fita; // fita
	private String iniFita; // início da fita
	private String fimFita; // final da fita
	private String estadoIni; // estado inicial
	private String estadoFim; // estado final
	private ArrayList<Transicao> transicao; // transição da máquina

	public Maquina() {
		fita = "";
		iniFita = "";
		fimFita = "";
		estadoIni = "";
		estadoFim = "";
		transicao = new ArrayList<>();
	}

	public String getFita() {
		return fita;
	}

	public void setFita(String fita) {
		this.fita = getIniFita() + fita + getFimFita();
	}

	public String getIniFita() {
		return iniFita;
	}

	public void setIniFita(String iniFita) {
		this.iniFita = iniFita;
	}

	public String getFimFita() {
		return fimFita;
	}

	public void setFimFita(String fimFita) {
		this.fimFita = fimFita;
	}

	public String getEstadoIni() {
		return estadoIni;
	}

	public void setEstadoIni(String simboloIncial) {
		this.estadoIni = simboloIncial;
	}

	public String getEstadoFim() {
		return estadoFim;
	}

	public void setEstadoFim(String simboloFinal) {
		this.estadoFim = simboloFinal;
	}

	public ArrayList<Transicao> getTransicao() {
		return transicao;
	}

	public void setTransicao(ArrayList<Transicao> transicao) {
		this.transicao = transicao;
	}
}

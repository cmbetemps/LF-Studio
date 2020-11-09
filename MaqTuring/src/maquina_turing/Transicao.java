package maquina_turing;

public class Transicao {
	private String de;
	private String para;
	private String lido;
	private String gravar;
	private String direcao;

	public Transicao() {
		de = "";
		para = "";
		lido = "";
		direcao = "";
		gravar = "";
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public String getLido() {
		return lido;
	}

	public void setLido(String lido) {
		this.lido = lido;
	}

	public String getGravar() {
		return gravar;
	}

	public void setGravar(String gravar) {
		this.gravar = gravar;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

}
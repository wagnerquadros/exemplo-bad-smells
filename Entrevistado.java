/**
 * Classe que representa os participantes do questionário.
 * @author System.out.print Inc.
 *
 */

public class Entrevistado{
	
	private String genero;
	private String idade;
	private String escolaridade;
	private String regiao;
	private String tecnologia;
	private String area;
	
	
	//Contrutor===========================================================================================================
	public Entrevistado(String genero, String idade, String escolaridade, String regiao, String tecnologia, String area) {
		
		super();
		this.genero = genero;
		this.idade = idade;
	    this.escolaridade = escolaridade;
		this.regiao = regiao;
		this.tecnologia = tecnologia;
		this.area = area;
		
	}
		
	//Genero=============================================
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	//Idade==============================================
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}

	//Escolaridade=======================================
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	//Região=============================================
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	//Tecnologia=========================================
	public String getTecnologia() {
		return tecnologia;
	}
	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	//Area===============================================
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	//toString===========================================
	@Override
	public String toString() {
		return "Entrevistado [genero=" + genero + ", idade=" + idade + ", escolaridade=" + escolaridade + ", regiao="
				+ regiao + ", tecnologia=" + tecnologia + ", area=" + area + "]";
	}
	
	
}
package Usaveis;

public class Arma extends Item {
	private TipoArma tipo;

	public Arma(TipoArma tipo, String chave) { /*
												 * mudei os parametros anteriores para receber o TipoArma tipo de cada
												 * arma, que já sabe as especificidades de cada uma
												 */
		super(chave);
		this.tipo = tipo;

	}

	public int getDano() {
		return tipo.danosataque;
	} 

	public int getAlcance() {
		return tipo.alcance; //usar futuramente em InimigoAlcancavel()
	}

	public boolean getDestrutivel() {
		return tipo.destrutivel;
	}
	
	public String toString(){
		return tipo.nome;
		
	}

}
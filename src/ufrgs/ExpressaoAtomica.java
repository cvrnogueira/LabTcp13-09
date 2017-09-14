package ufrgs;

import java.util.Map;

public class ExpressaoAtomica implements ExpressaoLogica{

	private String variavel;
	
	public ExpressaoAtomica(String variavel){
		this.variavel = variavel;
	}
	public boolean eval(Map<String, Boolean> valoresVariaveis) {
		return valoresVariaveis.get(variavel);
	}
	public String getVariavel(){
		return variavel;
	}
	@Override
	public String toString(){
		return variavel;
	}
}

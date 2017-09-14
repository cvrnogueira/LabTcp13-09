package ufrgs;

public class ExpressaoAtomica implements ExpressaoLogica{

	private String variavel;
	
	public ExpressaoAtomica(String variavel){
		this.variavel = variavel;
	}
	public String getVariavel(){
		return variavel;
	}
	@Override
	public String toString(){
		return variavel;
	}
}

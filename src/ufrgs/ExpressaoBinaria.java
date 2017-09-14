package ufrgs;

public abstract class ExpressaoBinaria implements ExpressaoLogica {
	private ExpressaoLogica op1;
	private ExpressaoLogica op2;
	
	public ExpressaoBinaria(ExpressaoLogica op1, ExpressaoLogica op2){
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public ExpressaoLogica getExpLogicaUm(){
		return op1;
	}
	public ExpressaoLogica getExpLogicaDois(){
		return op2;
	}
	
}

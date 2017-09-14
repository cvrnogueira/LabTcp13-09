package ufrgs;

public abstract class ExpressaoUnaria implements ExpressaoLogica {
	private ExpressaoLogica op1;
	
	public ExpressaoUnaria(ExpressaoLogica op1){
		this.op1 = op1;
	}
	
	public ExpressaoLogica getExpLogicaUm(){
		return op1;
	}

}

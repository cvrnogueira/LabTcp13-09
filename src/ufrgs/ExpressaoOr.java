package ufrgs;

public class ExpressaoOr extends ExpressaoBinaria{
	
	public ExpressaoOr(ExpressaoLogica op1, ExpressaoLogica op2) {
		super(op1, op2);
	}
//	public boolean eval (Map <String, boolean> vv) {
//		
//		//agr implementa o and
//		
//	}
	@Override
	public String toString() {
		return  "(" + super.getExpLogicaUm() + " v " + super.getExpLogicaDois() + ")";
	}
}

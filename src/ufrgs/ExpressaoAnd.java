package ufrgs;

public class ExpressaoAnd extends ExpressaoBinaria {

	
	public ExpressaoAnd(ExpressaoLogica op1, ExpressaoLogica op2) {
		super(op1, op2);
	}
//	public boolean eval (Map <String, boolean> vv) {
//		
//		//agr implementa o and
//		
//	}
	@Override
	public String toString() {
		return  "(" + super.getExpLogicaUm() + " ^ " + super.getExpLogicaDois() + ")";
	}
	
}

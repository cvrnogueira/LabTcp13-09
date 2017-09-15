package ufrgs;

import java.util.Map;

public class ExpressaoOr extends ExpressaoBinaria{
	
	public ExpressaoOr(ExpressaoLogica op1, ExpressaoLogica op2) {
		super(op1, op2);
	}
	public boolean eval (Map <String, Boolean> valoresVariaveis) {
		return (getExpLogicaUm().eval(valoresVariaveis) || getExpLogicaDois().eval(valoresVariaveis));
	}
	@Override
	public String toString() {
		return  "(" + getExpLogicaUm() + " v " + getExpLogicaDois() + ")";
	}
}

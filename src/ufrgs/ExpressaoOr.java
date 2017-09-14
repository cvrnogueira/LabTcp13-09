package ufrgs;

import java.util.Map;

public class ExpressaoOr extends ExpressaoBinaria{
	
	public ExpressaoOr(ExpressaoLogica op1, ExpressaoLogica op2) {
		super(op1, op2);
	}
	public boolean eval (Map <String, Boolean> valoresVariaveis) {
		return (valoresVariaveis.get(super.getExpLogicaUm()) || valoresVariaveis.get(super.getExpLogicaDois()));
	}
	@Override
	public String toString() {
		return  "(" + super.getExpLogicaUm() + " v " + super.getExpLogicaDois() + ")";
	}
}

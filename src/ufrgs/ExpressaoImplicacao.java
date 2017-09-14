package ufrgs;

import java.util.Map;

public class ExpressaoImplicacao extends ExpressaoBinaria {
	
	public ExpressaoImplicacao(ExpressaoLogica op1, ExpressaoLogica op2) {
		super(op1, op2);
	}
	public boolean eval(Map<String, Boolean> valoresVariaveis) {
		
		if((valoresVariaveis.get(super.getExpLogicaUm()) == true) && (valoresVariaveis.get(super.getExpLogicaDois()) == false)) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public String toString() {
		return  "(" + super.getExpLogicaUm() + " --> " + super.getExpLogicaDois() + ")";
	}
}

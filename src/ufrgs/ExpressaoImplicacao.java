package ufrgs;

import java.util.Map;

public class ExpressaoImplicacao extends ExpressaoBinaria {
	
	public ExpressaoImplicacao(ExpressaoLogica op1, ExpressaoLogica op2) {
		super(op1, op2);
	}
	public boolean eval(Map<String, Boolean> valoresVariaveis) {
		
		if((getExpLogicaUm().eval(valoresVariaveis) == true) && (getExpLogicaUm().eval(valoresVariaveis) == false)) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public String toString() {
		return  "(" +getExpLogicaUm() + " --> " + getExpLogicaDois() + ")";
	}
}

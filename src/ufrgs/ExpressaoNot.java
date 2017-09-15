package ufrgs;

import java.util.Map;

public class ExpressaoNot extends ExpressaoUnaria {

	public ExpressaoNot(ExpressaoLogica exp) {
		super(exp);
	}
	public boolean eval (Map <String, Boolean> valoresVariaveis) {

		return !(getExpLogicaUm().eval(valoresVariaveis));
	}
	@Override
	public String toString() {
		return "not(" + getExpLogicaUm() + ")";
	}

}

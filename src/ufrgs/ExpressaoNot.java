package ufrgs;

import java.util.Map;

public class ExpressaoNot extends ExpressaoUnaria {

	public ExpressaoNot(ExpressaoLogica exp) {
		super(exp);
	}
	public boolean eval (Map <String, Boolean> valoresVariaveis) {
		return !(valoresVariaveis.get(super.getExpLogicaUm()));
	}
	@Override
	public String toString() {
		return "not(" + super.getExpLogicaUm() + ")";
	}

}

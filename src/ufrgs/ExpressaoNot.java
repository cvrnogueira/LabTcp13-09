package ufrgs;

public class ExpressaoNot extends ExpressaoUnaria {

	public ExpressaoNot(ExpressaoLogica exp) {
		super(exp);
	}
	@Override
	public String toString() {
		return "not(" + super.getExpLogicaUm() + ")";
	}

}

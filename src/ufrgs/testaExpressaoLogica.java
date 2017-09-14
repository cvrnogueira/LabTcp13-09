package ufrgs;


public class testaExpressaoLogica {
	
	public static void main(String args[]){

		ExpressaoLogica pt1 = new ExpressaoImplicacao((new ExpressaoOr(new ExpressaoAtomica ("A"),  new ExpressaoAtomica ("B"))), (new ExpressaoAnd(new ExpressaoAtomica ("C"), new ExpressaoAtomica("A"))));
		ExpressaoLogica pt2 = new ExpressaoOr( new ExpressaoAnd(new ExpressaoNot(new ExpressaoAtomica ("B")), new ExpressaoAtomica("C")), (new ExpressaoAnd(new ExpressaoAtomica("A"), new ExpressaoAtomica("D")))); 
		ExpressaoLogica teste = new ExpressaoImplicacao(pt1, pt2);
				
		System.out.println(teste.toString()); //((A v B) ‐‐> (C ^ A)) ‐‐> ((not B) ^ C) V (A ^ D))
//		exp.eval ({"A": true, "B" : false}) ;
//		
	}
}



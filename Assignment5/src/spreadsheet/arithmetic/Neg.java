package spreadsheet.arithmetic;

import spreadsheet.Expression;
import spreadsheet.arithmetic.Arithmetic;

public final class Neg extends Arithmetic {
	
	private int exp;
	
	public Neg (final Expression operand) {
		this.exp = operand.toInt() * (-1);
	}
	
	@Override
	public int evaluate() {
	 return exp;
	}
	
}

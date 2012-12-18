package spreadsheet.arithmetic;

import spreadsheet.arithmetic.Arithmetic;

public final class AConst extends Arithmetic {
	
	private int constant;
	
	public AConst(final int expression) {
		constant = expression;
	}
	
	@Override
	public int evaluate() {
		return this.constant;
	}
}

package spreadsheet.arithmetic;

import spreadsheet.Expression;
import spreadsheet.arithmetic.Arithmetic;

public final class Add extends Arithmetic {
	
	private int value;
	
	public Add(final Expression firstOperand, 
      		   final Expression secondOperand) {
		value = firstOperand.toInt() 
				+ secondOperand.toInt();
		}
	
	@Override
	protected int evaluate() {
		return value;
	}
}

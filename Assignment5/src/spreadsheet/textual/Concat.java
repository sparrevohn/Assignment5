package spreadsheet.textual;

import spreadsheet.Expression;

public final class Concat extends Textual {

	private String string;
	
	public Concat(final Expression firstOperand,
			      final Expression secondOperand) {
		string = firstOperand.toString() 
				 + secondOperand.toString();
	}
	
	@Override
	protected String evaluate() {
		return string;
	}

}

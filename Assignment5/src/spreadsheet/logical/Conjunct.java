package spreadsheet.logical;

import spreadsheet.Expression;

public final class Conjunct extends Logical {

	private boolean bool;
	
	public Conjunct(final Expression firstOperand,
			        final Expression secondOperand) {
		bool = (firstOperand.toBoolean() &&
			    secondOperand.toBoolean());
	}
	
	@Override
	protected boolean evaluate() {
		return bool;
	}

}

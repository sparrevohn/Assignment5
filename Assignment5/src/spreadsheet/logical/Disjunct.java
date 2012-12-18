package spreadsheet.logical;

import spreadsheet.Expression;

public final class Disjunct extends Logical {

	private boolean bool;
	
	public Disjunct(final Expression firstOperand,
			        final Expression secondOperand) {
		bool = (firstOperand.toBoolean() ||
			    secondOperand.toBoolean());
	}
	
	@Override
	protected boolean evaluate() {
		return bool;
	}

}

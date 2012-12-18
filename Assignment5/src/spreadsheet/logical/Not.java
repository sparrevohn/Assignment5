package spreadsheet.logical;

import spreadsheet.Expression;

public final class Not extends Logical {
	
	private boolean bool;
	
	public Not(final Expression operand) {
		bool = !operand.toBoolean();
	}
	
	@Override
	protected boolean evaluate() {
		return bool;
	}
	
}

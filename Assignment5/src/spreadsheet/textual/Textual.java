package spreadsheet.textual;

import spreadsheet.Expression;

public abstract class Textual extends Expression {

	@Override
	public boolean toBoolean() {
		return (!evaluate().isEmpty());
	}

	@Override
	public int toInt() {
		return evaluate().length();
	}

	@Override
	public String toString() {
		return this.evaluate();
	}
	
	protected abstract String evaluate();

}

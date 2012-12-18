package spreadsheet.arithmetic;

import spreadsheet.Expression;

public abstract class Arithmetic extends Expression {

	@Override
	public int toInt() {
		return this.evaluate();
	}
	
	@Override
	public String toString() {
		return Integer.toString(evaluate());
	}
	
	@Override
	public boolean toBoolean() {
		return (this.evaluate() != 0);
	}
	
	protected abstract int evaluate();
}
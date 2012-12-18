package spreadsheet.logical;

public final class LConst extends Logical {
	
	private boolean lconst;
	
	public LConst(final boolean expression) {
		lconst = expression;
	}
	
	@Override
	public boolean evaluate() {
		return this.lconst;
	}
}

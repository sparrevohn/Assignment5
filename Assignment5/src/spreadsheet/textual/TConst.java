package spreadsheet.textual;

public final class TConst extends Textual {
	
	private String tconst;
	
	public TConst(final String expression) {
		tconst = expression;
	}
	
	@Override
	public String evaluate() {
		return this.tconst;
	}
}

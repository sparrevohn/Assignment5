package spreadsheet;

public class CellReference extends Expression {

	private Spreadsheet sheet;
	private Position position;
	
	public CellReference(final Spreadsheet spread, final Position pos) {
		sheet = spread;
		position = pos;
	}
	
	@Override
	public boolean toBoolean() {
		return sheet.get(position).toBoolean();
	}
	
	@Override
	public int toInt() {
		return sheet.get(position).toInt();
	}

	@Override
	public String toString() {
		return sheet.get(position).toString();
	}

}

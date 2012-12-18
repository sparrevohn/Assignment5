package spreadsheet;

import java.util.ArrayList;

/** A singleton class representing a spreadsheet application.
 *
 * The instance is initialized on first mention of the class.
 */
public final class Application {

  private ArrayList<Spreadsheet> spreadsheets;
  private Spreadsheet worksheet;
  private ArrayList<String> sheetNames;
  
  public static final Application instance = new Application();

  private Application() {
    this.worksheet = new Spreadsheet();
    this.spreadsheets = new ArrayList<Spreadsheet>();
    this.spreadsheets.add(this.worksheet);
    this.sheetNames = new ArrayList<String>();
    this.sheetNames.add(this.worksheet.getName());
  }
  
  public Spreadsheet getWorksheet() {
	  return worksheet;
  }
  
  public void newSpreadsheet() {
	  spreadsheets.add(new Spreadsheet());
	  String str = spreadsheets.get(spreadsheets.size() - 1).getName();
	  sheetNames.add(str);
	  }
  
  public void changeWorksheet(final String name) 
  throws NoSuchSpreadsheetException {
	  for (Spreadsheet sheet : spreadsheets) {
		  if (sheet.equals(name)) {
			  worksheet = sheet;
		  return;
		  }
	  }
	  throw new NoSuchSpreadsheetException(name);
  }
  
  public Spreadsheet getSpreadsheet(final String name) 
  throws NoSuchSpreadsheetException {
	  for (Spreadsheet sheet : spreadsheets) {
		  if (name.equals(sheet.getName())) 
			return sheet;
	  }
	  throw new NoSuchSpreadsheetException(name);
  }
  
  public Iterable<String> listSpreadsheets() {
	  return sheetNames;
  }
  
  public void exit() {
    System.exit(0);
  }

}

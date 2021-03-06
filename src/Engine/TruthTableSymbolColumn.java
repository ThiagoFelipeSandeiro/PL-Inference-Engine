package Engine;

import java.util.ArrayList;
import java.util.HashMap;

public class TruthTableSymbolColumn {
	
	private ArrayList<Boolean> values; 
	private String symbol;
	
	
	public TruthTableSymbolColumn(String vSymbol) {
		symbol = vSymbol;
		values = new ArrayList<Boolean>();	
	}
	
	public void putValue(Boolean value) {
		values.add(value); 
		
	}
	
	public ArrayList<Boolean> getValues() {
		return values; 
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public void printValues() {
		for(Boolean value: getValues()) {
			System.out.print(value);
		}
	}
	
	

}



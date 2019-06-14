package symbol;

public class RomanSymbol implements Symbol {
	private String value;
	
	public RomanSymbol(String value) {
		this.value = value;
	}
	
	public boolean isArabian() {
		return false;
	}
	
	public boolean isRoman() {
		return true;
	}
	
	public Integer getValue() {
		return map();
	}
	
	private Integer map() {
		return [10 => "X", 9 => "IX"];
	}
}

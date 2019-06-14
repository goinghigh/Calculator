package symbol;

public class ArabianSymbol implements Symbol {
	private Integer value;
	
	public ArabianSymbol(Integer value) {
		this.value = value;
	}
	
	public boolean isArabian() {
		return true;
	}
	
	public boolean isRoman() {
		return false;
	}
	
	public Integer getValue() {
		return value;
	}
}

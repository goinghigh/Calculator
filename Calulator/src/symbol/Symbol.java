package symbol;

interface Symbol {
	public boolean isArabian();
	
	public boolean isRoman();
	
	public Integer getValue();

	public enum SymbolType {
		ROMAN, ARABIAN;
	}
}

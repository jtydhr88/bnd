package biz.aQute.r5.resource.filters;

public enum Operator {

	Equals("="), LessThanOrEqual("<="), GreaterThanOrEqual(">="), ApproxEqual("~=");

	private final String	symbol;

	Operator(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbol() {
		return symbol;
	}

}

final class Pair {
	final private String first;
	final private double second;
	public Pair(String f, double s) {
		first = f;
		second = s;
	}
	public String first() {
		return first;
	}
	public double second() {
		return second;
	}
	
	public String toString() {
		return "Pair[first="+ first  +
				", second=" + second + "]";
	}
}

public class Numbers {

	private final int number1;
	private final int number2;
	private OperationType calculationWanted;

	public Numbers(int number1, int number2, OperationType calculationWanted) {
		this.number1 = number1;
		this.number2 = number2;
		this.calculationWanted = calculationWanted;
	}

	public int getNumber1() {
		return number1;
	}

	public int getNumber2() {
		return number2;
	}

	public OperationType getCalculationWanted() {
		return calculationWanted;
	}

}

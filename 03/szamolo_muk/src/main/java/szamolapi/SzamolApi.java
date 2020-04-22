package szamolapi;

public class SzamolApi {
	public static double calculateResult(Szamol calculation) {
		switch (calculation.getOperator()) {
		case '+':
			return calculation.getLeftOperand() + calculation.getRightOperand();
		case '-':
			return calculation.getLeftOperand() - calculation.getRightOperand();
		case '*':
			return calculation.getLeftOperand() * calculation.getRightOperand();
		case '/':
			return calculation.getLeftOperand() / calculation.getRightOperand();
		}
		
		return Double.MIN_VALUE;
	}
}

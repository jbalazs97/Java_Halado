package Alk;

import szamolapi.Szamol;
import szamolapi.SzamolApi;

public class Alk {

	private static Szamol calc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (String string : args) {
			System.out.println(string);
		}
		
		calc = new Szamol();
		calc.setOperator(parseOperator(args[0]));
		
		calc.setLeftOperand(parseOperand(args[1]));
		
		
		double eredmeny = SzamolApi.calculateResult(calc);
		
		System.out.println("Eredmény " + eredmeny);
		
	}

	private static int parseOperand(String input) {
		int value = Integer.MIN_VALUE;
		try {
			value = Integer.parseInt(input);
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		return value;
	}

	private static char parseOperator(String input) {
		for (char c : input.toCharArray()) {
			switch (c) {
			case '+':
				return c;
			case '-':
				return c;
			case '*':
				return c;
			case '/':
				return c;
			default:
				return '*';
			}
		}
		
		return 'e';
	}
	
}

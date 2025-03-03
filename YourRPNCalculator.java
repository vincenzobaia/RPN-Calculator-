package template;

import java.util.ArrayList;

public class YourRPNCalculator implements SimpleRPNCalculator {
	// don't change these...
	YourStack theStack = null;
	
	public YourRPNCalculator(YourStack stack) {
		theStack = stack;
	}

	
	@Override
	public String calculate(String inputString) {
		ArrayList<String> tokens = RPNStringTokenizer.tokenize(inputString);
		if (tokens == null) return "Error: invalid expression";
		
		theStack = new YourArrayListStack();  // Reset stack
		
		for (String token : tokens) {
			if (isOperator(token)) {
				Integer b = theStack.pop();
				Integer a = theStack.pop();
				if (a == null || b == null) {
					return "Error: insufficient operands";
				}
				theStack.push(performOperation(a, b, token));
			} else {
				theStack.push(Integer.parseInt(token)); // for reading int as strings 
			}
		}
		
		Integer result = theStack.pop(); // pops first element 
		if (result == null || theStack.size() > 0) {
			return "Error: too many operands";
		}
		
		return result.toString(); //returns integer 
	}

	private boolean isOperator(String token) {
		return token.equals("+") || token.equals("-") || token.equals("*");
	}
	
	private Integer performOperation(Integer a, Integer b, String operator) {
		double x = a.doubleValue();// trying doubles 
    	double y = b.doubleValue();
    	double result;

		switch (operator) {
			case "+": return a + b;
			case "-": return a - b;
			case "*": return a * b;
			default: return null;
		}
	}
}

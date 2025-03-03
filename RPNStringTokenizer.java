package template;

import java.util.ArrayList;

public interface RPNStringTokenizer { // Added comments to outline purpose, makes it easier for me to look back at 
	public static ArrayList<String> tokenize(String expression) {
		//token list 
		ArrayList<String> tokens = new ArrayList<>();
		
		if (expression == null || expression.trim().isEmpty()) {
			return null;
		}
		
		String[] parts = expression.trim().split("\\s+");// gets rid of spaces 
		
		for (String token : parts) {
			if (token.equals("+") || token.equals("-") || //validates 
				token.equals("*") || token.equals("/")) {
				tokens.add(token);
			}
			else {
				try {
					Integer.parseInt(token);
					tokens.add(token);
				} catch (NumberFormatException e) {
					return null;
				}
			}
		}
		if (tokens.isEmpty()) { //returns list 
			return null;
		} else {
			return tokens;
		}
	}
	private static boolean isNum(String token) {
        try {
            Integer.parseInt(token);// checks integer first 
            return true;
        } catch (NumberFormatException e1) {
            try {
                Double.parseDouble(token); //trying to parse as double 
                return true;
            } catch (NumberFormatException e2) {
                return false; 
            }
        }
    }
}

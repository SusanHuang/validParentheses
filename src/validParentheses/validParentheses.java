package validParentheses;

public class validParentheses {
	public static boolean isValid(String s) {
		int length = s.length();
		// If the length of the string is 1 or less there
		// exists no pairing.
		if(length <= 1) 
			return false;
		
		// If the length of the string is not even there
		// exists some unpaired symbol.
		if(length % 2 != 0)
			return false;
		
		// Initial check of the characters in the string
		int j = 0;
		while(j < length) {
			switch(s.charAt(j)) {
				case '(':
				case ')':
				case '{':
				case '}':
				case '[':
				case ']':
					break;
				default:
					return false;
			}
			j++;
		}
		
		int i = 0;
		char firstChar = ' ';
		while(i < length){
			// If the character is in an even index set firstChar
			if((i & 1) == 0) {
				firstChar = s.charAt(i);
			}
			// If the character is an odd index check for matching pairs
			else{
				switch(s.charAt(i)) {
				case ')':
					if(firstChar == '(')
						break;
				case '}':
					if(firstChar == '{')
						break;
				case ']':
					if(firstChar == '[')
						break;
				default:
					return false;
				}
			}
			i++;
		}
		return true;
	}
}

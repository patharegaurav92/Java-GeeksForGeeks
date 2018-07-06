package SearchRecursiveSubString;

public class RecursiveSubString {

	public static void main (String[] args) throws java.lang.Exception
	{
		char text[] = { 't', 'h', 'i', 's', 'i', 's', 'a', 't', 'e', 's', 't', 't', 'e', 'x', 't' };
		char pat[] = { 't', 'e', 's', 't' };
		System.out.println("TestSort.main() find " + recursiveSubStringSearch(pat, text, 0, 0));
	}

	private static boolean recursiveSubStringSearch(char[] pat, char[] text, int patIndex, int textIndex) {
	
		if(patIndex >= pat.length){ // when pattern array reaches the end of the array. PATTERN MATCHED.
			return true;
		}
		if(textIndex >= text.length){ // when text array reaches the end of the array. PATTERN NOT MATCHED
			return false;
		}
		if(pat[patIndex]== text[textIndex]){ // Increment both the array if index values matches.
			return recursiveSubStringSearch(pat, text, ++patIndex, ++textIndex);
		}
		if(patIndex!=0){ // as pattern was not matched from previous if condition, revert back to index 0 of pattern and call recursive to check. 
			return recursiveSubStringSearch(pat, text, 0, textIndex);
		}
		return recursiveSubStringSearch(pat, text, 0 , ++textIndex); 
		
	}
}

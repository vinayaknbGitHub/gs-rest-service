package hello;

public class WordDetails {

    private final String word;
    private final boolean palindrome;
    private final boolean anagramOfPalindrome;
	public WordDetails(String word, boolean palindrome, boolean anagramOfPalindrome) {
		super();
		this.word = word;
		this.palindrome = palindrome;
		this.anagramOfPalindrome = anagramOfPalindrome;
	}
	public String getWord() {
		return word;
	}
	public boolean isPalindrome() {
		return palindrome;
	}
	public boolean isAnagramOfPalindrome() {
		return anagramOfPalindrome;
	}
	
	
    
    
    
    
    
}
    

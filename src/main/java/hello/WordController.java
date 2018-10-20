package hello;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {
    // TODO Implement the /words/{word} endpoint
    
     @RequestMapping("/words")
    public WordDetails words(@RequestParam(value="word") String word) {
    	boolean palindrome=false;
    	boolean anagramOfPalindrom=false;
    	
    	if(isReverse(word)) {
    		palindrome=true;
    		if(canMakePalindrome(word)) {
    			anagramOfPalindrom=true;
    		}
    	}else {
    		if(canMakePalindrome(word)) {
    			anagramOfPalindrom=true;
    		}
    	}
        return new WordDetails(word,palindrome,anagramOfPalindrom);
    }

	public  boolean canMakePalindrome(String name) {
		// TODO Auto-generated method stub
		
		Set<Character> oddLetters = new HashSet<>();
		
		for (char c : name.toCharArray()) {
			if(!oddLetters.remove(c)) {
				oddLetters.add(c);
				
			}
			
		}
		return oddLetters.size()<=1;
	}

	public  boolean isReverse(String name) {
		// TODO Auto-generated method stub
		return name.equals(new StringBuffer(name).reverse().toString());
	}

    
    
}

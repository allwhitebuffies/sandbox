import java.util.Arrays;


public class ConvertToGoatLatin {
	
	public static String applyVowelRule(String token) {
		
		// if word begins with vowel
		char ch = token.charAt(0);
		String chStr = Character.toString(ch);
		String newStr = "";
		
		if (chStr.matches("[aA]|[eE]|[iI]|[oO]|[uU]")) {
			newStr = token.substring(1);
			token = newStr + chStr;
		}
		
		return token;
		
	}
	
	public static String applyNi(String token) {
		
		return token = token + "ni";

	}
	
	public static String applyJ(String token, int i) {
			for (int j = 1; j <= i ; j++) {
				token = token + "j";
			}
			return token;
	}
	
	
	
	public void convert(String goatLatin) {
		
		// assume we can split on spaces
		String words[] = goatLatin.split(" ");		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hello oliver apple ardvark elephant 123 omg lol Annabelle Ee a A oooH";
		
		// assuming we split on spaces
		String[] strArray = str.split(" ");
		
		for (int i = 0; i < strArray.length ; i++) {
			
			strArray[i]  = applyVowelRule(strArray[i]);
			strArray[i]  = applyNi(strArray[i]);
			strArray[i]  = applyJ(strArray[i], i+1);	

		}
		
		System.out.println(Arrays.deepToString(strArray));
		
		

	}

}

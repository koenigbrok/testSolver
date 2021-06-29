package solverFour.solverFour;

public class codingBat {

	public String  oneTwo(String str) {
		
		int stringLength = str.length();
	boolean okToBeTrialed = 	str.length() % 3 ==0;
		
		//if(str.length() < 3 ||  (str.length() % 3 ==0)) {
		//char first = str.charAt(0);
		//str =  str.substring(1,3) + first;
		
		
		for(int i = 0; i < str.length(); i++) {
			
		if(i%3 == 0) {
		String nextTwo = "";
		String chunkOfThree  ="";
		String toBeReplaced  = "";
		

		if(i+3 > str.length() ) {
			
			 nextTwo ="";
			 chunkOfThree  = "";
			 toBeReplaced  = str.substring(i);
				str = str.replace(toBeReplaced, chunkOfThree);
			 
		}else {
			nextTwo = str.substring(i+1, i+3);
			 chunkOfThree  = nextTwo + str.substring(i, i+1);
			 toBeReplaced  = str.substring(i, i+3);
				str = str.replace(toBeReplaced, chunkOfThree);			 
			
					}}} 		
		return str;
		
	}
	

	//azbcp zpp    azbcp zp
	//01234 567    01234 56
	

	public String zipZap(String str) {
		
		for(int i = 0; i < str.length()-2; i++) {
		
		String chunkOfThree = str.substring(i, i+3);
		String  firstCharOfChunk = chunkOfThree.substring(0, 1);
		String  secondCharOfChunk = chunkOfThree.substring(2);
		
		
		if( chunkOfThree.substring(0,1).equals("z") && chunkOfThree.substring(2).equals("p") ) {
		
			char midOfChunk = str.charAt(i+1);
			String space = "";
			//chunkOfThree = chunkOfThree.replace(midOfChunk, space.charAt(i));
			chunkOfThree = chunkOfThree.substring(0, 1) + chunkOfThree.substring(2);
			
			String restOfString = str.substring(i+3);
			String beginingOfString = str.substring(0, i);
			
			str = beginingOfString +chunkOfThree + restOfString;
				}
			}
		return str;
	}
	
	//stringy* â†’ string
	//starOut("*stringy") â†’ "tringy"
	
//	public String starOut(String str) {
//		
//		int lastIndex = str.length() -1;
//		
//		
//		if(str.length() <  2 && str.charAt(0)=='*') {
//			str = str.substring(1);
//			return str;
//			
//		}
//		
//		if(str.charAt(lastIndex)=='*') {
//			str = str.substring(0, lastIndex-1);
//			return str;
//		}
//		
//		//sm*eil*ly -> siy
//		
//		String before = "";
//		for(int i = 0; i < str.length(); i++) {
//			char testFirstStar = str.charAt(i);
//			char testSecondStar = str.charAt(i+1);
//
//			
//			if(testFirstStar=='*' && testSecondStar!='*') {
//			
//				if(i <=1 ) {
//					//before =  "";
//				}else {
//					//before = before + str.substring(0, i-1);
//				}
//				String after = str.substring(i+2);
//				before = before + after;
//		
//			}
//			
//			else if(testFirstStar=='*' && testSecondStar=='*'){
//			//	before = before + str.substring(0, i-1);
//				String after = str.substring(i+3);
//				str = before + after;
//			}
//			else if(testFirstStar!='*' && testSecondStar!='*'){
//				before = before + str.substring(i, i+1);
//			}
//			
//			
//		}
//		return str;
//	}
	
	
	
	
	
//	//sm*eil*ly -> siy
public String starOut2(String str) {
	
	 if(str.length()< 1 ) {
		 
		return"";
		
	}
	
	else if(str.length()<= 1 ) {
		if(str.charAt(0)=='*') {
		return"";
		}
	}

	else  if(str.length()<= 2 ) {
		if(str.charAt(0)=='*'|| str.charAt(1)=='*') {
		return"";
		}
	}
	else if(str.length()<= 3 ) {
		if(str.charAt(0)=='*'|| str.charAt(1)=='*'|| str.charAt(2)=='*') {
		return"";
		}
		
	}
	
	
	//else return str;
	
	//String finalString = "";
	String buildFirstPart =str.substring(0, 1);
	String buildSecondPart = "";
	String buildFinalString = "";
	String charecterAfter="";
	
	for(int i = 0; i < str.length(); i++) {
	//String thisCharecter = str.substring(i, i+1);
	char charAt = str.charAt(i);
	String charecterBefore = "";
	if(i==0) {
		charecterBefore = str.substring(0, 1);
	}else {
		charecterBefore=str.substring(i-1, i);
	
		
	}if(str.length() >= i +2) {
	 charecterAfter = str.substring(i+1, i+2);
	}
	else if(str.length()< i+  2)
	{charecterAfter = "";}
	
	

	
	
	if(charAt =='*') {
		//buildFirstPart = buildFirstPart+  str.substring(0, i-2);
		//buildSecondPart =str.substring(i+2);
		
		//buildFinalString =  buildFinalString ;
		//finalString = buildFirstPart + buildSecondPart;
				
	}else if(charecterAfter.equals("*") && charAt!='*') {
		//buildFirstPart = buildFirstPart +str.substring(0, i );
		//buildSecondPart = str.substring(i+ 3);
		//finalString = buildFirstPart + buildSecondPart;
		
	}else if ((charAt !='*') && !charecterAfter.equals("*") && !charecterBefore.equals("*")
	) {
		//buildFirstPart =  buildFirstPart+ str.substring(i, i+1);
		//buildSecondPart = str.substring(i);
		
		buildFinalString = buildFinalString + charAt;
		
	}
	else if ((charAt !='*') &&  charecterBefore.equals("*")) {
		buildFirstPart =  buildFirstPart+ str.substring(i+1, i+2);
		buildSecondPart = str.substring(i+1);
		
	}
	//buildFinalString = buildFirstPart + buildSecondPart;
	}
	
	
		return buildFinalString;
}

//Given a string and a non-empty word string,
//return a version of the original String where all chars have been replaced
//by pluses ("+"), except for appearances of the word string which are preserved unchanged.
//
//
//plusOut("12xy34", "xy") â†’ "++xy++"
//plusOut("12xy34", "1") â†’ "1+++++"
//plusOut("12xy34xyabcxy", "xy") â†’ "++xy++xy+++xy"	
//plusOut("abXYabcXYZ", "abc") â†’ "++++abc+++"


public String plusOut(String str, String word) {

	String testSring ="";
	String buildString ="";
	String plusString = "";
	int i = 0;

	while( i <= str.length() ) {
		
		if(i <= str.length()-word.length()) {
		testSring = str.substring(i, i + word.length());
		
		if(testSring.equals(word)) {
			 buildString = buildString + testSring;
			 i = i+ (word.length() );
		}
		
		else  
		{ buildString =  buildString + "+" ;
		i++;}
		}
		
		else if (i== str.length()){
			i++;
			//buildString =  buildString + "+" ;
			break;
		}
		else if (i > str.length()){
			buildString =  buildString + "+" ;
			break;
		}
		else if (i== str.length()-1){
			buildString =  buildString + "+" ;
			break;
		}

		else  
		{ buildString =  buildString + "+" ;
		i++;}
	}
		
	
	return buildString;
}



//Given a string and a non-empty word string, 
//return a string made of each char just before and just after every appearance of 
//		the word in the string. Ignore cases where there is no char before or after the 
//		word, and a char may be included twice if it is between two words.
//
//
//wordEnds("abcXY123XYijk", "XY") â†’ "c13i"
//wordEnds("XY123XY", "XY") â†’ "13"
//	assertEquals( "cxz11", codingBat.wordEnds("abc1xyz11", "1"));	


public String wordEnds(String str, String word) {
	
	String charBefore = "";
	String charAfter = "";
	String stringBuilder = "";
	
	
	for(int i = 0; i< str.length(); i++) {
		 if(str.length()<=2 ) {
			return "" ;}
		 else if(i <= str.length()-word.length()) {
		String stringUnderTest = str.substring(i, i+ word.length());
		
	
		if ( stringUnderTest.contentEquals(word) && i >= str.length()-word.length()) {
			charBefore = str.substring(i- 1, i);
			//charAfter = str.substring(i+2);
		
			stringBuilder = stringBuilder+ charBefore ;
			
			break;
		}
		
		else if( stringUnderTest.contentEquals(word) && i >=word.length()) {
			charBefore = str.substring(i- 1, i);
			charAfter = str.substring(i+word.length(), i + word.length() +1);
			stringBuilder = stringBuilder+ charBefore + charAfter;
			if (stringUnderTest.length() == word.length() &&charAfter.equals(word)) {
				stringBuilder = stringBuilder+  charAfter;
			}
			i = i +word.length() ;
		}else if(stringUnderTest.contentEquals(word) && i <word.length()) {
			//charBefore = str.substring(i- 1, i);
			charAfter = str.substring(i+2, i + 3);
			
			stringBuilder = stringBuilder+ charBefore + charAfter;
		
		}
		
		}
	
		
		
		else break;
		 
	}
	
	return stringBuilder;
}
	
}

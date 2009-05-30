package cn.openlab.ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test {

	public static void main(String[] args) {
		System.out.println(getWordCount("hello"));
		Pattern p = Pattern.compile("");
		Matcher m = p.matcher("");
		m.groupCount();
	}
	
    private static int getWordCount(String sentence) {
        int count = 0;
        String[] wordsWithoutBlank = sentence.split(" ");
        if(wordsWithoutBlank != null) {
            for(int i = 0; i < wordsWithoutBlank.length; i++) {
                String wordWithoutBlank = wordsWithoutBlank[i];
                String[] wordsWithoutComma = wordWithoutBlank.split(",");
                if(wordsWithoutComma != null) {
                    for(int j = 0; j < wordsWithoutComma.length; j++) {
                        String wordWithoutComma = wordsWithoutComma[j];
                        String[] wordsWithoutDot = wordWithoutComma.split(".");
                        count += wordsWithoutDot.length;
                    }
                }
            }
        }
        return count;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cn.openlab.ui;

import java.util.ArrayList;

/**
 *
 * @author johnny
 */
public class StringParser {

    private String sentence;
    private char[] spliters;

    public StringParser(String sentence) {
//        this(sentence, new String[]{" ", ",", "."});
        this.sentence = sentence;
        spliters = new char[]{' ', ',', '.'};
    }

    public StringParser(String sentence, char[] spliters) {
        this.sentence = sentence;
        this.spliters = spliters;
    }

    public int getWordsCount() {
        int count = 0;
        int start = 0;
        for(int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if(coutains(c)) {
                String s = sentence.substring(start, i);
                if(s != null && !"".equals(s))
                    count++;
                start = i + 1;
            }
        }
        return count;
    }

    private boolean coutains(char c) {
        for(int i = 0; i < spliters.length; i++) {
            if (spliters[i] == c) {
                return true;
            }
        }
        return false;
    }

    public int getSignCount() {
        int count = 0;
        for(int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if(c == ',' || c == '.') {
                count++;
            }
        }
        return count;
    }
}

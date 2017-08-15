import java.io.*;

class reverse {
    
    public static String reverseWord(String str){
        int start=0, end=0, length;
        length = str.length();
        char[] s = str.toCharArray();
        
        reverseString(s, 0, length-1);
        while(end < length){
            if(s[end] != ' '){
                start = end;
                while(end < length && s[end] != ' '){
                    end++;
                }
                end--;
                reverseString(s, start, end);
            }
            end++;
        }
        return new String(s);
    }
    
    public static void reverseString(char[] s, int start, int end){
        char temp;
        while(start < end){
            temp = s[start];
            s[start]=s[end];
            s[end]=temp;
            start++; end--;
        }
    }
    
    public static void main (String[] args) {
	String test = "This is a test, and run";
	String s = reverseWord(test);
	System.out.println(s);
    }
}

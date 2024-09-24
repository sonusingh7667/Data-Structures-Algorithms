package Recursion;

public class Str_Problem_06 {

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char charCurr = str.charAt(idx);
        if(map[charCurr-'a']==true){
            removeDuplicates(str,idx+1,newStr,map);
        }
        else {
            map[charCurr-'a'] = true;
            removeDuplicates(str,idx+1,newStr.append(charCurr), map);
        }
    }

    public static void main(String[] args){
        String str = "appnnacollage";
        removeDuplicates(str,0,new StringBuilder(""), new boolean[26]);
    }
}

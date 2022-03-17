package code.basic;

import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        String code = "code";
        StringBuffer buffer = new StringBuffer(code);
        System.out.print(buffer.reverse());
    }
}

class StringCharSequence {
    public static void main(String[] args) {
        String code = "code";
        char[] array = code.toCharArray();
        char[] array_rev = new char[array.length];
        for(int index = array.length -1, reverse_index = 0; index >= 0; index --, reverse_index ++){
            array_rev[reverse_index] = array[index];
        }
        System.out.println(array_rev);
    }

}

class StringCharSequenceOptimized {
    public static void main(String[] args) {
        String code = "coder";
        char[] array = code.toCharArray();
        for (int index = 0, mirroredIndex = array.length - 1; index < mirroredIndex; index++, mirroredIndex--) {
            char temp = array[index]; 
            array[index] = array[mirroredIndex]; 
            array[mirroredIndex] = temp;
      }
      System.out.println(array);
            
    }

}


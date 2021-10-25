
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();             
        TreeMap<Character,Integer> treeMap = new TreeMap<>();
        Integer count;
        // name = name.replaceAll(" ", "");
        for(int i =0; i< name.length(); i++){
            if(treeMap.containsKey(name.charAt(i))){
                count = treeMap.get(name.charAt(i));
                treeMap.put(name.charAt(i), ++count);
            } else {
                treeMap.put(name.charAt(i) , 1);
            }
        }
        int max = -1;
        Character maxChar = '\0';
        for(Map.Entry<Character, Integer> entry : treeMap.entrySet()){
            if(max < entry.getValue()){
                max = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.print(maxChar + " " + max);
    }
}

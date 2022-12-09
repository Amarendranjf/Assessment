package day12;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Client {
	
    public static List<List<String>> groupAnagram(String[] strs) {
    	
    	List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
        	
        	char str[] = strs[i].toCharArray();
            Arrays.sort(str);
            String x = String.valueOf(str);
            
            if(map.get(x)!=null) {
            	
                List<String> y = map.get(x);
                y.add(strs[i]);
                map.put(x, y);
                
            }
            
            else {
            	 
                List<String> z = new ArrayList<>();
                z.add(strs[i]);
                map.put(x, z);
                
            }
        }
        
        for(Map.Entry<String, List<String>> p:map.entrySet()) {
        	
            res.add(p.getValue());
            
        }
        return res;
    }
    
    public static void main (String[] args) {
    	
    	int n;  
    	Scanner sc=new Scanner(System.in);  
    	System.out.print("Enter the number of elements you want to store: ");  
    	n=sc.nextInt();
    	
    	String[] array = new String[n];  
    	System.out.println("Enter the elements of the array: ");  
    	for(int i=0; i<n; i++) {  
    		
    	array[i]=sc.next();
    	
    	}  
    	
        List<List<String>> res = groupAnagram(array);
        System.out.println(res);
        
    }

}
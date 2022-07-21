package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    //adds up the elements from a whose indexes are specified by b
    public int Task1(List<Integer> a, List<Integer> b){
        int sum = 0;
        //iterate through b extracting all indexes and using them to access elements from a
        for (int i = 0; i < b.size(); i++) {
            if(b.get(i)<=a.size()-1){
                sum += a.get(b.get(i));
            }
        }
        return sum;
    }
    public List<String> Task2(List <String> list){
        String temp = "";
        int count= 0;
        //List <String> newList = new ArrayList<String>();
         for(String y:list){
            System.out.println(y);
        }
        for(String fCharacters : list ){
            
            if(fCharacters.length()==0){
                list.remove(fCharacters);
            }else{
                temp = fCharacters.substring(1); //get all the characters after the first character
                list.set(count, temp); //Replace element with new string
            }
            count +=1;
        }
        for(String x:list){
            System.out.println(x);
        }
        
        return list;
    }
}


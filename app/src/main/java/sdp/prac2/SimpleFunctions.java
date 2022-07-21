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
    // PotentiallyJen g20s1217
    public List<Integer> Task6(List<Integer> a, List<Integer> b ){
        //rounds up each number in the list to the next-highest multiple of 100. If a number is already a multiple of 100, it is left unchanged
        int middleMan = -1;
        for (int i = 0; i < a.size(); i++){
            //iterate through list a checking each item for the above criteria
            middleMan = a.get(i);
            if(middleMan % 100 == 0){
                b.add(middleMan);
            } 
            else{
                b.add(middleMan % 100 + middleMan);
            }
        }
        return b;
    }
}


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
    } // ← Jen forgot to add this. 

    //Returns true if an integer list is sorted (ascending order)
    public Boolean Task5(List<Integer> list) {
        Boolean isSorted = true;
        int pos = 0;
        if (list.size() == 0 || list.size() == 1) {
            return isSorted;
        }
        else {
            while (pos < list.size()-1 && isSorted) {
                if (list.get(pos) > list.get(pos+1)) {
                    isSorted = false;
                }
                pos++;
            }
            return isSorted;
        }
    }

    /**
     * Multiplies the elements in the first list in sequential order, with the elements of 
     * another list in reversing order.
     * @param a: the list to be multiplied sequentially
     * @param b: the list to be multiplied in reverse
     * @return the products of these lists
     */
    public List<Integer> Task4(List<Integer> a, List<Integer> b) {
        if (a.size() != b.size()) return null;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            result.add(a.get(i) * b.get(b.size() - i - 1));
        }

        return result;
    }
    public List<String> Task2(List <String> list){
        String temp = "";
        int count= 0;
        //List <String> newList = new ArrayList<String>();
       
        for(String fCharacters : list ){
            
            if(fCharacters.length()==0){
                list.remove(fCharacters);
            }else{
                temp = fCharacters.substring(1); //get all the characters after the first character
                list.set(count, temp); //Replace element with new string
            }
            count = count +1;
        }
        
        return list;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
    }
=======
 

>>>>>>> g20c1611

>>>>>>> 1cb0e47eefd0c497a227da2f98c331e947ab0eab
}




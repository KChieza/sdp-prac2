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
            result.add(a.get(i) * b.get(b.size() - i));
        }

        return result;
    }
}


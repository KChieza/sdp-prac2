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
}


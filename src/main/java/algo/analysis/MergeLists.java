package algo.analysis;

import java.util.ArrayList;
import java.util.List;

public class MergeLists {
    public List<Integer> merge(List<Integer> list1, List<Integer> list2){
        int n1 = list1.size();
        int n2 = list2.size();
        int i = 0, j = 0;
        int size = n1+n2;
        List<Integer> res = new ArrayList<>(size);
        while(i < n1 && j < n2){
            if(list1.get(i) <= list2.get(j)){
                res.add(list1.get(i));
                i++;
            }
            else{
                res.add(list2.get(j));
                j++;
            }
        }

        while(i < n1){
            res.add(list1.get(i));
            i++;
        }

        while(j < n2){
            res.add(list2.get(j));
            j++;
        }
        return res;
    }
}

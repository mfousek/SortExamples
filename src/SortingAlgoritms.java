import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SortingAlgoritms {

    public List<String> MergeSortResursive(List<String> input) {

        if(input.size() > 1) {
            int mid = input.size() / 2;
            List<String> leftList = MergeSortResursive(input.subList(1, mid));
            List<String> rightList = MergeSortResursive(input.subList(mid +1,input.size()));

            input = Merge(leftList, rightList);
        }


        return input;
    }

    public List<String> Merge(List<String> leftList, List<String> rightList) {

        ArrayList<String> mergedList = new ArrayList<>();
        while (leftList.size() > 0) {
            while (rightList.size() > 0) {

                if (leftList.get(0).compareTo(rightList.get(0)) <= 0) {
                    mergedList.add(leftList.get(0));
                    leftList.remove(0);
                } else {
                    mergedList.add(rightList.get(0));
                    rightList.remove(0);
                }
            }

            if(rightList.size() == 0 && leftList.size() > 0){
                mergedList.add(leftList.get(0));
                leftList.remove(0);
            }
        }

        if(rightList.size() > 0){
            mergedList.addAll(rightList);
        }

        return mergedList;
    }
}

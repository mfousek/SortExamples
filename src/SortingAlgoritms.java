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


        return leftList;

    }
}

import junit.framework.TestCase
import org.junit.Assert
import org.junit.Test

class SortingAlgoritmsTests extends TestCase {

    @Test
    public void testSort(){
        SortingAlgoritms sAl = new SortingAlgoritms();
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("Bob");
        testArray.add("Tom");
        testArray.add("Sam");
        List<String> sortedList = sAl.MergeSortResursive(testArray);

        assertTrue(helperIsListSorted(sortedList));
    }

    @Test
    public void testMergeWithOneElement(){
        SortingAlgoritms sAl = new SortingAlgoritms();
        ArrayList<String> testLeftArray = new ArrayList<String>();
        ArrayList<String> testRightArray = new ArrayList<String>();

        testLeftArray.add("Tom");
        testRightArray.add("Bob");

        assertTrue(helperIsListSorted(sAl.Merge(testLeftArray, testRightArray)));
    }

    @Test
    public void testMergeWithTwoElement(){
        SortingAlgoritms sAl = new SortingAlgoritms();
        ArrayList<String> testLeftArray = new ArrayList<String>();
        ArrayList<String> testRightArray = new ArrayList<String>();

        testLeftArray.add("Tom");
        testLeftArray.add("Zed")
        testRightArray.add("Bob");
        testRightArray.add("Jim");

        List<String> expectedArray = new ArrayList<>();
        expectedArray.add("Bob");
        expectedArray.add("Jim");
        expectedArray.add("Tom");
        expectedArray.add("Zed");

        assertEquals(sAl.Merge(testLeftArray, testRightArray), expectedArray);
    }

    @Test
    public void testHelperIsSortedReturnsTrue(){
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("Bob");
        testArray.add("Sam");
        testArray.add("Tom");

        assertTrue(helperIsListSorted(testArray));
    }


    @Test
    public void testHelperIsSortedReturnsFalse(){
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("Tom");
        testArray.add("Bob");
        testArray.add("Sam");

        assertFalse(helperIsListSorted(testArray));
    }

    private boolean helperIsListSorted(List<String> input) {
        boolean returnValue = true;

        for(int i = 1; i < input.size(); i++) {

            if(input.get(i-1) > input.get(i)) {
                returnValue = false;
                break;
            }
        }

        return returnValue;
    }
}

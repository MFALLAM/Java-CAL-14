import java.util.ArrayList;
import java.util.List;

public class Play {

    public static ArrayList<Integer> getNewArray(ArrayList<Integer> array, int findNumber) {

        ArrayList<Integer> newArr = new ArrayList<>();

        if(!array.contains(findNumber)) {
            throw new RuntimeException("Argument " + findNumber + " does not exists in " + array + " array element is out of bounds");
        }

        if(array.get(array.size() - 1) == findNumber) {
            return new ArrayList<>();
        }

        for (int i = array.size() - 1; i > 0; i--) {
            if(array.get(i) == findNumber) {
                List temp = array.subList(i + 1, array.size());
                newArr.addAll(temp);
                return newArr;
            }
        }

        return newArr;
    }

    public static boolean checkArray(ArrayList<Integer> array) {
        if(array.contains(1) && array.contains(4)) {
            return true;
        } return false;
    }

}

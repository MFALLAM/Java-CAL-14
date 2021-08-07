import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1,3,7,5,4,3,4,1,2,9));

        ArrayList<Integer> hasOneOrFour = new ArrayList<>(Arrays.asList(5,3));

        System.out.println(Play.getNewArray(numbersList, 4));

        System.out.println(Play.checkArray(hasOneOrFour));

    }
}

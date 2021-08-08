import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestPlay {

    private static Stream<Arguments> streamDataNewArray() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList(1, 2, 4, 4, 2, 3, 4, 1, 7)), new ArrayList<>(Arrays.asList(1, 7))),
                Arguments.of(new ArrayList<>(Arrays.asList(1, 2, 4, 2, 3, 1, 7)), new ArrayList<>(Arrays.asList(2, 3, 1, 7))),
                Arguments.of(new ArrayList<>(Arrays.asList(1, 2, 4, 2, 3, 1, 4)), new ArrayList<>(Arrays.asList())),
                Arguments.of(new ArrayList<>(Arrays.asList(1, 2, 3)), new ArrayList<>(Arrays.asList()))
        );
    }

    @ParameterizedTest
    @MethodSource("streamDataNewArray")
    public void massTestNewArray(ArrayList<Integer> arg, ArrayList<Integer> expectedArray) {
        ArrayList<Integer> resultArray = Play.getNewArray(arg, 4);
        Assertions.assertArrayEquals(expectedArray.toArray(), resultArray.toArray());
    }


    private static Stream<Arguments> streamDataOfChecks() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList(1, 2, 4, 4, 2, 3, 4, 1, 7)), true),
                Arguments.of(new ArrayList<>(Arrays.asList(1, 2, 9, 4, 3, 5, 4)), true),
                Arguments.of(new ArrayList<>(Arrays.asList(1, 2, 9, 2, 3, 5, 7)), false)
        );
    }

    private static Stream<Arguments> streamData() {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new ArrayList<>(Arrays.asList(1, 3))));

        return list.stream();
    }

    @ParameterizedTest
    @MethodSource("streamDataOfChecks")
    public void massTestcheckArray(ArrayList<Integer> arg, boolean expectedArray) {
        boolean resultArray = Play.checkArray(arg);
        Assertions.assertEquals(expectedArray, resultArray);
    }

}

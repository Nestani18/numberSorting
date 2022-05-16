package sortingAlgorithm.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Detta kommer att hjälpa till att testa de inmatade siffrorna från minsta till största

public class SorterTest extends App {

    @Test
    @DisplayName("Simple sort arrays should work")
    void selectSort() {
        int[] in = {-2, 10, 3, 6, 15, -13};
        int[] result = {-13, -2, 3, 6, 10, 15};

        Assertions.assertArrayEquals(in, result);

    }

}

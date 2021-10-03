import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
class HelloWorldTest {

    HelloWorld underTest;

    @BeforeEach
    void setUp() {
        underTest = new HelloWorld();
    }

    @Test
    @DisplayName("Should pass when corrent input is specified")
    void itShouldSum() {
        int x = 10;
        int y = 11;
        int sum = underTest.sum(x, y);
        Assertions.assertEquals(21, sum);
    }
}
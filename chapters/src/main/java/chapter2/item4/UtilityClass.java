package chapter2.item4;

// Non-instantiable utility class (Page 19)
public class UtilityClass {
    // Suppress default constructor for non-insatiability
    private UtilityClass() {
        throw new AssertionError();
    }
}

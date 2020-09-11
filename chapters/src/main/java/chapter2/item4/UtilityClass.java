package chapter2.item4;

// Noninstantiable utility class (Page 19)
public class UtilityClass {
    // Suppress default constructor for non-instantiability
    private UtilityClass() {
        throw new AssertionError();
    }
}

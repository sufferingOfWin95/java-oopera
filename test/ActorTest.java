import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ActorTest {

    @Test
    void actorsWithSameDataAreEqual() {
        Actor a = new Actor("Иван", "Ладыгин", Gender.MALE, 187);
        Actor b = new Actor("Иван", "Ладыгин", Gender.MALE, 187);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void actorsWithDifferentHeightAreNotEqual() {
        Actor a = new Actor("Иван", "Ладыгин", Gender.MALE, 187);
        Actor b = new Actor("Иван", "Ладыгин", Gender.MALE, 190);
        assertNotEquals(a, b);
    }

    @Test
    void actorsWithDifferentLastNameAreNotEqual() {
        Actor a = new Actor("Иван", "Ладыгин", Gender.MALE, 187);
        Actor b = new Actor("Иван", "Бананов", Gender.MALE, 187);
        assertNotEquals(a, b);
    }

    @Test
    void actorsWithSameHeightButDifferentNamesAreNotEqual() {
        Actor a = new Actor("Иван", "Ладыгин", Gender.MALE, 180);
        Actor b = new Actor("Георгий", "Бананов", Gender.MALE, 180);
        assertNotEquals(a, b);
    }

    @Test
    void actorIsNotEqualToNullOrOtherType() {
        Actor a = new Actor("Иван", "Ладыгин", Gender.MALE, 187);
        assertFalse(a.equals(null));
        assertFalse(a.equals("Иван Ладыгин"));
    }
}
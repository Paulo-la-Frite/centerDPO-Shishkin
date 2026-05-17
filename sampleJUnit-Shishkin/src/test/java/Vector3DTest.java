import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

class Vector3DTest {

    @Test
    void isZeroVectorTest() {

        Vector3D zero = new Vector3D(0, 0, 0);
        Vector3D nonZero = new Vector3D(1, 0, 0);

        assertTrue(zero.isZeroVector());
        assertFalse(nonZero.isZeroVector());

    }

    @Disabled
    @Test
    void equalsTest() {

        Vector3D first = new Vector3D(1, 2, 3);
        Vector3D second = new Vector3D(1, 2, 3);

        assertTrue(first.equals(second));

    }

    @Test
    void scaleMultiplayTest() {

        Vector3D first = new Vector3D(1, 2, 3);
        Vector3D second = new Vector3D(4, 5, 6);

        double expected = 32.0;
        double actual = Vector3D.scaleMultiplay(first, second);

        assertEquals(expected, actual, 0.001);

    }

    @Test
    void getLengthTest() {

        Vector3D vector = new Vector3D(3, 4, 0);

        double expected = 5.0;
        double actual = vector.getLength();

        assertEquals(expected, actual, 0.001);

    }

    @Test
    void getYTest() {

        assertAll(() -> {
            assertEquals(-1, new Vector3D(1, -1, 4).getY(), 0.0);
            assertEquals(6, new Vector3D(1, 6, 4).getY(), 0.0);
            assertEquals(1.5, new Vector3D(1, 1.5, 4).getY(), 0.0);
        });

    }

    @org.junit.jupiter.api.Test
    void getX() {
    }

    @org.junit.jupiter.api.Test
    void getY() {
    }

    @org.junit.jupiter.api.Test
    void getZ() {
    }

    @org.junit.jupiter.api.Test
    void setX() {
    }

    @org.junit.jupiter.api.Test
    void setY() {
    }

    @org.junit.jupiter.api.Test
    void setZ() {
    }

    @org.junit.jupiter.api.Test
    void getLength() {
    }

    @org.junit.jupiter.api.Test
    void scaleMultiplay() {
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
    }
}
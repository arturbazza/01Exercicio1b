import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrdenacaoTest {

    @Test
    public void testBubbleSort() {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        Ordenacao.bubbleSort(array);
        int[] arrayOrdenado = {11, 12, 22, 25, 34, 64, 90};
        assertArrayEquals(arrayOrdenado, array);
    }
}

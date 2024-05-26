import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;


public class SILab2Test {

    @Test
    void testNullAllItems() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(null, 111);
        });
        assertEquals("allItems list can't be null!", exception.getMessage());
    }

    @Test
    void testEmptyAllItems() {
        List<Item> items = new ArrayList<>();
        assertTrue(SILab2.checkCart(items, 111));
    }

    @Test
    void testItemWithNullNameAndValidBarcode() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(null, "111", 111, 0));
        assertTrue(SILab2.checkCart(items, 111));
    }

    @Test
    void testItemWithEmptyNameAndValidBarcode() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("", "111", 111, 0));
        assertTrue(SILab2.checkCart(items, 111));
    }

    @Test
    void testItemWithValidNameAndNullBarcode() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("thingy", null, 111, 0));
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(items, 111);
        });
        assertEquals("No barcode!", exception.getMessage());
    }

    @Test
    void testItemWithInvalidBarcode() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("thinga", "12segr", 111, 0));
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(items, 111);
        });
        assertEquals("Invalid character in item barcode!", exception.getMessage());
    }

    @Test
    void testItemWithDiscountAndValidBarcode() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("hehehe", "1111", 111, 0.1f));
        assertTrue(SILab2.checkCart(items, 111));
    }

    @Test
    void testItemWithAdditionalDiscount() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("mlem", "1111", 301, 0.1f));
        assertTrue(SILab2.checkCart(items, 111));
    }

    @Test
    void testMultipleItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Man", "0123456789", 301, 0.1f));
        items.add(new Item("guy", "123456789", 111, 0));
        items.add(new Item("", "1111", 22, 0.2f));
        assertTrue(SILab2.checkCart(items, 150));
    }

    @Test
    void testSumGreaterThanPayment() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("hhh", "1111", 150, 0));
        items.add(new Item("nnng", "1111", 200, 0));
        assertFalse(SILab2.checkCart(items, 300));
    }
}
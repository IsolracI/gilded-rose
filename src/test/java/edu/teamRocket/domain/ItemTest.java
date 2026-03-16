package edu.teamRocket.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class ItemTest {

    @Test
    public void crearItem() {
        // ARRANGE

        //ACT
        Item item = new Item("+5 Dexterity Vest", 10, 20);

        // ASSERT
        assertEquals("+5 Dexterity Vest", item.getName());
        assertEquals(10, item.getSell_in(), 0);
        assertEquals(20, item.getQuality(), 0);
        System.out.println(item);
    }
}
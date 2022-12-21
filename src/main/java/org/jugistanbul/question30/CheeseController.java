package org.jugistanbul.question30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheeseController {


    private final List<Cheese> cheesesInStock = new ArrayList<>();
    /**
     * @return a list containing all of the cheeses in the shop,
     * or null if no cheeses are available for purchase.
     */
    public List<Cheese> getCheeses() {
        return cheesesInStock.isEmpty() ? Collections.emptyList()
                : cheesesInStock;
    }
}

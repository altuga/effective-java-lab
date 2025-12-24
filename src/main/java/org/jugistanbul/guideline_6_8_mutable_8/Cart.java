package org.jugistanbul.guideline_6_8_mutable_8;
import java.util.*;

public final class Cart {
 private final List<String> items = new ArrayList<>();

   public List<String> getItems() {
      // read-only view: callers cannot modify internals
        return Collections.unmodifiableList(items);
    }

    public void addItem(String item) {
        items.add(requireValid(item));
    }

    public void setItems(Collection<String> newItems) {
        // copy-in + validate each
        items.clear();
        for (String i : newItems) {
            items.add(requireValid(i));
        }
    }

    private String requireValid(String item) {
        if (item == null || item.length() <= 0) {
            throw new IllegalArgumentException("invalid item");
        }
        return item;
    }
}

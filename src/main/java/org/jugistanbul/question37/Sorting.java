package org.jugistanbul.question37;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * 1 - How do you transform current Exception in to IndexOutOfBoundsException -
 * Exception Translation :
 * Convert LowerLevelException to HigherLevelException
 *
 * @param <E> Type of the Element
 */
public class Sorting<E> {

    private static List myList = new ArrayList();

    /**
     *
     * @param index
     * @return
     * @Exception
     */
    public E get(int index) throws Throwable{
        ListIterator<E> i = myList.listIterator();
        try {
            return i.next();
        } catch (NoSuchElementException e) {
            //throw new IndexOutOfBoundsException("Index: " + index); // 3
            throw new IndexOutOfBoundsException("Index: " + index).initCause(e);
        }

    }

    public static void main(String[] args) {
        Sorting<String> sorting = new Sorting<String>();
        try {
            System.out.println(sorting.get(1910));
        } catch (Throwable e) {
            e.printStackTrace();
            System.err.println(e.getMessage() + " " +  e.getCause());
        }
    }


}

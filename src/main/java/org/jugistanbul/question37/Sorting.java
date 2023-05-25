package org.jugistanbul.question37;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 *  1 - How do you transform current Exception in to IndexOutOfBoundsException -
 *  Exception Translation :
 *  Convert LowerLevelException to HigherLevelException
 *
 * @param <E> Type of the Element
 */
public class Sorting<E> {

    private static List myList = new ArrayList();

    public void get(int index) throws Throwable{
        try {
            ListIterator<E> i = myList.listIterator();
             i.next();
        } catch(NoSuchElementException nseEx) {
            System.out.println(" " + nseEx);
            throw new IllegalArgumentException("hata var").initCause(nseEx);
        }

    }

    public static void main(String[] args) throws Throwable{
        Sorting<String> sorting = new Sorting<String>();
        sorting.get(9);
    }


}

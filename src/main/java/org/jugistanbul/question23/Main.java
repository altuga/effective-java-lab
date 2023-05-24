package org.jugistanbul.question23;


import java.util.EnumSet;

/**
 * TODO
 * 1 - Can you apply STYLE_BOLD and STYLE_STRIKETHROUGH at the same time ?
 * 2 - What are the alternative options other than working with INTEGERS ?
 */

public class Main {

    public static void main(String[] args) {
        PrintedWork printedWork = new PrintedWork();
        printedWork.applyStyles(PrintedWork.STYLE_BOLD | PrintedWork.STYLE_ITALIC);

        printedWork.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC, Style.ITALIC ));
    }
}

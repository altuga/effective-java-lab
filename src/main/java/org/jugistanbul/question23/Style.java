package org.jugistanbul.question23;

public enum Style {
     BOLD(1), ITALIC(2), UNDERLINE(4), STRIKETHROUGH(8);

     public int styleValue;
     Style(int styleValue) {
        this.styleValue = styleValue;
     }
 }
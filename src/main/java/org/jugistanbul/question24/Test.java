package org.jugistanbul.question24;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.*;

@Retention(RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
}
package org.jugistanbul.question26;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;


/*
TODO

1 - Measure working time
2 - Can you make this app faster ?


*/
public class Freq {

    public static void main(String[] args) {

        long start = System.nanoTime();
        primes().map(p -> TWO.pow(p.intValueExact()).subtract(ONE))
                .filter(mersenne -> mersenne.isProbablePrime(50))
                .limit(20)
                .forEach(System.out::println);

        long end = System.nanoTime();
        System.out.println(TimeUnit.MILLISECONDS.convert((end-start), TimeUnit.NANOSECONDS));

    }

    static Stream<BigInteger> primes() {
        return Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime);
    }


}

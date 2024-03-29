package org.jugistanbul.question25;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
TODO

1 - Run NerfBasic.java
2 - Any abnormality  ?
*/

public class NerfBasic {


    protected double range;
    protected int dartInRows;

    public NerfBasic(double range, int dartInRows) {
        this.range = range;
        this.dartInRows = dartInRows;
    }

    @Override
    public boolean equals(Object obj) {
        NerfBasic nerfBasic = (NerfBasic) obj;
        if (this == nerfBasic) return true;

        return Double.compare(nerfBasic.range, range) == 0 &&
                dartInRows == nerfBasic.dartInRows;
    }



    public int hashCode() {
        return Objects.hashCode(range * dartInRows);
    }

    @Override
    public String toString() {
        return "NerfBasic{" +
                "range=" + range +
                ", dartInRows=" + dartInRows +
                '}';
    }

    public static void main(String[] args) {
        Map<NerfBasic, String> m = new HashMap<>();

        NerfBasic nerfElite = new NerfBasic(4d, 6);
        NerfBasic nerfBasic = new NerfBasic(4d, 6);

        NerfBasic nerfUltra = new NerfBasic(8d, 5);

        m.put(nerfBasic, "Nerf Basic");
        m.put(nerfElite, "Nerf Elite");
        m.put(nerfUltra, "Nerf Ultra");
        System.out.println(m);

        System.out.println("  -->  " + m.get(new NerfBasic(4d, 6)));

    }


}

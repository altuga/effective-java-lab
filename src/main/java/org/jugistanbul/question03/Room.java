package org.jugistanbul.question03;


/**
 * Altug Bilgin Altintas
 * <p>
 * Effective Java Workshop
 */

public class Room {
    int numJunkPiles; // Number of junk piles in this room

    public Room(int numJunkPiles) {
        this.numJunkPiles = numJunkPiles;
    }



    public void finalizeMyVersion() {
        numJunkPiles = 0;
        System.out.println("GC calistirildi " + numJunkPiles);
    }
}

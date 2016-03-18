package Tentamen;

import java.util.Arrays;

/**
 * Created by jonatan on 2016-03-18.
 */
public class Shoe implements Comparable<Shoe> {
    private int size;
    private String type;

    public Shoe(int size, String type) {
        this.size = size;
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public int getSize() {
        return this.size;
    }

    public int compareTo(Shoe shoe) {
        return shoe.getType().compareTo(type);
    }

    public String toString() {
        return this.type + " med storleken " + this.size;
    }

    public static void main(String[] args) {
        Shoe s1 = new Shoe(39, "Sandal");
        Shoe s2 = new Shoe(45, "Strandsko");
        Shoe s3 = new Shoe(41, "Gymnastiksko");
        Shoe s4 = new Shoe(41, "Tennissko");
        Shoe[] shoes = {s1, s2, s3, s4};
        Arrays.sort(shoes);
        for (Shoe shoe : shoes) {
            System.out.println(shoe);
        }

    }
}

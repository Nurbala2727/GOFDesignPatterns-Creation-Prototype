package com.training.prototype.scrabbletiles;

/**
 * Created by adame on 1/11/2017.
 */
public class Tile implements Cloneable {
    String letter;
    Integer value;

    public Tile() {
    }

    public Tile(String letter, Integer value) {
        this.letter = letter;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "letter='" + letter + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Tile makeClone() {
        Tile newTile = new Tile();

        try {
            newTile = (Tile) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return newTile;
    }
}

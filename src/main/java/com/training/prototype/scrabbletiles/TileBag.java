package com.training.prototype.scrabbletiles;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adame on 1/11/2017.
 */
public class TileBag {
    public static void main(String[] args) {
        Tile tile1 = new Tile("A",1);
        List<Tile> tileBag = new ArrayList<>();

        tileBag.add(tile1);

        for(int i = 0; i < 6; i++) {
            tileBag.add(tile1.makeClone());
        }

        tileBag.forEach(tile->
            System.out.println(tile.toString() + "\n" + tile.hashCode())
        );

    }
}

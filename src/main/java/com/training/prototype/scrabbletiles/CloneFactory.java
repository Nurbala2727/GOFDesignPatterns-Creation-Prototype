package com.training.prototype.scrabbletiles;

/**
 * Created by adame on 1/11/2017.
 */
public class CloneFactory{
    public Tile cloneTile(Tile tile) {
        return tile.makeClone();
    }
}

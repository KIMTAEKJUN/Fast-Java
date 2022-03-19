package ch15;

import java.util.ArrayList;

public class Shelf {
    protected ArrayList<String> shelf;

    public Shelf() {
        shelf = new ArrayList<String>();
    }

    public ArrayList<String> GetShelf() {
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }
}

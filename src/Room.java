import jdk.internal.util.xml.impl.Pair;

import java.util.ArrayList;

/**
 * Created by bogdannitescu on 11/12/2017.
 */
public class Room extends Shape {
    private ArrayList<Pair> coordinates = new ArrayList<Pair>();
    public Room(ArrayList<Point> coordinates) {
        super(coordinates);
    }



}

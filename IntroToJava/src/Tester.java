import java.util.*;

public class Tester {


    /**
     * @param loc a map location
     * @return an encoded representation using a 16 bit int
     */
    static int locEncoder(MapLocation loc) {
        return (loc.x << 10) + ((loc.y + 1) << 4);
    }


    /**
     * @param enc an encoded coordinate from god's array
     * @return the corresponding map location
     */
    static MapLocation locDecoder(int enc) {
        int xDec = (enc & 0b1111110000000000) >> 10;
        int yDec = ((enc & 0b0000001111110000) >> 4) - 1;
        return new MapLocation(xDec, yDec);
    }


    public static void main(String[] args) throws Exception {
        
        System.out.println(Direction.CENTER);

    }
}
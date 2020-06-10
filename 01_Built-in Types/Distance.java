public class Distance {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double distance1 = Math.pow(Math.abs(x), 2);
        double distance2 = Math.pow(Math.abs(y), 2);

        double dist = Math.sqrt(distance1 + distance2);


        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }
}

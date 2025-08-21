public class Q7 {
    public static void main(String[] args) {
        double radiuskm = 6378.0;
        double radiusmiles = radiuskm * 0.621371;
        double volumekm = (4.0 / 3.0) * Math.PI * Math.pow(radiuskm, 3);
        double volumemiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusmiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumekm);
        System.out.println("The volume of earth in cubic miles is " + volumemiles);
    }
}

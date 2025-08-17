public class Q7EarthVolume {
    public static void main(String[] args) {
        double radius = 6378; 

        double volumeKm= (4.0 / 3.0) * Math.PI * Math.pow(radius,3);

        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radius*0.62, 3);

        System.out.printf("The volume of earth in cubic kilometers is " + volumeKm+" and cubic miles is " + volumeMiles3);
    }
}
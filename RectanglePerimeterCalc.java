public class RectanglePerimeterCalculator{
    static void calculatePerimeter(double length, double breadth){
        System.out.println("Perimeter : " + (2 * (length + breadth)));
    }
    public static void main(String args[]){
        calculatePerimeter(5.0, 3.0);
    }
}
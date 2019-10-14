/*write a programme to print an area and perimeter of rectangle test data width = 5.5 height = 8.5

 */


public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args) {

        float w = 5.5f;
        float h = 8.5f;
        double area = w * h;
        System.out.println("Area is " + w +" * " + h +" = " +area);
        double perimeter = 2 *( w + h);
        System.out.println("Perimeter is 2 * "+ "( " +w +" + " +h +" ) = " +perimeter);
    }

}

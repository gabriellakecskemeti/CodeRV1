package CodeRV1;

public class MyClass {

    //Exercise 2 and exercise 3
    //Solution for calculating rectangle area
    //

    public static int calcRectArea(int width, int height){
        int area= width*height;

        return area;
    }

    // Exercise4  calculation of area and perimeter of a square

    public static int[] calcSquare(int width){
        int area = MyClass.calcSquareArea(width);
        int perimeter= MyClass.calcSquarePerimeter(width);

        return new int[] {area, perimeter};
    }

    public static int calcSquareArea(int width){
        int area= width*width;

        return area;
    }

    public static int calcSquarePerimeter(int width){
        int perimeter= width*4;

        return perimeter;
    }

    //end of exercise 4


}

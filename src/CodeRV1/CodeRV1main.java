package CodeRV1;

public class CodeRV1main {

    //Exercise1
    //This is my Java class with main() method
    //

    public static void main(String[] args) {

        //more dimensional Array for storage of test data for rectangle calculation
        //lines are the set of data, columns are with and height

        int [] [] setOfArgs = {
                {20,30},
                {40,50},
                {9,11}
        };

        //usual array to store test data for square calculations
        int [] testSquare = { 3, 5, 7};


        System.out.println("Hi! Nice that you let run Gabriella's program today! ");
        System.out.println();

        //
        //Exercise3 and exercise 5  calling the method with several data sets, data is stored in array
        //
        System.out.println("Presentation of Rectangle solution");


        System.out.println("Single call of calcRectArea without using the test data from the array");
        System.out.println("Test data with= 8cm  and height=9cm,  the area in cm2:  " +new MyClass().calcRectArea(8,9));
        System.out.println();


        System.out.println("Using the Array for giving test data for calcRectArea");
        for( int x=0; x<3;x++) {
            System.out.print("Test data set"+(x+1)+"   with= "+setOfArgs[x][0]+   "   height=  "+ setOfArgs[x][1]);
            System.out.println("    Area in cm2:   " + new MyClass().calcRectArea(setOfArgs[x][0], setOfArgs[x][1]));
        }

        // End of presentation of Rectangle solution


        System.out.println();
        System.out.println("Presentation of solution for calculating area and perimeter of a square");

        int [] result;
        for( int i=0; i<3;i++) {
            System.out.print("Test data set"+(i+1)+"     with=  "+ testSquare[i]);
            result= new MyClass().calcSquare(testSquare[i]);
            System.out.println("    Area in cm2:   " + result[0]+ "   perimeter in cm:  "+ result[1]);
        }

        // End of presentation of solution for square
    }
}

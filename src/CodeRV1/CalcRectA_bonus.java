package CodeRV1;

/**
Java program accepts width and height  of a rectangular
as arguments passed to the main () method
**/

public class CalcRectA_bonus {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println("parameter" + (i + 1) + "   " + args[i]);
        }

        int with;

        int height;



        if (args.length != 2) {
            System.out.println("Only two Integer number can be accepted, please start the program again!");
        } else {

            if (checkMyInt(args[0]) && checkMyInt(args[0])) {
                with = Integer.parseInt(args[0]);
                height = Integer.parseInt(args[1]);
                System.out.println("    Area in cm2:   " + MyClass.calcRectArea(with, height));
            } else {
                System.out.println("This program works only if you enter two integer number! Please try again!");
            }
        }
    }


    //program checks the number of parameters and catch the failure if it is not a number

        public static boolean checkMyInt(String arg) {
            boolean thisIsNumber = false;
            try {
                int number = Integer.parseInt(arg);
                if (number==0){
                    System.out.println("The parameter for this calculation can not be 0");
                }else {
                    thisIsNumber = true;
                }
            } catch (Exception e) {
                System.out.println("This parameter is not an integer number:  " + arg);
            }

            return thisIsNumber;
        }

}

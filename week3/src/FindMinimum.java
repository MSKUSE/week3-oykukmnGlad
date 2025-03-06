public class FindMinimum {
    public static void main(String[]args){

        /*
        int length_of_args = args.length;

        if(length_of_args < 2){

            System.out.println("Enter 3 score!!!");

        }else{

            int grade1 = Integer.parseInt(args[0]);
            int grade2 = Integer.parseInt(args[1]);
            int grade3 = Integer.parseInt(args[2]);

            if(grade1 < grade2 && grade1 < grade3){
                System.out.println(grade1);
            }else if(grade2 < grade1 && grade2 < grade3){
                System.out.println(grade2);
            }else if(grade3 < grade1 && grade3 < grade2){
                System.out.println(grade3);
            }
        }
        */

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        boolean min_num1 = num1 < num2 && num1 < num3;
        boolean min_num2 = num2 < num3 && num2 < num1;

        int minimum = min_num1 ? num1: min_num2 ? num2: num3;

        System.out.println(minimum);
    }
}

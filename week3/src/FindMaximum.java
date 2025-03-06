public class FindMaximum {
    public static void main(String[]args){

        /*
        int length_of_args = args.length;

        if(length_of_args == 0 || length_of_args == 1){

            System.out.println("You should give two score!!!");

        }else{

            int grade1 = Integer.parseInt(args[0]);
            int grade2 = Integer.parseInt(args[1]);

            if(grade1 < grade2){
                System.out.println(grade2);
            }else if(grade1 > grade2){
                System.out.println(grade1);
            }else{
                System.out.println("There are same score!");
            }
        }
        */

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        boolean condition = num1 > num2;

        int greatest = condition ? num1 : num2;
        System.out.println(greatest);

    }
}

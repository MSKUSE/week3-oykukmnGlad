public class FindPrimes {
    public static void main(String[]args){

        int limit_num = Integer.parseInt(args[0]);

        for(int i = 2; i <= limit_num; i++){

            boolean isPrime = true;

            for (int j = 2; j < i; j++){

                if(i % j == 0){

                    isPrime = false;
                    break;

                }
            }
            if(isPrime){

                System.out.println(i);

            }
        }
    }
}

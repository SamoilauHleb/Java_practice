package ClassWork.CW5;

    class RecursionExample{
        int factorial(int n){
           if (n==1){
               return 1;
           }
           return factorial(n-1)*n;
        }

        public static void main(String[] args) {
            RecursionExample re = new RecursionExample();
            int f=re.factorial(3);
            System.out.println(f);
        }
    }





import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // BufferedReader always handles IO exception by itself
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//            int  j = Integer.parseInt(bufferedReader.readLine());

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        // Critical statement
        try{
//            int ans = 10/a; // fails when a is 0
//
//            int[] arr = new int[4];
//            for(int i=0;i<=4;i++){
//                System.out.println(arr[i]+" ");
//            }
//
        A obj = new A();
        obj.example();
    }
        catch (TsunamiException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception handled. Reason is"+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("We are out of bound exception");
        }
//        catch (ArithmeticException e){
//            System.out.println("Dividing by 0 not allowed");
//        }
        catch (NullPointerException e){
            System.out.println("This is a null Pointer exception");
        }
        // To handle the unknown exceptions
        // always use this at last of all catches
        catch (Exception e){
            System.out.println("This is the last exception "+e.getMessage());
        }
        //Final blocks always works
        finally {
            System.out.println("this is finally block, Even in tsunami it might work");
        }
        System.out.println(" Post try catch code : ");
    }
    static class A{
        public static void example() throws ArithmeticException, TsunamiException {
//            // we will not handle it here
            Scanner sc = new Scanner(System.in);
//            int a = sc.nextInt();
//            if(a == 0){
//                throw new ArithmeticException(" Because a is "+a);
//            }
//            int ans = 10/a;
//
//            int b = sc.nextInt();
//            if(b == 0){
//                throw new ArithmeticException(" Because b is "+b);
//            }
//            int ans1 = 10/b;
            int waterLevel = sc.nextInt();
            if(waterLevel > 100){
                throw  new TsunamiException("Tsunami has come");
            }
        }
    }
}
class TsunamiException extends Exception{
    public TsunamiException(String message){
        super(message);
    }
}
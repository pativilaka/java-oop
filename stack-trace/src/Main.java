import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        method1();

        System.out.println("End of program!");

    }

    public static void method1() {
        System.out.println("Start method 1");
        method2();
        System.out.println("End method 1");
    }

    public static void method2(){
        System.out.println("Start method 2");
        Scanner sc = new Scanner(System.in);

        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Position invalid!");
            e.printStackTrace();
            //sc.next(); //para dar tempo de acompanhar o programa
        }
        catch (InputMismatchException e){
            System.out.println("Please set a numeric value!");
        }

        System.out.println("End method 2");
        sc.close();
    }
}
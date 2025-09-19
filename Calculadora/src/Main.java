import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO A LA EVA CALCULADORA");
        try{
            System.out.println("Dime un numero");
            double numero1= sc.nextDouble();
            System.out.println("Dime otro numero");
            double numero2= sc.nextDouble();
            System.out.println("Ahora el operador");
            char operador=sc.next().charAt(0);
            switch (operador){
                case '+' -> System.out.println("Resultado: "+(numero1+numero2));
                case '-' -> System.out.println("Resultado: "+(numero1-numero2));
                case '*' -> System.out.println("Resultado: "+(numero1*numero2));
                case '/' -> System.out.println("Resultado: "+(numero1/numero2));
            }
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }





    }


}
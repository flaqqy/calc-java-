import java.util.Scanner; 

public class Test { 
    public static void main(String [] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Введи операцию(+, -, *, /): ");
       String age = scanner.nextLine();
       System.out.println("Введи первое число: ");
       int a = scanner.nextInt();
       System.out.println("Введи второе число: ");
       int b = scanner.nextInt();
       
        try{
            switch(age){
                case "+" :
                    float c1 = a + b;
                    System.out.println("Ваша число: " + c1);
                    break;
                case "-" : 
                    float c2 = a - b;
                    System.out.println("Ваше число: " + c2); 
                    break;
                case "*" : 
                    float c3 = a * b;
                    System.out.println("Ваше число: " + c3);
                    break;
                case "/" :
                    float c4 = a / b;
                    System.out.println("Ваше число: "+ c4); 
                    break;               
                default: 
                    System.out.println("Введена неверная операция");
                     
            }
             
        } finally{
            scanner.close();
        }    
    }
}
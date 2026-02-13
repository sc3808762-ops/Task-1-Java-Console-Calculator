
import java.util.Scanner;

public class openCalculator {

    Scanner sc = new Scanner(System.in);

    public int addition(int a,int b){

       return a+b;
    }

    public int subtraction(int a,int b){
        
        return a - b;
    }

     public int multiplication(int a,int b){
        
        return a * b;
    }

    public int division(int a,int b){

        if(b==0){
            System.out.println("Cannot divide by zero");
            return 0;
        }else{
             return a/b;
        }

       
    }



    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        openCalculator op1 = new openCalculator();

        System.out.println("----> Open Calculator <----");

        while(true){


            System.out.println(" + :- Addition.");
            System.out.println(" - :- Subtraction.");
            System.out.println(" * :- Multiplication.");
            System.out.println(" / :- Division..");
            System.out.println("Exit for Quit...");
            System.out.print("Enter The Choice Here :- ");
            char c = sc.next().charAt(0);

            if(c == 'E' || c == 'e'){
                System.out.println("Exiting Calcultor");
                return;
            }
            System.out.print("Enter The Number 1 :- ");
            int n1 = sc.nextInt();
            System.out.print("Enter The Number 2 :- ");
            int n2 = sc.nextInt();

            switch (c) {
                case '+':{

                    System.out.println("Addition :- "+op1.addition(n1, n2));
                    break;
                    
                }
                case '-':{
    
                    System.out.println("Subtraction :- "+op1.subtraction(n1, n2));
                    break;
                    
                } 
                case '*':{

                    System.out.println("Multiplication :- "+op1.multiplication(n1, n2));
                    break;
                    
                } 
                case '/':{

                    System.out.println("Division :- "+op1.division(n1, n2));
                    break;
                    
                }  
                default:
                    throw new AssertionError();
            }

           

        }
    }
}

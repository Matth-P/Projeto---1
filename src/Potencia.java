import java.util.Scanner;

public class Potencia {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite um valor para o número");
            int X = input.nextInt();
            int Y = 0;
            System.out.println("Digite um valor para a potência");
            Y = input.nextInt();
            while (Y < 0){
                System.out.println("Digite um novo valor para a potência");
                Y = input.nextInt();
                }             
            int X1 = 1;

                if (Y == 1){
                    X1 = X;
                    }
                else if (Y == 0){
                    X1 = 1; 
                    }          
                else{
                    while  (Y > 0){
                        X1 = X1 * X;
                        Y--;
                    }   
                }
            System.out.println("O valor da potenciação é " + X1 );
        }
    }
}

import java.util.Scanner;

public class Chat_bot1 {
    public static void main(String[] args){

         try (Scanner input = new Scanner(System.in)) {
            String nome;
             double idade;
             
             System.out.println("Olá, pode me chamar de Z, sou o chatbot que irá lhe ajudar no cadastro no Zet, o portal de comunicação instantânea entre cidadãos e governo.");
             System.out.println("Para começarmos, você poderia me dizer como gostaria de ser chamado?");
             nome = input.nextLine();

             System.out.println("Olá " + nome + ",é um prazer. Você pode me informar sua idade, por favor?");
             idade = input.nextDouble();

             if (idade >= 18){
                System.out.println("Vejo que você é maior de idade, então terá acesso a todas as funcionalidades do sistema…");

            }
        }

         




         
    }     
}
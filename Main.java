import java.util.Scanner;

public class Main {
  
    public static void menu(){
        System.out.println("\tBANCO DO MAR");
        System.out.println("1. Dados");
        System.out.println("2. Conta");
        System.out.println("3. Ações");
        System.out.println("0. Encerrar");
    }

    public static void dados(){
       Scanner sc = new Scanner(System.in);
       String pessoas = "";
        System.out.println("Você entrou no método Dados.");
        System.out.println("Você é nosso funcionário[1] ou cliente[2]?");
        int pessoasInt = sc.nextInt();
        if (pessoasInt == 1) {
        pessoas = "funcinário";
          System.out.println("Certo, você é nosso " + pessoas);
    } else if (pessoasInt == 2) {
        pessoas = "cliente";
          System.out.println("Certo, você é nosso " + pessoas);
    }
    }
    
    public static void conta(){
      Scanner sc1 = new Scanner(System.in);
        System.out.println("Você entrou no método Conta.");
        System.out.println("Você ja possui conta conosco? [1] SIM [2]  NÃO: ");
      
    }
    
    public static void ações(){
        System.out.println("Você entrou no método Ações.");
    }
    
    
    public static void main(String[] args) {
        int encerrar;
        Scanner sc1 = new Scanner(System.in);
        
        do{
            menu();
            encerrar = sc1.nextInt();
            
            switch(encerrar){
            case 1:
                dados();
                break;
                
            case 2:
                conta();
                break;
                
            case 3:
                ações();
                break;
                
            default:
                System.out.println("Programa encerrado.");
            }
        } while(encerrar != 0);
    }
}
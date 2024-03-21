import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        
    for (int i = 0; i < 10; i++){
        System.out.println("Digite o nome " + (i + 1) + ":");
        nomes[i] = scanner.nextLine();

    }

    for (String nome: nomes){
        System.out.println(nome);
    }

        scanner.close();
    }
}
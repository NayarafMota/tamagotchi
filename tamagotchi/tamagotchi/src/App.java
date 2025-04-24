import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Tamagotchi pet = new Tamagotchi("Bicho Grilo", "Crocodilo", 1); // Criar o pet uma vez
        play(pet);
        menu(pet);
    }

    // Método para executar as ações iniciais com o pet
    public static void play(Tamagotchi pet){
        System.out.println("Meu neco Tamagotchi");
        pet.mostrarStatus(); 
        pet.brincar();
        pet.dormir();
        pet.brincar();
        pet.mostrarStatus();
    }

    // Método que exibe o menu interativo
    public static void menu(Tamagotchi pet){
        Scanner scanner = new Scanner(System.in);
        char opcao;
        
        while (true) {
            System.out.println("\nSeu Tamagotchi!");
            System.out.println(" c- Criar/Recriar Tamagotchi;");
            System.out.println(" f- Alimentar Tamagotchi;");
            System.out.println(" p- Brincar com Tamagotchi;");
            System.out.println(" s- Dormir");
            System.out.println(" w- Acordar");
            System.out.println(" v- Ver como está");
            System.out.println(" x- Sair");
            System.out.print("Escolha uma ação: ");
            opcao = scanner.next().charAt(0);

            // Processa a escolha do usuário
            switch (opcao) {
                case 'c': // Criar/Recriar Tamagotchi
                    System.out.print("Digite o nome do Tamagotchi: ");
                    String nome = scanner.next();
                    System.out.print("Digite a espécie do Tamagotchi: ");
                    String especie = scanner.next();
                    System.out.print("Digite a idade do Tamagotchi: ");
                    int idade = scanner.nextInt();
                    pet = new Tamagotchi(nome, especie, idade); // Cria um novo Tamagotchi
                    pet.mostrarStatus();
                    break;

                case 'f': // Alimentar Tamagotchi
                    pet.alimentar();
                    break;

                case 'p': // Brincar com Tamagotchi
                    pet.brincar();
                    break;

                case 's': // Dormir
                    pet.dormir();
                    break;

                case 'w': // Acordar
                    pet.acordar();
                    break;

                case 'v': // Ver como está
                    pet.mostrarStatus();
                    break;

                case 'x': // Sair
                    System.out.println("Saindo do jogo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

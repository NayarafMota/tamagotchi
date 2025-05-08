import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Tamagotchi> pets = new ArrayList<>();
        Tamagotchi pet = new Tamagotchi("Bicho Grilo", "Crocodilo", 1); // Pet inicial
        pets.add(pet);

        play(pet);
        menu(pets);
    }

    public static void play(Tamagotchi pet){
        System.out.println("Meu neco Tamagotchi");
        pet.mostrarStatus(); 
        pet.brincar();
        pet.dormir();
        pet.brincar();
        pet.mostrarStatus();
    }

    public static void menu(ArrayList<Tamagotchi> pets){
        Scanner scanner = new Scanner(System.in);
        Tamagotchi pet = pets.get(0); // pet atual padrão
        char opcao;

        while (true) {
            System.out.println("\nSeu Tamagotchi: " + pet.getNome());
            System.out.println(" c- Criar novo Tamagotchi");
            System.out.println(" l- Listar todos os Tamagotchis");
            System.out.println(" e- Escolher Tamagotchi para interagir");
            System.out.println(" f- Alimentar Tamagotchi");
            System.out.println(" p- Brincar com Tamagotchi");
            System.out.println(" s- Dormir");
            System.out.println(" w- Acordar");
            System.out.println(" v- Ver como está");
            System.out.println(" x- Sair");
            System.out.print("Escolha uma ação: ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'c': // Criar novo Tamagotchi
                    System.out.print("Digite o nome do Tamagotchi: ");
                    String nome = scanner.next();
                    System.out.print("Digite a espécie do Tamagotchi: ");
                    String especie = scanner.next();
                    System.out.print("Digite a idade do Tamagotchi: ");
                    int idade = scanner.nextInt();
                    Tamagotchi novo = new Tamagotchi(nome, especie, idade);
                    pets.add(novo);
                    pet = novo;
                    System.out.println("Novo Tamagotchi criado!");
                    pet.mostrarStatus();
                    break;

                case 'l': // Listar todos
                    System.out.println("\nLista de Tamagotchis:");
                    for (int i = 0; i < pets.size(); i++) {
                        Tamagotchi t = pets.get(i);
                        System.out.println("[" + i + "] " + t.getNome() + " - " + t.getEspecie() + " - " + t.getIdade() + " anos");
                    }
                    break;

                case 'e': // Escolher um Tamagotchi
                    System.out.print("Digite o número do Tamagotchi para usar: ");
                    int idx = scanner.nextInt();
                    if (idx >= 0 && idx < pets.size()) {
                        pet = pets.get(idx);
                        System.out.println("Agora interagindo com: " + pet.getNome());
                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;

                case 'f':
                    pet.alimentar();
                    break;

                case 'p':
                    pet.brincar();
                    break;

                case 's':
                    pet.dormir();
                    break;

                case 'w':
                    pet.acordar();
                    break;

                case 'v':
                    pet.mostrarStatus();
                    break;

                case 'x':
                    System.out.println("Saindo do jogo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

public class Tamagotchi {
    private String nome;
    private String especie;
    private int idade; // Alterado de String para int
    private int felicidade;
    private int fome;
    private boolean estaDormindo;

    public Tamagotchi(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;  // Mantém o tipo int
        this.felicidade = 70;
        this.fome = 50;
        this.estaDormindo = false;
    }

    public void alimentar() {
        if (estaDormindo) {
            System.out.println(nome + " está mimindo e não pode papar agora.");
        } else {
            fome -= 20;
            if (fome < 0) fome = 0;
            System.out.println("Você alimentou " + nome + ". Fome agora está em " + fome + ".");
        }
    }

    public void brincar() {
        if (estaDormindo) {
            System.out.println(nome + " está mimindo e não quer brincar agora.");
        } else {
            felicidade += 15;
            fome += 10;
            if (felicidade > 100) felicidade = 100;
            if (fome > 100) fome = 100;
            System.out.println("Você brincou com " + nome + "! Felicidade: " + felicidade + ", Fome: " + fome);
        }
    }

    public void dormir() {
        if (!estaDormindo) {
            estaDormindo = true;
            System.out.println(nome + " foi mimir. Zzz...");
        } else {
            System.out.println(nome + " já está mimindo.");
        }
    }

    public void acordar() {
        if (estaDormindo) {
            estaDormindo = false;
            System.out.println(nome + " acordou! Bom dia!");
        } else {
            System.out.println(nome + " já está acordado.");
        }
    }

    public void mostrarStatus() {
        System.out.println("\n Status de " + nome + ":");
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Felicidade: " + felicidade);
        System.out.println("Fome: " + fome);
        System.out.println("Está mimindo? " + (estaDormindo ? "Sim" : "Não"));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isEstaDormindo() {
        return estaDormindo;
    }

    public void setEstaDormindo(boolean estaDormindo) {
        this.estaDormindo = estaDormindo;
    }
}

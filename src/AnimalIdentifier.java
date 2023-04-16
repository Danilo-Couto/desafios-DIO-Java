import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnimalIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String AN1,AN2,AN3;
        System.out.println("Digite um reino");
        AN1 = sc.nextLine();
        System.out.println("Digite uma especie");
        AN2 = sc.nextLine();
        System.out.println("Digite uma dieta");
        AN3 = sc.nextLine();

        Animal aguia = new Animal("aguia", "vertebrado", "ave", "carnivoro");
        Animal pomba = new Animal("pomba", "vertebrado", "ave", "onivoro");
        Animal homem = new Animal("homem", "vertebrado", "mamifero", "onivoro");
        Animal vaca = new Animal("vaca", "vertebrado", "mamifero", "herbivoro");
        Animal pulga = new Animal("pulga", "invertebrado", "inseto", "hematofago");
        Animal lagarta = new Animal("lagarta", "invertebrado", "inseto", "herbivoro");
        Animal sanguessuga = new Animal("sanguessuga", "invertebrado", "anelideo", "hematofago");
        Animal minhoca = new Animal("minhoca", "invertebrado", "anelideo", "carnivoro");

        List<Animal> listAnimals = new ArrayList<>(Arrays.asList(aguia, pomba, homem, vaca, pulga, lagarta, sanguessuga, minhoca));

        for (Animal animal : listAnimals) {
            if (animal.getRealm().equals(AN1) && animal.getSpecie().equals(AN2) && animal.getEat().equals(AN3)) {
                System.out.println(animal.getName());
                break;
            }
        }
    }

    public static class Animal {
        private String name;
        private String realm;
        private String specie;
        private String eat;

        public Animal(String name, String realm, String specie, String eat) {
            this.name = name;
            this.realm = realm;
            this.specie = specie;
            this.eat = eat;
        }

        public String getName() { return name;}
        public String getRealm() { return realm;}
        public String getSpecie() { return specie;}
        public String getEat() { return eat;}
    }
}
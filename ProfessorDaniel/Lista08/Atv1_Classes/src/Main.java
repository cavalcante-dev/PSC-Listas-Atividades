import Classes.Animal;
import Classes.Carro;
import Classes.Geladeira;
import Classes.Pessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Kira", "Yoshikage", "165.152.659-01", "kiramorioh@gmail.com", 23);
        pessoa.falar();
        pessoa.dormir();

        Carro carro = new Carro("Monza", "Verde", "BMW", 4, 2);
        carro.acelerar();
        carro.acionarEmbreagem();
        carro.trocarMarcha();

        Animal animal = new Animal("Cachorro", "Herbivoro", "Caramelo", 1.10, 4);
        animal.andar();
        animal.comer();

    }
}
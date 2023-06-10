// todo:Crie uma classe Animal com os atributos nome e idade, e um método public void emitirSom() que imprime "O animal emitiu um som!".
//todo:Crie duas classes derivadas de Animal: Cachorro e Gato. Ambas as classes devem ter um método public void emitirSom() que imprime "O cachorro/gato latiu/miou!".
//todo:Em seguida, crie uma classe principal (Main) que instancia um objeto da classe Animal, um objeto da classe Cachorro e um objeto da classe Gato, e chama o método emitirSom() em cada um deles.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.nome = "Alex";
        animal.idade = 2;
        animal.especie = "Leao";
        animal.pelagem = "marrom";
        System.out.println(animal.nome);
        System.out.println(animal.idade);
        System.out.println(animal.especie);
        System.out.println(animal.pelagem);
        String string = new String();
        animal.emitirSom();
        System.out.println(animal.emitirSom());

        System.out.println("CACHORRO");
        Dog dog = new Dog();

        dog.nome = "Bolota";
        dog.idade = 3;
        dog.especie = "Pug";
        dog.pelagem = "marrom claro";
        System.out.println(dog.nome);
        System.out.println(dog.idade);
        System.out.println(dog.especie);
        System.out.println(dog.pelagem);
        dog.emitirSom();
        System.out.println(dog.emitirSom());


        System.out.println("GATO");
        Cat cat = new Cat();

        cat.nome = "Power";
        cat.idade = 1;
        cat.especie = "Siames";
        cat.pelagem = "branco e cinza";
        System.out.println(cat.nome);
        System.out.println(cat.idade);
        System.out.println(cat.especie);
        System.out.println(cat.pelagem);
        cat.emitirSom();
        System.out.println(cat.emitirSom());

    }
}
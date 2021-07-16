public class Animal
{
    public static void main(String[] args)
    {
        Rodent[] rodent = {new Mouse(), new Gerbil(), new Hamster()};

        for (Rodent r : rodent) {
            r.eat();
            r.jump();
            r.makeSound();
            r.run();
        }
    }
}
